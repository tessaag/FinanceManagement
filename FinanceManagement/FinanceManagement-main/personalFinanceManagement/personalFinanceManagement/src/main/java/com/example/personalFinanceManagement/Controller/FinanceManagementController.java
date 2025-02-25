package com.example.personalFinanceManagement.Controller;

import com.example.personalFinanceManagement.Model.Finance;
import com.example.personalFinanceManagement.Repository.FinanceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FinanceManagementController {
    @Autowired
    private FinanceRepository financeRepository;

    @Transactional
    @PostMapping("/addTransaction")
    public ResponseEntity<Map<String, String>> addTransaction(@RequestBody Finance finance) {
        Finance financeObj = financeRepository.save(finance);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "Transaction Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getExpenses")
    public ResponseEntity<List<Finance>> getExpenses() {
        List<Finance> expenses = financeRepository.findByTransactionType("Expense");

        return ResponseEntity.ok(expenses);
    }
}
