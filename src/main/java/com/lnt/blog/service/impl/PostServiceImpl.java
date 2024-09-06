package com.lnt.blog.service.impl;

import com.lnt.blog.dto.request.AddPostRequest;
import com.lnt.blog.dto.response.AddPostResponse;
import com.lnt.blog.dto.response.FindPostResponse;
import com.lnt.blog.mapper.PostMapper;
import com.lnt.blog.model.Post;
import com.lnt.blog.repository.PostRepository;
import com.lnt.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public AddPostResponse addPost(AddPostRequest addPostRequest) {
        Post post = postMapper.toPostEntity(addPostRequest);
        return postMapper.toPostResponse(postRepository.save(post));
    }

    @Override
    public List<FindPostResponse> findAllPost() {
        List<Post> listPosts = postRepository.findAll();
        return postMapper.toListPostsResponse(listPosts);
    }
}
