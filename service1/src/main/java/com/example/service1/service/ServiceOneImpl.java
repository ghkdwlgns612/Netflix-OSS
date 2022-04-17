package com.example.service1.service;

import com.example.service1.domain.User;
import com.example.service1.repository.OneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ServiceOneImpl implements Service1 {

    private OneRepository oneRepository;

    @Autowired
    public ServiceOneImpl(OneRepository oneRepository) {
        this.oneRepository = oneRepository;
    }

    @Override
    public User save() {
        log.info("save호출");
        User user = oneRepository.save();
        return user;
    }

    @Override
    public List<User> findAll() {
        log.info("findAll호출");
        List<User> users = oneRepository.findAll();
        return users;
    }
}
