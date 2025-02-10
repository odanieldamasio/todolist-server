package com.danieldamasio.todolist.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "hello_world")
    public String helloWorld() {
        return "hello world!";
    }
    
    @GetMapping
    public List<Task> listAll() {
        return taskService.listAll();
    }
}
