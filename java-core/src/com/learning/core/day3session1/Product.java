package com.learning.core.day3session1;

public class Product{
	public String productId;
	public String productName;
	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return productId + " " + productName ;
	}
	
	
}