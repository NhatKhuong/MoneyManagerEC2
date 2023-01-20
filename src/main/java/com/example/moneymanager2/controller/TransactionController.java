package com.example.moneymanager2.controller;

import com.example.moneymanager2.model.Basket;
import com.example.moneymanager2.model.Transaction;
import com.example.moneymanager2.service.BasketService;
import com.example.moneymanager2.service.TransactionService;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public String save(@RequestBody Transaction transaction){
        transactionService.save(transaction);
        return "save success";
    }

    @GetMapping
    public List<Transaction> getAll(){
        return transactionService.findAll();
    }

    @GetMapping("/{id}")
    public Transaction findById(@PathVariable("id") String id){
        return  transactionService.findById(id);
    }

    @PutMapping("/{id}")
    public Transaction update(@PathVariable("id") String id, @RequestBody Transaction transaction){
        Transaction transactionEx = findById(id);
        transactionEx.setMoneyTransaction(transaction.getMoneyTransaction());
        transactionEx.setBasketId(transaction.getBasketId());
        transactionEx.setCreateDate(transaction.getCreateDate());
        transactionEx.setNote(transaction.getNote());
        transactionEx.setType(transaction.getType());
        transactionService.update(transactionEx);
        return transactionEx;
    }
}