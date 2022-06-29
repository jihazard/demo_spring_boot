package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class TestController {

        @GetMapping("/test")
        public String test() {
            int result = 0;
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                result += i;
            }
            System.out.println(result);
            return "test";

        }
    }


