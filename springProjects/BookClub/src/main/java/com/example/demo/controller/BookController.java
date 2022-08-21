package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;
import com.example.demo.services.UserService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
    public String index(Model model, HttpSession session) {
		Long id = (Long)session.getAttribute("user_id");
		if(id != null) {
			com.example.demo.models.User user = userService.findUserById(id);
			List<Book> books = bookService.allBooks();
			model.addAttribute("user", user);
			model.addAttribute("books", books);
			return "home.jsp";
		}else {
			return "redirect:/";
		}
        }
	
	
	@GetMapping("/books/new")
    public String newTeam(@ModelAttribute("book") Book book) {
		
        return "new.jsp";
    }
    @PostMapping("/home")
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result,HttpSession session) {
        if (result.hasErrors()) {
            return "New.jsp";
        } else {
            Long id = (Long)session.getAttribute("user_id");
            com.example.demo.models.User user = userService.findUserById(id);

            bookService.createBook(book,(com.example.demo.models.User) user);
            return "redirect:/home";
        }
    }
    
    @GetMapping("home/{bookId}")
    public String show(Model model,@PathVariable("bookId")Long bookId,HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		if(userId != null) {
		com.example.demo.models.User user=userService.findUserById(userId);
		model.addAttribute("user", user);
        Book book=bookService.findBook(bookId);
        model.addAttribute("book", book);
        return "show.jsp";
		}else {
			return "redirect:/";
		}
    }
}
