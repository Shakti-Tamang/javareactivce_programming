package com.example.reactiveprogramming.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reactiveprogramming.model.Student;
import com.example.reactiveprogramming.repository.ReactiveUser;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class RecativeServiceImpl implements Reactive {

    private final ReactiveUser reactiveUser;

    @Override
    public void saveDeatils(Student student) {
        reactiveUser.save(student);
    }

    @Override
    public Flux<Student> getAllDetails() {
       Flux<Student> list= reactiveUser.findAll();

       int a=9;

       int b=8;

    //    String result=(a>b)?"a is greater":"b is greater";
       return list;
    }



}
