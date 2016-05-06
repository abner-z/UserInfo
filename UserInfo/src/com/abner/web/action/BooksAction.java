package com.abner.web.action;

import java.awt.event.ActionEvent;
import java.util.Collection;

import javax.swing.AbstractAction;

import com.abner.commons.Pager;
import com.abner.commons.sercices.PageService;
import com.abner.modle.Books;
import com.abner.services.iface.IBooksService;
import com.opensymphony.xwork2.ActionSupport;

public class BooksAction {
	private IBooksService booksService;
    private PageService pageService;
    private Books book;
    private Pager pager;
    protected Collection availableItems;
    protected String currentPage;
    protected String pagerMethod;
    protected String totalRows;
    protected String bookId;
    protected String queryName;
	protected String queryValue;
    protected String searchName;
    protected String searchValue;
    protected String queryMap;
    public IBooksService getBooksService() {
		return booksService;
	}
	public void setBooksService(IBooksService booksService) {
		this.booksService = booksService;
	}
	public PageService getPageService() {
		return pageService;
	}
	public void setPageService(PageService pageService) {
		this.pageService = pageService;
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public Collection getAvailableItems() {
		return availableItems;
	}
	public void setAvailableItems(Collection availableItems) {
		this.availableItems = availableItems;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getPagerMethod() {
		return pagerMethod;
	}
	public void setPagerMethod(String pagerMethod) {
		this.pagerMethod = pagerMethod;
	}
	public String getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(String totalRows) {
		this.totalRows = totalRows;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getQueryValue() {
		return queryValue;
	}
	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public String getQueryMap() {
		return queryMap;
	}
	public void setQueryMap(String queryMap) {
		this.queryMap = queryMap;
	}

}
