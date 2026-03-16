package com.gagan.ratingservice.entities;

import com.gagan.ratingservice.enums.RatingEnum;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("user_ratings")
@Data
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private RatingEnum rating;
    private String feedback;

}
