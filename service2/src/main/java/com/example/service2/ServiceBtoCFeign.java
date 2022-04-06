package com.example.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "btoc", url = "http://localhost:8083")
public interface ServiceBtoCFeign {

    @GetMapping("/v1")
    String sendMessage(@RequestParam String message);

}
