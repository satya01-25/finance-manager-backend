package com.financemanager.controller;

import com.financemanager.model.BankAccount;
import com.financemanager.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank-accounts")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/user/{userId}")
    public List<BankAccount> getUserBankAccounts(@PathVariable Long userId) {
        return bankAccountService.getUserBankAccounts(userId);
    }

    @PostMapping
    public BankAccount addBankAccount(@RequestBody BankAccount account) {
        return bankAccountService.save(account);
    }
} 
