package com.example.HomeWork_0812_1.model;

import com.example.HomeWork_0812_1.model.entity.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findById(int id);
    Long deleteById(int id);
}
