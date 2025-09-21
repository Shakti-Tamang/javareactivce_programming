package com.example.reactiveprogramming.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.reactiveprogramming.model.Student;

@Repository
public interface ReactiveUser  extends ReactiveCrudRepository<Student, Integer> {

}
