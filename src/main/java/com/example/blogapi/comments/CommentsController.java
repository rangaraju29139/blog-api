package com.example.blogapi.comments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs/{blogId}/comments")
public class CommentsController {
}
