package com.example.HomeWork.controller;

import com.example.HomeWork.model.Meal;
import com.example.HomeWork.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/meal")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping
    public String getMealName(@RequestParam String name, Model model){
        Meal meal = this.mealService.getMealName(name);
        model.addAttribute("meal", meal);
        return "meal";
    }
}
