package com.example.HomeWork_0812_1.controller;

import com.example.HomeWork_0812_1.controller.dto.request.CreateOrderRequest;
import com.example.HomeWork_0812_1.controller.dto.request.UpdateOrderRequest;
import com.example.HomeWork_0812_1.controller.dto.response.StatusResponse;
import com.example.HomeWork_0812_1.model.entity.Order;
import com.example.HomeWork_0812_1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired //自動補足註解
    private OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<Order>> getAllUsers(){
        List<Order> response = orderService.getAllOrders();
        return ResponseEntity
                    .status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable int id){
        Order response = orderService.getOrderById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    public StatusResponse createOrder(@RequestBody CreateOrderRequest request){
        String response = this.orderService.createOrder(request);
        return new StatusResponse(response);
    }

    @PutMapping("/{id}")
    public StatusResponse updateOrder(@PathVariable int id, @RequestBody UpdateOrderRequest request) {
        String response = this.orderService.updateOrder(id, request);
        return new StatusResponse(response);
    }

    public StatusResponse deleteOrderById(@PathVariable int id){
        String response = this.orderService.deleteOrderById(id);
        return new StatusResponse(response);
    }
}
