package com.gagan.hotelservice.service;

import com.gagan.hotelservice.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    Hotel getHotelById(String hotelId);

    List<Hotel> getAllHotel();
}
