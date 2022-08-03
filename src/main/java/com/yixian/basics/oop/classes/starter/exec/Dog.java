package com.yixian.basics.oop.classes.starter.exec;

public class Dog {

	private String name;

	private String color;

	private byte age;


	public Dog(String name, String color, byte age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Dog() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" +
			"name=" + name +
			", color='" + color + '\'' +
			", age=" + age +
			'}';
	}

	public void show() {
		System.out.println(this.toString());
	}


	public static void main(String[] args) {
		Dog labuladuo = new Dog("拉布拉多","白色",(byte)2);
		labuladuo.show();
	}
}
