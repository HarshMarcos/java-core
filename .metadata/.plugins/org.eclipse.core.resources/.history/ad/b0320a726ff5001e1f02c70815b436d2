package com.learning.core.day4session1;

class Queuel{
	private Node front;
	private Node rear;
	
	public Queuel() {
        this.front = null;
        this.rear = null;
    }
	
	public boolean isEmpty() {
	        return front == null;
	}
	
	public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
	
	public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        int dequeuedItem = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // If the queue becomes empty after dequeueing
        }
        return dequeuedItem;
    }
	public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}	

public class D04P09e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuel queue = new Queuel();
		
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);
		
		System.out.println("Elements in Queue ");
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("After removing first 2 elemets: ");
		queue.display();
		
	}

}
