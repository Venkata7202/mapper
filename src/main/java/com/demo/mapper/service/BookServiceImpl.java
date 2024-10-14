package com.demo.mapper.service;

import com.demo.mapper.entity.Book;
import com.demo.mapper.exception.BookNotFoundException;
import com.demo.mapper.mapper.BookMapper;
import com.demo.mapper.repository.BookRepository;
import com.demo.mapper.vo.BookVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class BookServiceImpl implements BookService {


    private final BookRepository bookRepository;

    @Override
    public BookVO createBook(BookVO bookVO) {
        Book book = BookMapper.INSTANCE.bookVOToBook(bookVO);
        Book savedBook = bookRepository.save(book);
        return BookMapper.INSTANCE.bookToBookVO(savedBook);
    }

    @Override
    public BookVO getBookById(Long id) {
        return bookRepository.findById(id).map(BookMapper.INSTANCE::bookToBookVO).orElseThrow(() -> new BookNotFoundException("Requested Book does not exist"));
    }


    @Override
    public List<BookVO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(BookMapper.INSTANCE::bookToBookVO).toList();
    }

    @Override
    public void deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new BookNotFoundException("Requested Book does not exist");
        }
    }
}
