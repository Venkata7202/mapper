package com.demo.mapper.controller;

import com.demo.mapper.service.BookService;
import com.demo.mapper.vo.BookVO;
import com.demo.mapper.vo.ResponseMessageVO;
import com.demo.mapper.vo.ResponseVO;
import com.demo.mapper.vo.types.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@Slf4j
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseVO<BookVO> createBook(@RequestBody BookVO bookVO) {
        BookVO createdBook = bookService.createBook(bookVO);
        return ResponseVO.<BookVO>builder()
                .data(createdBook)
                .message(ResponseMessageVO.builder()
                        .message("Book created successfully")
                        .messageType(MessageType.INFO)
                        .build())
                .build();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseVO<BookVO> getBookById(@PathVariable Long id) {
        BookVO bookVO = bookService.getBookById(id);
        return ResponseVO.<BookVO>builder().data(bookVO)
                .message(ResponseMessageVO.builder()
                        .message("Student retrieved successfully")
                        .messageType(MessageType.INFO)
                        .build())
                .build();
    }

    @GetMapping
    public ResponseVO<List<BookVO>> getAllBooks() {
        List<BookVO> books = bookService.getAllBooks();
        return ResponseVO.<List<BookVO>>builder()
                .data(books)
                .message(ResponseMessageVO.builder()
                        .message("Books retrieved successfully")
                        .messageType(MessageType.INFO)
                        .build())
                .build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseVO<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseVO.<Void>builder()
                .data(null) // No data to return on delete
                .message(ResponseMessageVO.builder()
                        .message("Book deleted successfully")
                        .messageType(MessageType.INFO)
                        .build())
                .build();
    }

}
