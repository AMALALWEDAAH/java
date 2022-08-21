package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DisplayDate {

	@RequestMapping("/")
	 public String home() {
		return "homepage.jsp";
	 }
	
	@RequestMapping("/date")
	 public String date(Model model) throws ParseException {
		
		Date currentDate = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("',The' dd 'of' MMMM ',' yyyy ");
		Object date = sdf.format(currentDate);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
	      String day = sdf1.format(new Date());
		
		
        model.addAttribute("date",date);
        model.addAttribute("day",day);
		return "currentdate.jsp";
	 }
	
	@RequestMapping("/time")
	 public String time(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		String time = dateFormat.format(new Date());
		
		 model.addAttribute("time",time);
		return "currenttime.jsp";
	 }
}
