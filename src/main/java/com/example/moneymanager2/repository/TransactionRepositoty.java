package com.example.moneymanager2.repository;


import com.example.moneymanager2.model.Basket;
import com.example.moneymanager2.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransactionRepositoty extends MongoRepository<Transaction,String> {
    public List<Transaction> findAllByUserIdAndType(String userId,int type);
    public List<Transaction> findAllByUserIdAndBasketId(String userId, String basketId);
}
