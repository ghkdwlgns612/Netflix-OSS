package com.example.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller1 {

    @GetMapping("/v1")
    public void v1Controller() {
        log.info("service1실행");
    }
}
