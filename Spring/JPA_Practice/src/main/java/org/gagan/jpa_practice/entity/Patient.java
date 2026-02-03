package org.gagan.jpa_practice.entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDate;
import java.util.UUID;

@Node
@Data
public class Patient {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String gender;

    public Patient(String name, LocalDate birthDate, String email, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
    }

}
