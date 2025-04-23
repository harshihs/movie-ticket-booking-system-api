package com.example.movieticketbookingsystem.mapper;


import com.example.movieticketbookingsystem.dto.UserRegistrationDto;
import com.example.movieticketbookingsystem.dto.UserResponse;
import com.example.movieticketbookingsystem.entity.TheaterOwner;
import com.example.movieticketbookingsystem.entity.User;
import com.example.movieticketbookingsystem.entity.UserDetails;
import org.springframework.stereotype.Component;
import com.example.movieticketbookingsystem.enums.UserRole;

import java.time.Instant;

@Component
    public class UserDetailsMapper {
        private UserDetailsMapper() {} // Utility class

        public static UserDetails mapFromDTO(UserResponse dto) {
            UserDetails user = switch (dto.userRole()) {
                case USER -> new User();
                case THEATER_OWNER -> new TheaterOwner();
            };

            user.setUsername(dto.username());
            user.setEmail(dto.email());
            // Hash later
            user.setPhoneNumber(dto.phoneNumber());
            user.setUserRole(dto.userRole());
            user.setDateOfBirth(dto.dateOfBirth());

            long now = Instant.now().toEpochMilli();
            user.setCreatedAt(now);
            user.setUpdatedAt(now);

            return user;
        }
    }

