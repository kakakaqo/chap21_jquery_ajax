package com.javalab.vo;

public class Product {
	
	private String productId;
	private String productName;
	private String price;
	
	// 기본 생성자
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 오버로딩 생성자
	public Product(String productId, String productName, String price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	// 게터/세터
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	// 디버깅용 toString
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
