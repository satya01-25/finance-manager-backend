package com.financemanager.controller;

import com.financemanager.model.Budget;
import com.financemanager.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping("/user/{userId}")
    public List<Budget> getUserBudgets(@PathVariable Long userId) {
        return budgetService.getUserBudgets(userId);
    }

    @PostMapping
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }
} 
