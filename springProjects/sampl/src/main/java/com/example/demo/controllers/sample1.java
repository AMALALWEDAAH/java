package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class sample1 {
		
	@RequestMapping("/your_server")	
	public String index(HttpSession session) {
		// ...
			
	    	// If the count is not already in session
			if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
				session.setAttribute("count", 1);
				
			}
			else {
			// increment the count by 1 using getAttribute and setAttribute
				Integer currentCount = (Integer) session.getAttribute("count");
				currentCount+=1;
				session.setAttribute("count", currentCount);
	// ...
				
	}
			return "index2.jsp";
		}
	
	///////////////////////
	@RequestMapping("/your_server/counter")
	public String show(HttpSession session,Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		Integer currentCount2 = (Integer) session.getAttribute("counter");
		
		model.addAttribute("countToShow", currentCount);
		model.addAttribute("countToShow1", currentCount2);
		return "index.jsp";
	}
	///////////////////////
	@RequestMapping("/your_server/seconed")
	public String show2(HttpSession session) {
		if (session.getAttribute("counter") == null) {
			// Use setAttribute to initialize the count in session
				session.setAttribute("counter", 2);
				
			}
			else {
			// increment the count by 1 using getAttribute and setAttribute
				Integer currentCount = (Integer) session.getAttribute("counter");
				currentCount+=2;
				session.setAttribute("counter", currentCount);
	// ...
				
	}
		return "index3.jsp";
	}
	////////////////////////
	@RequestMapping("/your_server/counter/reset")
	public String reset(HttpSession session,Model model) {
		session.setAttribute("count", 0);
		session.setAttribute("counter", 0);
		return "index.jsp";
	}
}
