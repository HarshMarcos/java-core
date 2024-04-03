package com.learning.core.day1session1;

public class Book {
	
	public String book_title;
	public double book_price;
	
	public Book(String book_title, double book_price) {
		this.book_title = book_title;
		this.book_price = book_price;
	}
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}	
	
}
