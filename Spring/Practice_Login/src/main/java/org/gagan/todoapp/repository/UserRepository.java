package org.gagan.todoapp.repository;

import org.gagan.todoapp.model.Todo;
import org.gagan.todoapp.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    public static Map<String, User> users = new HashMap<>();
    public static Map<String, Todo> todos = new HashMap<>();
    public static Map<String, List<String>> userTodos = new HashMap<>();
}
