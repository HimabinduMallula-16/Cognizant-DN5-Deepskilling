package com.cognizant.orderservice.feign;

import com.cognizant.orderservice.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserClient {

    @GetMapping("/users/{id}")
    User getUser(@PathVariable Long id);
}