package com.example.reactiveprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactiveprogramming.model.Student;

@Repository
public interface ReactiveUser  extends JpaRepository<Student, Integer> {

}
