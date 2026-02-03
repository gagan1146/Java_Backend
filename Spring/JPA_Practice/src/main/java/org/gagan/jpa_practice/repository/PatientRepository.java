package org.gagan.jpa_practice.repository;

import org.gagan.jpa_practice.entity.Patient;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends Neo4jRepository<Patient, UUID> {
}
