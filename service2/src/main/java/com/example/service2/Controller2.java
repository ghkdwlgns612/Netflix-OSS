package com.example.service2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller2 {

    private ServiceBtoCFeign serviceBtoCFeign;

    public Controller2(ServiceBtoCFeign serviceBtoCFeign) {
        this.serviceBtoCFeign = serviceBtoCFeign;
    }

    @GetMapping("/v1")
    public String v1Controller(@RequestParam String message) {
        log.info("service2실행");
        return message + "접수하고 리턴";
    }

    @GetMapping("/btoc")
    public String bToCController(@RequestParam String message) {
        log.info("service2에서 service3호출");
        return serviceBtoCFeign.sendMessage(message);
    }
}
