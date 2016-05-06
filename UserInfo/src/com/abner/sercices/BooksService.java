package com.abner.sercices;

import java.util.List;

import com.abner.dao.iface.BooksDAO;
import com.abner.modle.Books;
import com.abner.services.iface.IBooksService;

public class BooksService implements IBooksService {
	private BooksDAO booksDAO;
	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return booksDAO.getAll();
	}

	@Override
	public List<Books> getBooks(int pageSize, int stratRow) {
		// TODO Auto-generated method stub
		return booksDAO.getBooks(pageSize, stratRow);
	}

	@Override
	public List<Books> getBooks(String fieldName, String value, int pageSize, int startRow) {
		// TODO Auto-generated method stub
		return booksDAO.getBooks(fieldName, value, pageSize, startRow);
	}

	@Override
	public Books getBooks(String bookId) {
		// TODO Auto-generated method stub
		return booksDAO.getBooks(bookId);
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return booksDAO.getRows();
	}

	@Override
	public int getRows(String fieldName, String value) {
		// TODO Auto-generated method stub
		return booksDAO.getRows(fieldName, value);
	}

	@Override
	public List<Books> queryBooks(String fieldNmae, String value) {
		// TODO Auto-generated method stub
		return booksDAO.queryBooks(fieldNmae, value);
	}

	@Override
	public String getMaxId() {
		// TODO Auto-generated method stub
		return booksDAO.getMaxId();
	}

	@Override
	public void addBook(Books books) {
		// TODO Auto-generated method stub
		booksDAO.addBook(books);
	}

	@Override
	public void deleteBook(String bookId) {
		// TODO Auto-generated method stub
		Books books = booksDAO.getBooks(bookId);
		booksDAO.deleteBook(books);
	}

	@Override
	public void updateBook(Books books) {
		// TODO Auto-generated method stub
		booksDAO.updateBook(books);
	}

	public BooksDAO getBooksDAO() {
		return booksDAO;
	}

	public void setBooksDAO(BooksDAO booksDAO) {
		this.booksDAO = booksDAO;
	}
	
}
