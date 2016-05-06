package com.abner.modle;

import java.sql.Date;

public class Books {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPublish;
	private Date bookDate;
	private String bookIsbn;
	private String bookPrice;
	private String bookPage;
	private String bookContent;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPage() {
		return bookPage;
	}
	public void setBookPage(String bookPage) {
		this.bookPage = bookPage;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublish="
				+ bookPublish + ", bookDate=" + bookDate + ", bookIsbn=" + bookIsbn + ", bookPrice=" + bookPrice
				+ ", bookPage=" + bookPage + ", bookContent=" + bookContent + "]";
	} 
	
}
