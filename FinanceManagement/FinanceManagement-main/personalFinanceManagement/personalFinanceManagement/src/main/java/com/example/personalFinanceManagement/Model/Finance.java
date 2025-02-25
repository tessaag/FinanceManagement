package com.example.personalFinanceManagement.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("transactionId")
    @Column(unique = true, nullable = false)
    private String transactionId;

    @JsonProperty("userId")
    @Column(nullable = false)
    private String userId;

    @JsonProperty("transactionType")
    @Column(nullable = false)
    private String transactionType;

    @JsonProperty("amount")
    @Column(nullable = false)
    private Double amount;

    @JsonProperty("category")
    @Column(nullable = false)
    private String category;

    @JsonProperty("date")
    @Column(nullable = false)
    private String date;

    @JsonProperty("notes")
    private String notes;

    public Finance() {
    }

    public Finance(Long id, String transactionId, String userId, String transactionType, Double amount, String category, String date, String notes) {
        this.id = id;
        this.transactionId = transactionId;
        this.userId = userId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
