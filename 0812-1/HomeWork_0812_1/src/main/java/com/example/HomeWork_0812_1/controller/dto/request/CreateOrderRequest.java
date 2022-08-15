package com.example.HomeWork_0812_1.controller.dto.request;

import com.example.HomeWork_0812_1.model.entity.Meal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {

    private int seq;
    private int totalPrice;
    private String waiter;

    private List<Meal> mealList;
}
