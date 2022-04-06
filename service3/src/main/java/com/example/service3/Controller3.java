package com.example.service3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller3 {

    private ServiceCtoAFeign serviceCtoAFeign;

    public Controller3(ServiceCtoAFeign serviceCtoAFeign) {
        this.serviceCtoAFeign = serviceCtoAFeign;
    }

    @GetMapping("/v1")
    public String v1Controller(@RequestParam String message) {
        log.info("service3실행");
        return message + "접수하고 리턴";
    }

    @GetMapping("/ctoa")
    public String cToAController(@RequestParam String message) {
        log.info("service3에서 service1호출");
        return serviceCtoAFeign.sendMessage(message);
    }
}
