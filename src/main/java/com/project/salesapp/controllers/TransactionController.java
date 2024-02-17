package com.project.salesapp.controllers;

import com.project.salesapp.models.Transaction;
import com.project.salesapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping(value = "/")
    public ResponseEntity<Transaction> add(@RequestBody Transaction transaction) {
        Transaction object = transactionService.save(transaction);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Transaction> delete(@PathVariable Integer id) {
        Transaction object = transactionService.findById(id);

        if(object != null)
            transactionService.delete(id);
        else
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<Transaction> edit(@RequestBody Transaction transaction) {
        Transaction object = transactionService.findById(transaction.getIdTransaction());

        if (object != null) {
            object.setBuyer(transaction.getBuyer());
            object.setTransactionDate(transaction.getTransactionDate());
            object.setTransactionType(transaction.getTransactionType());
            object.setSeller(transaction.getSeller());
            object.setTotal((transaction.getTotal()));
            transactionService.save(object);
        }
        else {
            return new ResponseEntity<>(object, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Transaction> read() {
        return transactionService.findAll();
    }

    @GetMapping("/list/{id}")
    public Transaction readById(@PathVariable Integer id) {
        return transactionService.findById(id);
    }
}
