package com.example.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "atob", url = "http://localhost:8082")
public interface ServiceAtoBFeign {

    @GetMapping("/v1")
    String sendMessage(@RequestParam String message);
}