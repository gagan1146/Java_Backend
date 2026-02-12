package org.gagan.todoapplication.entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import lombok.Getter;
import lombok.Setter;

@Node("Role")   // Neo4j node label
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue
    private Long id;   // Neo4j internal id

    @Property("name")
    private String name;
}