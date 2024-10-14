package com.demo.mapper.service;

import com.demo.mapper.vo.BookVO;

import java.util.List;

public interface BookService {

    BookVO createBook(BookVO bookVO);

    BookVO getBookById(Long id);

    List<BookVO> getAllBooks();

    void deleteBook(Long id);

}
