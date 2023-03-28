package com.company.controller;

import com.company.dto.PostDTO;
import com.company.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private PostService postService;

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody PostDTO dto) {
        postService.addPost(dto);
        return ResponseEntity.ok().body("Successfully added");
    }
}
