package com.example.movieticketbookingsystem.entity.repository;

import com.example.movieticketbookingsystem.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Long> {
    boolean existsByEmail(String email);
}