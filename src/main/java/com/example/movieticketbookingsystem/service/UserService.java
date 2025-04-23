package com.example.movieticketbookingsystem.service;

import com.example.movieticketbookingsystem.entity.UserDetails;
import org.springframework.stereotype.Service;


public interface UserService {
    public UserDetails addUser(UserDetails user);
}

