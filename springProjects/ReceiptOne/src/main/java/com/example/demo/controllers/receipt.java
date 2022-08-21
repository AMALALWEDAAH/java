package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class receipt {
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name1",name);
        model.addAttribute("itemName1",itemName);
        model.addAttribute("price1",price);
        model.addAttribute("description1",description);
        model.addAttribute("vendor1",vendor);
        return "index.jsp";
    }
}