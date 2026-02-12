package org.gagan.todoapp.model;

import java.time.LocalDateTime;

public class Todo {
    private String todoId;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt;

    public Todo(String todoId, String title, boolean completed, LocalDateTime createdAt) {
        this.todoId = todoId;
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
