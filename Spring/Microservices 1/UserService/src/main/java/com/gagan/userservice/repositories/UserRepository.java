package com.gagan.userservice.repositories;

import com.gagan.userservice.entities.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User,String> {
    
}
