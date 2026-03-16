package com.gagan.ratingservice.repositories;

import com.gagan.ratingservice.entities.Rating;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends Neo4jRepository<Rating, String> {

    @Query("MATCH (r:user_ratings) WHERE r.userId = $userId AND r.hotelId = $hotelId RETURN r")
    List<Rating> findByUserIdAndHotelId(String userId, String hotelId);

    @Query("MATCH (r:user_ratings) WHERE r.userId = $userId AND r.ratingId IS NOT NULL AND r.userId IS NOT NULL AND r.hotelId IS NOT NULL RETURN r")
    List<Rating> findByUserId(String userId);

    @Query("MATCH (r:user_ratings) WHERE r.hotelId = $hotelId AND r.ratingId IS NOT NULL AND r.userId IS NOT NULL AND r.hotelId IS NOT NULL RETURN r")
    List<Rating> findByHotelId(String hotelId);
}
