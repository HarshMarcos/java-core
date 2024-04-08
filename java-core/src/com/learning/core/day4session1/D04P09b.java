package com.learning.core.day4session1;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Stackl{
	private Node top;
	
	public Stackl() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int popped = top.data;
		top = top.next;
		return popped;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Node current = top;
		while(current != null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

	
public class D04P09b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackl stack = new Stackl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		stack.pop();
		stack.pop();
		System.out.println("Stack After Pop");
		stack.display();
	}

}
