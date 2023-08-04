package com.example.blogapi.comments;

import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "comments")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    UUID id;
}
