package com.financemanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String period; // e.g., '2025-08' for monthly or '2025' for yearly

    private BigDecimal amount;

    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
} 
