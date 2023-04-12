package com.itesm.todo.repository;

import com.itesm.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Integer> {
    List<Todo> findAll();
}
