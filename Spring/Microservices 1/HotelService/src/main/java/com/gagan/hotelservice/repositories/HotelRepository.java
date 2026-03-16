package com.gagan.hotelservice.repositories;

import com.gagan.hotelservice.entities.Hotel;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface HotelRepository extends Neo4jRepository<Hotel,String> {
}
