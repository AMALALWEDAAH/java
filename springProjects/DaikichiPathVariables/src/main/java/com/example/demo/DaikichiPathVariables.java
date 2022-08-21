package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiPathVariables {
	
	 @RequestMapping("/daikichi/travel/{city}")
	    public String showCity(@PathVariable("city") String city){
	    	return String.format("Congratulations! You will soon travel to kyoto %s!", city) ;
	    }
	 
	 
	 @RequestMapping("/daikichi/lotto/{num}")
	    public String showLesson(@PathVariable("num") String num){
	    	
	    	if (Integer.valueOf(num)%2==0) {
	    		return String.format("You will take a grand journey in the near future, but be weary of tempting offers.") ;
	    	}else {
	    		return String.format("ou have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.") ;
	    	}
	    }

}
