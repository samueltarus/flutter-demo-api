package com.flutterDemo.flutterDemo.dto;

import lombok.*;

@Getter
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@ToString
@Builder
public class ResponseDTO{
    private Object data;
    private boolean success;
    private String message;
}
