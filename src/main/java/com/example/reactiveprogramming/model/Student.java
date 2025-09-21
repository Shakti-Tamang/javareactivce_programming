package com.example.reactiveprogramming.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student")
public class Student  implements Serializable {


    // @Schema(hidden = true)
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;

    @Column()
    String name;

    @Column()
    int age;

    @Column()
    String email;

    @Column()
    String password;

    
}
