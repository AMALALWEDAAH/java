package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		}
	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
		}
	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
		}
	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
			} else {
				return null;
				}
		}
	
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// TODO Auto-generated method stub
		 Book book = bookRepository.findById(id).get();
		 book.setTitle(book.getTitle());
		 book.setDescription(book.getDescription());
		 book.setLanguage(book.getLanguage());
		 book.setNumberOfPages(book.getNumberOfPages());
		return bookRepository.save(book);
	}
	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	}
