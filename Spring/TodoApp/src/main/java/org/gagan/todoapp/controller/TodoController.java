package org.gagan.todoapp.controller;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public Todo addTodo(@RequestHeader("userid"), @RequestBody TodoRequest request){
        return todoService.addTodo(userId,request.title);
    }
}
