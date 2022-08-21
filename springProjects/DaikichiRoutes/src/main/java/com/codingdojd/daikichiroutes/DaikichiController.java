package com.codingdojd.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

	 @RequestMapping("/daikichi")
     public String daikichi() {
             return "Welcome!";
     }
}
