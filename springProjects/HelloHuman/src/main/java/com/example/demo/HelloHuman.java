package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
    public String  Hello(@RequestParam(value="fname",required=false) String fname ,@RequestParam(value="lname",required=false)String lname,@RequestParam(value="times",required=false)int times) {
		public String p;
		if(fname==null) {
		p= " Hello Human";
      }else if(fname!=null){
    	  p= " Hello " + fname +" "+lname;
      }else {
    	  for(int i = 0;i<times;i++) {
    		  p= " Hello " + fname +" "+lname;
    	  }
      }
	return p;
			
}

}