package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Counter {
	@RequestMapping("/")
	 public String index(HttpSession session) {
      session.setAttribute("count", 0);
      Integer count=(Integer)session.getAttribute("count");
      
	System.out.print("count="+count);
		return "index1.jsp";
	}
}
