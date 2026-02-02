package org.gagan.todoapplication.repository;

import org.gagan.todoapplication.models.UserModel;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository  extends Neo4jRepository<UserModel,String> {

}
