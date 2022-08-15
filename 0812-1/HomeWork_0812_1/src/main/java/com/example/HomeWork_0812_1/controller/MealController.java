package com.example.HomeWork_0812_1.controller;

import com.example.HomeWork_0812_1.model.entity.Meal;
import com.example.HomeWork_0812_1.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {

    @Autowired
    private MealService mealService;

    public List<Meal> getAllMeals(){
        List<Meal> response = mealService.getAllMeals();
        return response;
    }
}
