package com.lnt.blog.mapper;

import com.lnt.blog.dto.request.AddPostRequest;
import com.lnt.blog.dto.response.AddPostResponse;
import com.lnt.blog.dto.response.FindPostResponse;
import com.lnt.blog.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostMapper {
    Post toPostEntity(AddPostRequest addPostRequest);
    AddPostResponse toPostResponse(Post post);
    List<FindPostResponse> toListPostsResponse(List<Post> listPosts);
}
