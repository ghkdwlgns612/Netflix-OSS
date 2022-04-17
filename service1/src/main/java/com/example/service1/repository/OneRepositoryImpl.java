package com.example.service1.repository;

import com.example.service1.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OneRepositoryImpl implements OneRepository{
    @Override
    public User save() {
        return new User(1L,"jihuhwan");
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (long i = 1L; i < 4; i++) {
            users.add(new User(i,"a" + i));
        }
        return users;
    }
}
