package com.example.service1.service;

import com.example.service1.domain.User;

import java.util.List;

public interface Service1 {
    User save();

    List<User> findAll();
}
