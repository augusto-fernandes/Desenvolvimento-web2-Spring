package br.edu.fateccotia.taskList.repositories;

import br.edu.fateccotia.taskList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
