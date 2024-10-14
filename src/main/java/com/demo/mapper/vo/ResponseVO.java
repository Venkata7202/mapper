package com.demo.mapper.vo;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseVO<T> {
    private ResponseMessageVO message;
    private T data;
}

