package com.project.salesapp.service;

import com.project.salesapp.models.Transaction;
import java.util.List;

public interface TransactionService {
    public List<Transaction> findAll();
    public Transaction save(Transaction transaction);
    public void delete(Integer id);
    public Transaction findById(Integer id);
}
