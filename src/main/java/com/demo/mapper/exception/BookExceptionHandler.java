package com.demo.mapper.exception;
/*
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExceptionHandler {

    @ExceptionHandler(value = {BookNotFoundException.class})
    public ResponseEntity<Object> handleBookNotFoundException
            (BookNotFoundException bookNotFoundException)
    {
        BookException bookException = new BookException(
                bookNotFoundException.getMessage(),
                bookNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(bookException, HttpStatus.NOT_FOUND);
    }

}

 */
