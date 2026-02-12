package org.gagan.todoapp.controller;

import org.gagan.todoapp.dto.TodoRequest;
import org.gagan.todoapp.model.Todo;
import org.gagan.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

//    @PostMapping
//    public Todo addTodo(@RequestHeader("userid"), @RequestBody TodoRequest request){
//        return todoService.addTodo(todoService.,request.title);
//    }
}
