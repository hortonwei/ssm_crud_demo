package com.hor.service;

import java.util.List;

import com.hor.beans.Book;

public interface BookService {

	List<Book> getBookList();
	
	void insertBook(Book book);
	
	void deleteBookById(Integer id);
	
	void updateBook(Book book);
	
	Book getBookById(Integer id);
}
