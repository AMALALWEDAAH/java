package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.models.Expense;
import com.example.demo.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/expenses")
    public String index(Model model) {
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
        }
	@RequestMapping("/expenses/new")
    public String newBook(@ModelAttribute("expense") Expense expense) {
        return "index.jsp";
    }
	@RequestMapping(value="/expenses", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	expenseService.createExpense(expense);
            return "redirect:/expenses";
        }
    }
}
