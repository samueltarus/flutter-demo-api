package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.dto.ResponseDTO;

import javax.ws.rs.core.Response;

public class BaseController {

    protected Response buildResponse(boolean success,String message, Object data) {
        if(success){
            return Response.status(Response.Status.OK)
                    .entity(ResponseDTO.builder()
                            .success(true)
                            .message(message)
                            .data(data)
                            .build())
                    .build();
        }
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(ResponseDTO.builder()
                        .success(false)
                        .message(message)
                        .data(data)
                        .build())
                .build();
    }
}
