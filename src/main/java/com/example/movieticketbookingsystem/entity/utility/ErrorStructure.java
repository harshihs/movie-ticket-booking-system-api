package com.example.movieticketbookingsystem.entity.utility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorStructure {
    private int statuscode;
    private String errorMessage;
}