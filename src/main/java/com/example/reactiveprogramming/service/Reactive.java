package com.example.reactiveprogramming.service;

import java.util.List;

import com.example.reactiveprogramming.model.Student;

import reactor.core.publisher.Flux;

public interface Reactive {

    public void saveDeatils(Student student);

    public Flux<Student> getAllDetails();

}
