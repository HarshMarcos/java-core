package com.learning.core.day1session1;

public class D01P01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String bookTitle = "Java Programming";
	     double bookPrice = 350.0;
	     
	     Book book = createBooks(bookTitle, bookPrice);
	     showBooks(book);
		
	}
	public static Book createBooks(String title, double price) {
        return new Book(title, price);
    }
	
	public static void showBooks(Book book) {
		System.out.printf("Book Title: %s and price %.2f%n", book.getBook_title(), book.getBook_price());
	}
}
