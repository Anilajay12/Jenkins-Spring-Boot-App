package com.demo.jenkinsdemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class CalculatorTest {


    @Autowired
    private Calculator calculator;
    @Test
    public void testAdd() {
        ResponseEntity<?> add = calculator.add(12, 4);
        Assertions.assertEquals(16, add.getBody());
    }

    @Test
    public void testSub() {
        ResponseEntity<?> sub = calculator.sub(18, 4);
        Assertions.assertEquals(14, sub.getBody());
    }

    @Test
    public void testMul() {
        ResponseEntity<?> mul = calculator.mul(24, 4);
        Assertions.assertEquals(96, mul.getBody());
    }

    @Test
    public void testDivWithValidValues() {
        ResponseEntity<?> div = calculator.div(33, 4);
        Assertions.assertEquals(8, div.getBody());
    }

    @Test
    public void testDivWithInvalidValues() {
        ResponseEntity<?> div = calculator.div(33, 0);
        Assertions.assertEquals("dividend cannot be zero", div.getBody());
    }

}