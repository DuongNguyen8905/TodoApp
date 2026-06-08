package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskServices;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskServices taskServices;


    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task>tasks = taskServices.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }
}
