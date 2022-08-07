package com.example.HomeWork.model;

import java.util.List;

public class Order {

    private String seq;
    private int income;
    private String waiter;
    private List<Meal> meals;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getIncome() {

        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Order(String seq, int totalPrice, String waiter, List<Meal> meals) {
        this.seq = seq;
        this.income = totalPrice;
        this.waiter = waiter;
        this.meals = meals;
    }
}
