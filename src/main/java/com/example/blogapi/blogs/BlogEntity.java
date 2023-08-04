package com.example.blogapi.blogs;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "blog")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    UUID id;
}
