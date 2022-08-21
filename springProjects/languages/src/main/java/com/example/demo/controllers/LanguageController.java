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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Language;
import com.example.demo.services.LanguageService;



@Controller
public class LanguageController {
	@Autowired
	LanguageService languageService;
	
	
	@RequestMapping("/languages")
    public String index(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        model.addAttribute("language", new Language());
        return "home.jsp";
        }
    @RequestMapping(value="/languages/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language languages, BindingResult result) {
        if (result.hasErrors()) {
        	 return "home.jsp";
        } else {
        	languageService.createLanguage(languages);
            return "redirect:/languages";
        }
    }
    
    @RequestMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "edit.jsp";
    }
    @RequestMapping(value="/{id}/update",method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
        if (result.hasErrors()) {
        	return "edit.jsp";
        } else {
        	languageService.updateLanguage(language,id);
            return "redirect:/languages";
        }
    }
    
	@GetMapping("/languages/show/{languageId}")
    public String show(Model model,@PathVariable("languageId")Long bookId) {
        System.out.print(bookId);
        Language language=languageService.findLanguage(bookId);
        model.addAttribute("language", language);
        
        return "show.jsp";
    }
	
	@RequestMapping(value="/{id}/delete",method={RequestMethod.GET, RequestMethod.POST})
    public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
    	
    }

}
