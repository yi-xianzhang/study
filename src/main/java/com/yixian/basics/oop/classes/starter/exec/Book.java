package com.yixian.basics.oop.classes.starter.exec;

public class Book {

	private String name;

	private double price;

	public Book() {
	}

	public Book(String name, double price) {
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

	public void updatePrice() {
		if (this.price > 150) {
			this.price = 150;
			return;
		}

		if (this.price > 100) {
			this.price = 100;
			return;
		}
	}

	public double updatePrice(double price) {
		if (this.price > price) {
			double oldValue = this.price;
			this.price = price;
			return oldValue;
		}
		return this.price;
	}

	@Override
	public String toString() {
		return "Book{" +
			"name='" + name + '\'' +
			", price=" + price +
			'}';
	}

	public static void main(String[] args) {

		Book javaBook = new Book("java",169);
		System.out.println(javaBook);
		javaBook.updatePrice();
		System.out.println(javaBook);


		javaBook = new Book("java",169);
		System.out.println(javaBook);
		javaBook.updatePrice(100);
		System.out.println(javaBook);
	}

}
