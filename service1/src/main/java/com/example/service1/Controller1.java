package com.example.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller1 {

    private ServiceAtoBFeign serviceAtoBFeign;

    public Controller1(ServiceAtoBFeign serviceAtoBFeign) {
        this.serviceAtoBFeign = serviceAtoBFeign;
    }

    @GetMapping("/v1")
    public String v1Controller(@RequestParam String message) {
        log.info("service1실행");
        return message + "접수하고 리턴";
    }

    @GetMapping("/atob")
    public String aToBController(@RequestParam String message) {
        log.info("service1에서 service2호출");
        return serviceAtoBFeign.sendMessage(message);
    }

}
