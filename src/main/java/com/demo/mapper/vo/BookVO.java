package com.demo.mapper.vo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookVO {

    private Long id;
    @NotNull
    @NotEmpty
    private String bookName;
    private String author;

}
