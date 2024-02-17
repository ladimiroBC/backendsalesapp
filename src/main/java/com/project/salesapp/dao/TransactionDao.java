package com.project.salesapp.dao;

import com.project.salesapp.models.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionDao extends CrudRepository<Transaction, Integer> { }
