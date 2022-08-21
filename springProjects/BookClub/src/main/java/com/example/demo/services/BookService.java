package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.models.User;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private  BookRepository bookRepository;
	
	public List<Book> allBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
		
	}

	public Book createBook(@Valid Book book, User user) {
		// TODO Auto-generated method stub
		book.setUser(user);
		return bookRepository.save(book);
	}

	public Book findBook(Long bookId) {
		// TODO Auto-generated method stub
		Optional<Book> optionalbook = bookRepository.findById(bookId);
		if(optionalbook.isPresent()) {
			return optionalbook.get();
			} else {
				return null;
				}
	}

}
