
package com.springboot.mangodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mangodb.model.Book;
import com.springboot.mangodb.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> addBooks(List<Book> books){
		return bookRepository.saveAll(books);
		
	}
	
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	
	public Book addBook(Book book) {
		return  bookRepository.save(book);
		
	}
	
	public Book getBook(int id) {
		return bookRepository.findById(id).orElse(null);
		
	}
}
