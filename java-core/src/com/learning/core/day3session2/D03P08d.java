package com.learning.core.day3session2;

import java.util.TreeSet;

public class D03P08d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> treeSet = new TreeSet<Book>();
		treeSet.add(new Book(1001, "Python Learning", 715.0f, "Martic C. Brown", "2/2/2020"));
		treeSet.add(new Book(1002, "Modern Mainframe", 295.0f, "Sharad", "19/5/1997"));
		treeSet.add(new Book(1003, "Java Programming", 523.0f, "Gilad Bracha", "23/11/1984"));
		treeSet.add(new Book(1004, "Read C++", 295.0f, "Henry Harvin", "19/11/1984"));
		treeSet.add(new Book(1005, ".Net Platform", 3497.0f, "Mark J. Price", "6/3/1984"));
		
		for(Book book : treeSet) {
			System.out.println(book);
		}
	}

}
