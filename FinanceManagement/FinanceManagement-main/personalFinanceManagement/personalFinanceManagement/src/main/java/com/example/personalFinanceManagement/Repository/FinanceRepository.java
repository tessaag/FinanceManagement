package com.example.personalFinanceManagement.Repository;

import com.example.personalFinanceManagement.Model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
    List<Finance> findByTransactionType(String transactionType);
}
