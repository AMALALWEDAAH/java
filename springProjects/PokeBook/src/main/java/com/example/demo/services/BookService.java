package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
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
		
		public Book updateBook(@Valid Book book,Long id) {
			// TODO Auto-generated method stub
		Book book1 = bookRepository.findById(id).get();
				 book1.setExpense(book.getExpense());
				 book1.setDescription(book.getDescription());
			 book1.setVendor(book.getVendor());
				 book1.setAmount(book.getAmount());
				return bookRepository.saveAndFlush(book1);
		}
		
		public void deleteBook(Long id) {
			// TODO Auto-generated method stub
			bookRepository.deleteById(id);
		}
		
}
