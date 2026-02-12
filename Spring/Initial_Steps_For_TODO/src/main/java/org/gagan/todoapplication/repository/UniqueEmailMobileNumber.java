package org.gagan.todoapplication.repository;

import org.gagan.todoapplication.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniqueEmailMobileNumber extends Neo4jRepository<User, Long> {

	boolean existsByEmail(String email);

	boolean existsByMobileNumber(String mobileNumber);
}