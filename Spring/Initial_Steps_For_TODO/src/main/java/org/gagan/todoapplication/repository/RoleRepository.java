package org.gagan.todoapplication.repository;

import java.util.Optional;

import org.gagan.todoapplication.entity.Role;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends Neo4jRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
