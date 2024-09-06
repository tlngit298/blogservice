package com.lnt.blog.controller;

import com.lnt.blog.dto.ApiResponse;
import com.lnt.blog.dto.request.AddPostRequest;
import com.lnt.blog.dto.response.AddPostResponse;
import com.lnt.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<AddPostResponse> addPost(@RequestBody AddPostRequest addPostRequest) {
        return ApiResponse.<AddPostResponse>builder()
                .result(postService.addPost(addPostRequest))
                .code(1)
                .build();
    }
}
