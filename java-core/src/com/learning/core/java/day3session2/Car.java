package com.learning.core.java.day3session2;

import java.util.Objects;

public class Car implements Comparable<Car>{
	
	private String name;
	private double price;
	
	
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int compareTo(Car o) {
		return Double.compare(this.price, o.price);
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}


	@Override
	public String toString() {
		return name+ " " + price;
	}
	
	
	
}
