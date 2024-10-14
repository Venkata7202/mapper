package com.demo.mapper.mapper;

import com.demo.mapper.entity.Book;
import com.demo.mapper.vo.BookVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookVO bookToBookVO(Book book);

    Book bookVOToBook(BookVO bookVO);
}
