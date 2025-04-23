package com.example.movieticketbookingsystem.entity.utility;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RestResponseStructures {

    public <T> ResponseEntity<ResponseStructure<T>> success(HttpStatus statuscode, String message, T data) {
        return ResponseEntity.status(statuscode).body(ResponseStructure.<T>builder()
                .Statuscode(statuscode.value())
                .message(message)
                .data(data)
                .build());
    }

    public ResponseEntity<ErrorStructure> error(HttpStatus statuscode, String message) {
        return ResponseEntity.status(statuscode).body(ErrorStructure.builder()
                .statuscode(statuscode.value())
                .errorMessage(message)
                .build());
    }
}
