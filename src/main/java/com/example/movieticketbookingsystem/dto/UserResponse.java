package com.example.movieticketbookingsystem.dto;

import com.example.movieticketbookingsystem.enums.UserRole;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record UserResponse(
        String username,
        String email,
        String phoneNumber,
        UserRole userRole,
        LocalDate dateOfBirth
) {
}
