package com.example.rest.domain.post.post.dto;

import com.example.rest.domain.post.post.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
public class PostDto {

    private long id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String title;
    private String content;


    public PostDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }
}
