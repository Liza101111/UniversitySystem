package com.universitysystem.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
