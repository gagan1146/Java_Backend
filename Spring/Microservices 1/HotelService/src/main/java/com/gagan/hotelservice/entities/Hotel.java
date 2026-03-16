package com.gagan.hotelservice.entities;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Hotels")
@Data
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;

}
