package com.example.reactiveprogramming.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactiveprogramming.apiresponse.ApiResponse;
import com.example.reactiveprogramming.model.Student;
import com.example.reactiveprogramming.service.Reactive;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/saveReactive")
@RequiredArgsConstructor
public class ReactiveController   {
    // practice
    private final Reactive reactive;
    @PostMapping("/saveDetails")
    public Flux<ApiResponse> postDeatils(@RequestBody Student entity) {
        reactive.saveDeatils(entity);
        ApiResponse  apiResponse =ApiResponse.builder().messsage("success").statusCode(HttpStatus.OK.value()).build();
        return Flux.just(apiResponse);
    }

}
