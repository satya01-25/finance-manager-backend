package com.financemanager.service;

import com.financemanager.model.Budget;
import com.financemanager.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getUserBudgets(Long userId) {
        return budgetRepository.findByUserId(userId);
    }

    public Budget save(Budget budget) {
        return budgetRepository.save(budget);
    }
} 
