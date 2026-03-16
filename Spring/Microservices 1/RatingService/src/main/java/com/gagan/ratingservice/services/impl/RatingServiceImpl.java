package com.gagan.ratingservice.services.impl;

import com.gagan.ratingservice.entities.Rating;
import com.gagan.ratingservice.exceptions.DuplicateDataException;
import com.gagan.ratingservice.exceptions.ResourceNotFoundException;
import com.gagan.ratingservice.repositories.RatingRepository;
import com.gagan.ratingservice.services.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating saveRating(Rating rating) {
        if(!ratingRepository.findByUserIdAndHotelId(rating.getUserId(),rating.getHotelId()).isEmpty()){
            throw new DuplicateDataException("User Already gaves the rating...");
        }
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        List<Rating> ratings = ratingRepository.findByUserId(userId);
        if (ratings.isEmpty()) {
            throw new ResourceNotFoundException("No ratings found for userId: " + userId);
        }
        return ratings;
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        List<Rating> ratings = ratingRepository.findByHotelId(hotelId);
        if (ratings.isEmpty()) {
            throw new ResourceNotFoundException("No ratings found for hotelId: " + hotelId);
        }
        return ratings;
    }


}
