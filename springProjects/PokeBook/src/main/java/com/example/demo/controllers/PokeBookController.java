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

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
public class PokeBookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        model.addAttribute("book", new Book());
        return "home.jsp";
        }
    @RequestMapping(value="/books/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
        	 return "home.jsp";
        } else {
           bookService.createBook(book);
            return "redirect:/books";
        }
    }
    
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book1 = bookService.findBook(id);
        model.addAttribute("book", book1);
        return "Edit.jsp";
    }
    @PutMapping("/{id}/update")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") Long id, Model model) {
        if (result.hasErrors()) {
        	return "Edit.jsp";
        } else {
            bookService.updateBook(book,id);
            return "redirect:/books";
        }
    }
    
	@GetMapping("/books/show/{bookId}")
    public String show(Model model,@PathVariable("bookId")Long bookId) {
        System.out.print(bookId);
        Book book=bookService.findBook(bookId);
        model.addAttribute("book", book);
        
        return "show.jsp";
    }
	
	@RequestMapping(value="/{id}/delete",method={RequestMethod.GET, RequestMethod.POST})
    public String delete(@PathVariable("id") Long id) {
    	bookService.deleteBook(id);
		return "redirect:/books";
    	
    }
}
	
