package com.example.reactiveprogramming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reactiveprogramming.model.Student;
import com.example.reactiveprogramming.repository.ReactiveUser;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecativeServiceImpl implements Reactive {

    private final ReactiveUser reactiveUser;

    @Override
    public void saveDeatils(Student student) {
        reactiveUser.save(student);
    }

}
