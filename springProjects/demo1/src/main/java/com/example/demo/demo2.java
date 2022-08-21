package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class demo2 {

	
	        @RequestMapping("")
	        public String hello() {
	                return "Hello World!";
	        }
	        @RequestMapping("/world")
	        public String world() {
	                return "Class level annotations are cool too!";
	        }
	}

