package com.example.service1.repository;

import com.example.service1.domain.User;

import java.util.List;

public interface OneRepository {
    User save();

    List<User> findAll();
}
