package com.example.movieticketbookingsystem.controller;

import com.example.movieticketbookingsystem.dto.UserRegistrationDto;
import com.example.movieticketbookingsystem.entity.UserDetails;
import com.example.movieticketbookingsystem.entity.utility.ResponseStructure;
import com.example.movieticketbookingsystem.entity.utility.RestResponseStructures;
import com.example.movieticketbookingsystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final RestResponseStructures restResponseStructures;

    @PostMapping("/register")
    public ResponseEntity<ResponseStructure<UserDetails>> addUser(
            @RequestBody UserRegistrationDto dto) {

        UserDetails savedUser = userService.addUser(dto);
        return restResponseStructures.success(HttpStatus.OK, "User registered successfully", savedUser);
}
}