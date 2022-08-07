package com.example.HomeWork.service;

import com.example.HomeWork.model.Meal;
import com.example.HomeWork.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orderList;

    public OrderService() {
        super();
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("hamburger", 100, "This is delicious"));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order("1", 1000, "Bill", mealList1));

        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("hamburger", 100, "This is delicious"));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order("2", 1000, "Bill", mealList2));

    }

    public Order getOrderBySeq(String seq) {
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getSeq().equals(seq)) {
                return this.orderList.get(i);
            }
        }
        return null;
    }


    public int getIncome() {
        int income = 0;
        for (int i = 0; i < this.orderList.size(); i++) {
            income += orderList.get(i).getIncome();
        }
        return income;
    }
}
