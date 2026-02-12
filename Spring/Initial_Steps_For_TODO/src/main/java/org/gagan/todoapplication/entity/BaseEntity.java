package org.gagan.todoapplication.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
@Node
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;  // Neo4j internal id

    @CreatedDate
    @Property("createdAt")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Property("updatedAt")
    private LocalDateTime updatedAt;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}