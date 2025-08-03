package com.financemanager.service;

import com.financemanager.model.BankAccount;
import com.financemanager.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    public List<BankAccount> getUserBankAccounts(Long userId) {
        return bankAccountRepository.findByUserId(userId);
    }

    public BankAccount save(BankAccount account) {
        return bankAccountRepository.save(account);
    }
} 
