package com.example.moneymanager2.controller;

import com.example.moneymanager2.model.Basket;
import com.example.moneymanager2.model.Book;
import com.example.moneymanager2.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/basket")
public class BasketController {
    @Autowired
    private BasketService basketService;

    @PostMapping
    public String save(@RequestBody Basket basket){
        basketService.save(basket);
        return "save success";
    }

    @PostMapping("/create-list-basket")
    public String createListBasket(@RequestBody List<Basket> lstBasket){
        for (Basket basket : lstBasket) {
            save(basket);
        }
        return "save success";
    }

    @GetMapping
    public List<Basket> getAll(){
        return basketService.findAll();
    }

    @GetMapping("/{id}")
    public Basket findById(@PathVariable("id") String id){
        return  basketService.findById(id);
    }

    @PutMapping("/{id}")
    public Basket update(@PathVariable("id") String id, @RequestBody Basket basket){
        Basket basketEx = findById(id);
        basketEx.setName(basket.getName());
        basketEx.setAvailableBalances(basket.getAvailableBalances());
        basketEx.setPrecent(basket.getPrecent());
        basketEx.setTotalIncome(basket.getTotalIncome());
        basketEx.setTotalSpending(basket.getTotalSpending());
        basketService.update(basketEx);
        return basketEx;
    }

    @GetMapping("/get-all-by-userId-and-type/{userId}/{type}")
    public List<Basket> getAllBasketByUserId(@PathVariable("userId") String userId, @PathVariable("type") int type){
        return basketService.findAllByUserIdAndTpe(userId,type);
    }
}
