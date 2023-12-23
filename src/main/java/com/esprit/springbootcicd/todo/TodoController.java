package com.esprit.springbootcicd.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @GetMapping
    List<Todo> findAllTodo() {
        return List.of(
                new Todo(1, "Java"),
                new Todo(2, "React"),
                new Todo(3, "Angular"),
                new Todo(4, "Aws"),
                new Todo(5, "Jenkins")
        );
    }
}
