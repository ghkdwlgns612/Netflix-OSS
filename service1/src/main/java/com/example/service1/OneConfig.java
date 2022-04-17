package com.example.service1;

import com.example.service1.repository.OneRepository;
import com.example.service1.repository.OneRepositoryImpl;
import com.example.service1.service.Service1;
import com.example.service1.service.ServiceOneImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OneConfig {

    @Bean
    public OneRepository oneRepository() {
        return new OneRepositoryImpl();
    }

    @Bean
    public Service1 service1() {
        return new ServiceOneImpl(oneRepository());
    }
}
