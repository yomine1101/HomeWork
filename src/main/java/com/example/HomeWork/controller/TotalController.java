package com.example.HomeWork.controller;


import com.example.HomeWork.model.Order;
import com.example.HomeWork.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TotalController {

    @Autowired
    OrderService orderService;

    @GetMapping("/total")
    public String getTotal(Model model){
        int total= this.orderService.calTotal();
        model.addAttribute("total", total);
        return "total";
    }

}
