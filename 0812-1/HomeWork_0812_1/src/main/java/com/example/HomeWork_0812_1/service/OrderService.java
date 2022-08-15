package com.example.HomeWork_0812_1.service;

import com.example.HomeWork_0812_1.controller.dto.request.CreateOrderRequest;
import com.example.HomeWork_0812_1.controller.dto.request.UpdateOrderRequest;
import com.example.HomeWork_0812_1.model.OrderRepository;
import com.example.HomeWork_0812_1.model.entity.Order;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONArray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        List<Order> response = orderRepository.findAll();
        return response;
    }

    public Order getOrderById(int id){
        Order response = orderRepository.findById(id);
        return response;
    }

    public String createOrder(CreateOrderRequest request){
        Order order = new Order();

        order.setSeq(request.getSeq());
        order.setTotalPrice(request.getTotalPrice());
        order.setWaiter(request.getWaiter());
        order.setMealList(request.getMealList());

        orderRepository.save(order);
        return "Updated Successfully";
    }

    public String updateOrder(int id, UpdateOrderRequest request){
        Order order = orderRepository.findById(id);
        if(null == order){
            return "Update Failed";
        }

        order.setWaiter(request.getWaiter());
        order.setTotalPrice(request.getTotalPrice());
        order.setMealList(request.getMealList());

        orderRepository.save(order);
        return "Updated Successfully";
    }

    public String deleteOrderById(int id){
        Order order = orderRepository.findById(id);

        if(null == order){
            return "Delete Failed";
        }

        Long count = orderRepository.deleteById(id);

        return "Deleted Successfully";
    }
}
