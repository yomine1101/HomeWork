package com.example.HomeWork_0812_1.model;

import com.example.HomeWork_0812_1.model.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {

    Meal findById(int id);
}
