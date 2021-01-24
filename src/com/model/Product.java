package com.model;

public class Product {
	
	private String id;
	private String name;
	private long price;
	private int quantity;
	private String manufacturer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Product(String id, String name, long price, int quantity, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
	}
	
	public Product() {
	}
	
	@Override
	public String toString() {
		return "Product Id=" + id + ", Name=" + name + ", Price=" + price + ", Quantity=" + quantity
				+ ", Manufacturer=" + manufacturer;
	}

}