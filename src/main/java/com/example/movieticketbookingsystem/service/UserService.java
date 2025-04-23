package com.example.movieticketbookingsystem.service;

import com.example.movieticketbookingsystem.dto.UserRegistrationDto;
import com.example.movieticketbookingsystem.dto.UserResponse;
import com.example.movieticketbookingsystem.entity.UserDetails;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDetails addUser(UserResponse dto);
}

