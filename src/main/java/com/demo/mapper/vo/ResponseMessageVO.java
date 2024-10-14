package com.demo.mapper.vo;

import com.demo.mapper.vo.types.MessageType;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessageVO {

    private String message;
    private MessageType messageType;
}

