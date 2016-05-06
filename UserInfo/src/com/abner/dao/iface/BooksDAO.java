package com.abner.dao.iface;

import java.util.List;

import com.abner.modle.Books;

public interface BooksDAO {
	List<Books> getAll();
	List<Books> getBooks(int pageSize,int stratRow);
	List<Books> getBooks(String fieldName,String value, int pageSize,int startRow);
	Books getBooks(String bookId);
	int getRows();
	int getRows(String fieldName,String value);
	List<Books> queryBooks(String fieldNmae,String value);
	String getMaxId();
	void addBook(Books books);
	void deleteBook(Books books);
	void updateBook(Books books);
}
