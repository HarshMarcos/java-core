package com.learning.core.java.day3session2;

import java.util.Objects;

public class Book implements Comparable<Book> {
	
	public int bookId;
	public String title;
	public float price;
	public String author;
	public String dop;
	
	
	public Book(int bookId, String title, float price, String author, String dop) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.dop = dop;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDop() {
		return dop;
	}
	public void setDop(String dop) {
		this.dop = dop;
	}
	@Override
	public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dop, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId && Objects.equals(dop, other.dop)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return bookId + " " + title + " " + price + " " + author + " " + dop;
	}	
	
}
