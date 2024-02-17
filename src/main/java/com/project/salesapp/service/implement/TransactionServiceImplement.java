package com.project.salesapp.service.implement;

import com.project.salesapp.dao.TransactionDao;
import com.project.salesapp.models.Transaction;
import com.project.salesapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class TransactionServiceImplement implements TransactionService {
    @Autowired
    private TransactionDao transactionDao;

    @Transactional(readOnly = false)
    public List<Transaction> findAll() {
        return (List<Transaction>) transactionDao.findAll();
    }

    @Transactional(readOnly = false)
    public Transaction save(Transaction transaction) {
        return transactionDao.save(transaction);
    }

    @Transactional(readOnly = false)
    public void delete(Integer id) {
        transactionDao.deleteById(id);
    }

    @Transactional(readOnly = false)
    public Transaction findById(Integer id) {
        return transactionDao.findById(id).orElse(null);
    }
}
