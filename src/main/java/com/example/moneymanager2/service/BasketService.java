package com.example.moneymanager2.service;

import com.example.moneymanager2.model.Basket;
import com.example.moneymanager2.model.User;
import com.example.moneymanager2.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;

    public boolean save(Basket basket){
        try{
            basketRepository.save(basket);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Basket basket){
        try{
            basketRepository.delete(basket);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Basket findById(String id){
        Basket basket = basketRepository.findById(id).orElse(null);
        return basket;
    }

    public boolean Update(Basket basket){
        try{
            basketRepository.save(basket);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Basket> findAll(){
        try{
            List<Basket> users = basketRepository.findAll();
            return users;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
