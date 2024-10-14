package com.demo.mapper.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Setter
@Getter
public class BookException {
    private String message;
    private String messagetype;
    // final Throwable throwable;
    // final HttpStatus httpStatus;
}
