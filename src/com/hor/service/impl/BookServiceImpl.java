package com.hor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hor.beans.Book;
import com.hor.mapper.BookMapper;
import com.hor.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> getBookList() {
		List<Book> list = bookMapper.selectByExample(null);
		return list;
	}

	@Override
	public void insertBook(Book book) {
		bookMapper.insertSelective(book);
	}

	@Override
	public void deleteBookById(Integer id) {
		bookMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateBook(Book book) {
		bookMapper.updateByPrimaryKeySelective(book);
	}

	@Override
	public Book getBookById(Integer id) {
		Book book = bookMapper.selectByPrimaryKey(id);
		return book;
	}

	
}
