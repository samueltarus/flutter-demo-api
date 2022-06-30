package com.flutterDemo.flutterDemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class Response {
    protected LocalDate timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected Map<?, ?> data;
}
