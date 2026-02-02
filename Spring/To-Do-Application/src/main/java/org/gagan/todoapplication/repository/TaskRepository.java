package org.gagan.todoapplication.repository;

import org.gagan.todoapplication.models.Task;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.UUID;

public interface TaskRepository extends Neo4jRepository<Task, UUID> {

}
