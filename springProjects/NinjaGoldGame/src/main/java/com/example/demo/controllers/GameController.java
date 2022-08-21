package com.example.demo.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

		ArrayList<String> Activities = new ArrayList<String>();
		
		Date currentDate = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(" MMMM  dd  yyyy HH:mm");
			
			
	@RequestMapping("/")
	public String index(HttpSession session,Model model) {
		
		if (session.getAttribute("gold") == null) {
			// Use setAttribute to initialize the count in session
				session.setAttribute("gold", 0);
				session.setAttribute("rnd", 0);
		}
		model.addAttribute("Activities", Activities);
		
		
		return "index.jsp";
	}
	
	@RequestMapping("/process_money")
	public String index1(HttpServletRequest request, HttpServletResponse response,Model model,HttpSession session) {
		if (session.getAttribute("gold") != null) {	
				Integer gold = (Integer) session.getAttribute("gold");
				Integer rnd = (Integer) session.getAttribute("rnd");
			if(request.getParameter("Farm") != null) {
				int min = 10;
				int max = 20;
				rnd=(int)Math.floor(Math.random()*(max-min+1)+min);
				gold+=rnd;
				session.setAttribute("gold", gold);
				System.out.println(rnd);
				if(rnd>0) {
							Activities.add("You entered a cave and earned " + rnd+" gold. ("+sdf.format(currentDate)+")");
							System.out.println(Activities);
				}
			
			}else if(request.getParameter("Cave") != null) {
				int min = 5;
				int max = 10;

				//Generate random int value from 5 to 10
				rnd=(int)Math.floor(Math.random()*(max-min+1)+min);
				
				gold+=rnd;
				session.setAttribute("gold", gold);
				System.out.println(rnd);
					
				if(rnd>0) {
					Activities.add("You entered a cave and earned " + rnd+" gold. ("+sdf.format(currentDate)+")");
					System.out.println(Activities);
				}
			}else if(request.getParameter("House") != null) {
				int min = 2;
				int max = 5;
					
				//Generate random int value from 2 to 5 
				rnd=(int)Math.floor(Math.random()*(max-min+1)+min);
					gold+=rnd;
					session.setAttribute("gold", gold);
					System.out.println(rnd);
					
					if(rnd>0) {
						Activities.add("You entered a cave and earned " + rnd+" gold. ("+sdf.format(currentDate)+")");
						System.out.println(Activities);
			}
			}else if(request.getParameter("Casino") != null) {
				int min = -50;
				int max = 50;
					
				//Generate random int value from -50 to 50 
				rnd=(int)Math.floor(Math.random()*(max-min+1)+min);
					gold+=rnd;
					session.setAttribute("gold", gold);
					System.out.println(rnd);
					
					if(rnd>0) {
						Activities.add("You entered a cave and earned " + rnd+" gold. ("+sdf.format(currentDate)+")");
						System.out.println(Activities);
			}else {
				Activities.add("You entered a cave and lost " + rnd+" gold..Outch.("+sdf.format(currentDate)+")");
				System.out.println(Activities);
			}
		}
		session.setAttribute("rnd", rnd);
		model.addAttribute("rnd", rnd);
		model.addAttribute("gold", gold);
	}
	
	
		return "redirect:/";
	}

}
