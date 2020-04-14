package com.hor.controller;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hor.beans.Book;
import com.hor.service.BookService;

@Controller

public class BookController {
	/*
	 * 获取所有数据-->/books-->GET 删除图书信息-->/book/1-->DELETE 根据id获取图书信息-->/book/1-->GET
	 * 修改图书信息-->/book-->PUT 跳转到添加页面-->/book-->GET 添加图书信息-->/book-->POST
	 */
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/books/{pageNum}", method = RequestMethod.GET)
	public String getBookList(@PathVariable("pageNum") Integer pageNum, HashMap<String, Object> map) {
		// 使用分页插件开始分页功能
		/*
		 * PageHelper.startPage(pageNum, pageSize); pageNum:当前访问的页码 pageSize:每页显示的条数
		 */
		PageHelper.startPage(pageNum, 5);
		List<Book> list = bookService.getBookList();
		/*
		 * PageInfo<Book> pageInfo = new PageInfo<>(list, nums); list:分页数据
		 * nums:分页导航栏显示的页码数
		 */
		PageInfo<Book> page = new PageInfo<>(list, 5);
		map.put("page", page);
		map.put("pageNum", pageNum);
		return "list";
	}

	/*
	 * 跳转到添加页面：/book-->GET
	 */
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String toAdd(@Param("pageNum") Integer pageNum,HashMap<String, Object> map) {
		map.put("pageNum", pageNum);
		return "add";
	}

	/*
	 * 添加信息：/book-->POST
	 */
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String addBook(Book book,HashMap<String, Object> map) {
		bookService.insertBook(book);
		
		PageHelper.startPage(1, 5);
		List<Book> list = bookService.getBookList();
		PageInfo<Book> page = new PageInfo<>(list, 5);
		
		int pages = page.getPages();
		PageHelper.startPage(pages, 5);
		list = bookService.getBookList();
		page = new PageInfo<>(list, 5);
		map.put("page", page);
		return "list";
	}

	/*
	 * 删除图书信息-->/book/1-->DELETE
	 */
	@RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
	public String delBook(@PathVariable("id") Integer id, @Param("pageNum") String pageNum,HashMap<String, Object> map) {
		bookService.deleteBookById(id);
		
		int parseInt = Integer.parseInt(pageNum);
		PageHelper.startPage(parseInt, 5);
		List<Book> list = bookService.getBookList();
		PageInfo<Book> page = new PageInfo<>(list, 5);
		
		if (page.getSize() != 0) {
			map.put("page", page);
		}else {
			PageHelper.startPage(parseInt - 1, 5);
			list = bookService.getBookList();
			page = new PageInfo<>(list, 5);
			map.put("page", page);
		}
		return "list";
	}
	
	//跳转到修改页面--/book PUT
	@RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
	public String toEdit(@PathVariable("id") Integer id, @Param("pageNum") String pageNum, HashMap<String, Object> map) {
		Book book = bookService.getBookById(id);
		map.put("book", book);
		map.put("pageNum", pageNum);
		return "edit";
	}
	//提交修改信息
	@RequestMapping(value = "/books", method = RequestMethod.PUT)
	public String updateBook(Book book, @Param("pageNum") String pageNum, HashMap<String, Object> map) {
		bookService.updateBook(book);
		PageHelper.startPage(Integer.parseInt(pageNum), 5);
		List<Book> list = bookService.getBookList();
		PageInfo<Book> page = new PageInfo<>(list, 5);
		map.put("page", page);
		return "list";
	}
}
