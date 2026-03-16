package com.gagan.userservice.entities;

import com.gagan.userservice.dto.Rating;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Transient;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Data
@Node("micro_users")
public class User {
    @NotBlank
    @Property(name = "UserId")
    private String userId;
    @NotBlank
    private String name;
    @Id
    @NotBlank
    private String email;
    @NotBlank
    @Size(min = 8,max = 30)    private String password;
    @NotBlank
    @Size(min = 1,max = 100)
    private String about;
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
