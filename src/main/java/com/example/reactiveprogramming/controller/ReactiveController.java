package com.example.reactiveprogramming.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactiveprogramming.service.Reactive;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/saveReactive")
@RequiredArgsConstructor
public class ReactiveController   {
    // practice

    private final Reactive reactive;
    @PostMapping("/saveDetails")
    public String postMethodName(@RequestBody String entity) {
        
        return entity;
    }
    


}
