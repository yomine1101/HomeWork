package com.example.HomeWork.controller;


import com.example.HomeWork.model.Order;
import com.example.HomeWork.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderName(@PathVariable String seq, Model model){
        Order order = this.orderService.getOrderSeq(seq);
        model.addAttribute("order", order);
        return "order";
    }
}
