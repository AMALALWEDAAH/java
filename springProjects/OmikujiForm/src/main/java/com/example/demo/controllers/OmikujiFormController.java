package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
	@RequestMapping("/")
	public String index() {
		return "OmikujiForm.jsp";
	}
	
	
	@RequestMapping(value="/omikuji", method=RequestMethod.POST)
	public String reset(
			@RequestParam(value="num") String num,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="living_type") String living_type,
			@RequestParam(value="Say") String Say,
			HttpSession session
			) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living_type", living_type);
		session.setAttribute("Say", Say);
		return "redirect:/omikuji/show";
	}
	
	
	@RequestMapping("/omikuji/show")
	public String show() {
	
		return "Omikuji.jsp";
	}
}
