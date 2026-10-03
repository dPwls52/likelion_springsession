package com.likelion.springsession.comment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentCreateRequest {

    @NotBlank()
    @Size(max = 500, message = "댓글을 500자를 넘을 수 없습니다.")
    private String content;

}