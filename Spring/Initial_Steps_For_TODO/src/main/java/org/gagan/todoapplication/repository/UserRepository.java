package org.gagan.todoapplication.repository;

import java.util.Optional;

import org.gagan.todoapplication.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

	Optional<User> findByEmail(String email);
}