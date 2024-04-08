package com.learning.core.day4session1;

class CircularQueue {
    private int[] queue;
    private int front; 
    private int rear;
    private int size; 
    private int capacity; 

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }
    
    
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        if (isEmpty())
            front = 0;
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        int dequeuedItem = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }
}
public class D04P09f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cqueue = new CircularQueue(4);
		
		cqueue.enqueue(14);
		cqueue.enqueue(13);
		cqueue.enqueue(22);
		cqueue.enqueue(-8);
		
		System.out.println("Elemnts is cqueue ");
		
		while (!cqueue.isEmpty()) {
	            System.out.println(cqueue.dequeue());
	    }
		
		cqueue.enqueue(14);
		cqueue.enqueue(13);
		cqueue.enqueue(22);
		cqueue.enqueue(-8);
		
		cqueue.dequeue();
		
		System.out.println("After removing 1st element");
		while (!cqueue.isEmpty()) {
            System.out.println(cqueue.dequeue());
		}
	}

}
