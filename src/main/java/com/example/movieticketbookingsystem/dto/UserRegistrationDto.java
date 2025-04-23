package com.example.movieticketbookingsystem.dto;

import com.example.movieticketbookingsystem.entity.enums.UserRole;
import lombok.*;

import java.time.LocalDate;


@Builder
public record UserRegistrationDto(
        String username,
        String email,
        String password,
        String phoneNumber,
        UserRole userRole,
        LocalDate dateOfBirth
) {



}