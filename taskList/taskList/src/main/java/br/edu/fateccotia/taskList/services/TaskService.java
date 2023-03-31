package br.edu.fateccotia.taskList.services;

import br.edu.fateccotia.taskList.model.Task;
import br.edu.fateccotia.taskList.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository  taskRepository;
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
