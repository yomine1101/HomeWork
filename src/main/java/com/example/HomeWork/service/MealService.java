package com.example.HomeWork.service;

import com.example.HomeWork.model.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class MealService {

    List<Meal> mealList;

    public MealService() {
        this.mealList = new ArrayList<>();
        this.mealList.add(new Meal("hamburger", 100, "This is delicious"));
    }

    public Meal getMealName(String name) {
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);

            }
        }
        return null;
    }



}
