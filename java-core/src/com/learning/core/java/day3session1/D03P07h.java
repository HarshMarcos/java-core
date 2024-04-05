package com.learning.core.java.day3session1;

import java.util.TreeSet;

public class D03P07h {
	
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person(5, "John", 32, 1999.0));
		treeSet.add(new Person(6, "Tom", 42, 3999.0));
		treeSet.add(new Person(1, "Jim", 22, 5000.0));
		treeSet.add(new Person(3, "Lance", 33, 8000.0));
		treeSet.add(new Person(2, "Harry", 23, 999.0));
		treeSet.add(new Person(7, "Axle", 40, 2999.0));
		
		double sumSalaries = 0.0;
        for (Person person : treeSet) {
                sumSalaries += person.getSalary();
        }
        System.out.println(sumSalaries);

	}
}
