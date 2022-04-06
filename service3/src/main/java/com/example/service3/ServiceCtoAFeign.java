package com.example.service3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ctoa", url = "http://localhost:8081")
public interface ServiceCtoAFeign {
    @GetMapping("/v1")
    String sendMessage(@RequestParam String message);
}
