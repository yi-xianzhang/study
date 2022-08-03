package com.yixian.basics.oop.starter;

import java.util.Objects;

class Car {

	private String name;

	private int age;

	private String color;

	public Car(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public Car() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return age == car.age &&
			Objects.equals(name, car.name) &&
			Objects.equals(color, car.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, color);
	}

	@Override
	public String toString() {
		return "Car{" +
			"name='" + name + '\'' +
			", age=" + age +
			", color='" + color + '\'' +
			'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car car = new Car();
		car.age = this.age;
		car.color = this.color;
		car.name = this.name;
		return car;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
