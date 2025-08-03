package com.financemanager.service;

import com.financemanager.model.Transaction;
import com.financemanager.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getUserTransactions(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
} 
