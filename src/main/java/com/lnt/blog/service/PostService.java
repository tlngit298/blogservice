package com.lnt.blog.service;

import com.lnt.blog.dto.request.AddPostRequest;
import com.lnt.blog.dto.response.AddPostResponse;
import com.lnt.blog.dto.response.FindPostResponse;

import java.util.List;

public interface PostService {
    AddPostResponse addPost(AddPostRequest addPostRequest);
    List<FindPostResponse> findAllPost();
}
