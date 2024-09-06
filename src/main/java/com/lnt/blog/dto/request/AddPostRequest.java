package com.lnt.blog.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddPostRequest implements Serializable {
    private String title;

    private String subTitle;

    private String topic;

    private String content;
}
