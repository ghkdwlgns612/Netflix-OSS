package com.example.service3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller3 {

    @GetMapping("/v1")
    public void v1Controller() {
        log.info("service3실행");
    }
}
