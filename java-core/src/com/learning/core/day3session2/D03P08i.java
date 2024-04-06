package com.learning.core.day3session2;

import java.util.Hashtable;

public class D03P08i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Employee> hashTable = new Hashtable<Integer, Employee>();
		
		hashTable.put(101, new Employee(101, "Daniel", "Analyst", "L&D"));
		hashTable.put(102, new Employee(102, "Thomas", "Tester", "Testing"));
		hashTable.put(103, new Employee(103, "Robert", "Product Manager", "Development"));
		hashTable.put(104, new Employee(104, "Grace", "Tech Support", "HR"));
		hashTable.put(104, new Employee(105, "Cahrles", "QA", "Lead Testing"));
		
		System.out.println(hashTable.isEmpty());
		
	}

}
