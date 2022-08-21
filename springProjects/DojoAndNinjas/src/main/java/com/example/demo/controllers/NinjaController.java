package com.example.demo.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;

import com.example.demo.services.DojoService;
import com.example.demo.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	NinjaService ninjaService;
	
	@Autowired
	DojoService dojoService;
	
	
	@GetMapping("/dojos/{dojo_id}")
	public String showPerson(@PathVariable("dojo_id") Long dojo_id, Model model) {
	    
	    Dojo dojo = dojoService.findDojo(dojo_id);
	    model.addAttribute("dojo", dojo); 
	    return "dojo.jsp";
	}
	
	

	
	
	
	//new dojo
	@RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute Dojo dojo,Model model) {
		model.addAttribute("dojo", new Dojo());
        return "newDojo.jsp";
        }
	
	@RequestMapping(value="/dojos/new", method=RequestMethod.POST)
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
        	 return "newDojo.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
	
	//new ninja
	@RequestMapping("/ninjas/new")
    public String newNinja(@ModelAttribute Ninja ninja,Model model) {
		model.addAttribute("ninja", new Ninja());
		  List<Dojo> dojos = dojoService.allDojos();
          model.addAttribute("dojos", dojos);
        return "newNinja.jsp";
        }
	
	@RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
        if (result.hasErrors()) {
        	 return "newNinja.jsp";
        } else {
        	  List<Dojo> dojos = dojoService.allDojos();
              model.addAttribute("dojos", dojos);
        	 ninjaService.createNinja(ninja);
            return "redirect:/dojos/new";
        }
    }

}
