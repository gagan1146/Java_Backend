package com.gagan.userservice.dto;

import com.gagan.userservice.enums.RatingEnum;
import lombok.Data;
import org.springframework.data.annotation.Transient;

import java.util.ArrayList;
import java.util.List;

@Data
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private RatingEnum rating;
    private String feedback;
    private Hotel hotels;
}
