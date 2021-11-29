package com.springboot.mangodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mangodb.model.Book;
import com.springboot.mangodb.service.BookService;

@RestController
@RequestMapping("/bookStore")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
		
	}
	
	@PostMapping("/addBooks")
	public List<Book> addBooks(@RequestBody List<Book> books){
		return bookService.addBooks(books);
		
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bookService.getBooks();
		
	}
	
	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable int id) {
		return bookService.getBook(id);
		
	}
}
