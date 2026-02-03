package org.gagan.springsecuritypractice.jwt.repository;

import org.gagan.springsecuritypractice.jwt.models.UserModel;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<UserModel, String> {

}
