//package com.example.moneymanager2.service;
//
//import com.example.moneymanager2.model.Basket;
//import com.example.moneymanager2.model.Transaction;
//import com.example.moneymanager2.repository.TransactionRepositoty;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TransactionService {
//
//    @Autowired
//    private TransactionRepositoty transactionRepositoty;
//
//    public boolean save(Transaction transaction){
//        try{
//            transactionRepositoty.save(transaction);
//            return true;
//        }catch (Exception e){
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public boolean delete(Transaction transaction){
//        try{
//            transactionRepositoty.delete(transaction);
//            return true;
//        }catch (Exception e){
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public Transaction findById(String id){
//        Transaction transaction = transactionRepositoty.findById(id).orElse(null);
//        return transaction;
//    }
//
//    public boolean Update(Transaction transaction){
//        try{
//            transactionRepositoty.save(transaction);
//            return true;
//        }catch (Exception e){
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public List<Transaction> findAll(){
//        try{
//            List<Transaction> users = transactionRepositoty.findAll();
//            return users;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
