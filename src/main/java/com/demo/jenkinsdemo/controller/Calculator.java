package com.demo.jenkinsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class Calculator {

    @GetMapping(value = "/add", params = {"a", "b"})
    public ResponseEntity<?> add(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        int result = a + b;
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/sub", params = {"a", "b"})
    public ResponseEntity<?> sub(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        int result = a - b;
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/mul", params = {"a", "b"})
    public ResponseEntity<?> mul(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        if(a == 0 || b == 0) {
            return ResponseEntity.ok(0);
        }
        int result = a * b;
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/div", params = {"a", "b"})
    public ResponseEntity<?> div(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
        if(b == 0) {
            return ResponseEntity.ok("dividend cannot be zero");
        }
        int result = a / b;
        return ResponseEntity.ok(result);
    }
}
