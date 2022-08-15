package com.example.HomeWork_0812_1.service;

import com.example.HomeWork_0812_1.model.MealRepository;
import com.example.HomeWork_0812_1.model.entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public List<Meal> getAllMeals(){
        List<Meal> response = mealRepository.findAll();
        return response;
    }
}
