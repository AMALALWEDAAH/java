package com.example.demo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.demo.models.Expense;
import com.example.demo.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepository;
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
		}
	
	public List<Expense> allExpenses() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

	public Expense createExpense(@Valid Expense expense) {
		// TODO Auto-generated method stub
		return expenseRepository.save(expense);
		
	}

}
