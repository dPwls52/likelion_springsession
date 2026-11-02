package com.likelion.springsession.post.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

// post/dto/PostSummaryResponse.java
@Getter
@RequiredArgsConstructor
public class PostSummaryResponse {

    private final Long id;
    private final String title;
    private final String authorNickname;    // ← 추가
    private final LocalDateTime createdAt;
}