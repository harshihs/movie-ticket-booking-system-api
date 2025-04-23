package com.example.movieticketbookingsystem.entity.utility;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Data
@Builder
public class ResponseStructure<T> {
    private int Statuscode;
    private String message;
    private T data;
}