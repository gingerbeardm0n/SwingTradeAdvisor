package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    // Implement API endpoints here
    // Example:
    @GetMapping
    public String getAllStocks() {
        // Return all stocks
    }
}
