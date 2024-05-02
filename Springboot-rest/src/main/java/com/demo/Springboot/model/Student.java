package com.demo.Springboot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String email;
}
