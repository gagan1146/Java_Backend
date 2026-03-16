package com.gagan.userservice.services.impl;

import com.gagan.userservice.dto.Hotel;
import com.gagan.userservice.dto.Rating;
import com.gagan.userservice.entities.User;
import com.gagan.userservice.exceptions.DuplicateEmailException;
import com.gagan.userservice.exceptions.ResourceNotFoundException;
import com.gagan.userservice.repositories.UserRepository;
import com.gagan.userservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;
    public UserServiceImpl(UserRepository userRepository, RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public User saveUser(User user) {
        if(userRepository.existsById(user.getEmail())){
            throw new DuplicateEmailException("Email must be unique");
        }
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with the given id on server : " + userId));

        String urlRatings = "http://RATINGSERVICE/ratings/users/" + user.getUserId();
        List<Rating> responseRatings = new ArrayList<>();
        try {
            responseRatings = restTemplate.exchange(
                    urlRatings,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Rating>>() {}
            ).getBody();
        } catch (Exception e) {
            log.error("Error fetching ratings for user {}: {}", userId, e.getMessage());
        }

        if (responseRatings != null) {
            responseRatings.forEach(rating -> {
                try {
                    String urlHotel = "http://HOTELSERVICE/hotels/" + rating.getHotelId();
                    Hotel hotel = restTemplate.getForObject(urlHotel, Hotel.class);
                    rating.setHotels(hotel);
                } catch (Exception e) {
                    log.error("Error fetching hotel for rating {}: {}", rating.getRatingId(), e.getMessage());
                }
            });
        }

        user.setRatings(responseRatings);
        return user;
    }

}
