package com.lnt.blog.service;

import com.lnt.blog.dto.request.AddPostRequest;
import com.lnt.blog.dto.response.AddPostResponse;

public interface PostService {
    AddPostResponse addPost(AddPostRequest addPostRequest);
}
