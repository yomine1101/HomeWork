package com.example.HomeWork.service;

import com.example.HomeWork.model.Meal;
import com.example.HomeWork.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Order> orderList;

    public OrderService(){
        super();
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("hamburger", 100, "This is delicious"));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order("1", 1000, "Bill", meals));

    }

    public Order getOrderSeq(String seq){
        for(int i=0; i<this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq().equals(seq)){
                return this.orderList.get(i);
            }
        }
        return null;
    }
}
