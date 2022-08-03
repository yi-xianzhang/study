package com.yixian.basics.oop.classes.starter.exec;

import java.util.Objects;

public class Circle implements Comparable<Circle> {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Circle circle = (Circle) o;
		return Double.compare(circle.radius, radius) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public String toString() {
		return "Circle{" +
			"radius=" + radius +
			'}';
	}

	/**
	 * 求圆的周长
	 * @return
	 */
	public double perimeter() {
		return 2 * Math.PI * this.radius ;
	}

	/**
	 * 求圆的周长
	 * @return
	 */
	public double area() {
		return Math.PI * this.radius * this.radius;
	}


	@Override
	public int compareTo(Circle o) {
		if (o == null) {
			return 1;
		}

		return this.radius > o.radius ? 1 :
			(this.radius == o.radius ? 0 : -1);

	}

	public static void main(String[] args) {

		Circle circle = new Circle(3);

		System.out.println(circle.area());
		System.out.println(circle.perimeter());

		PassObject pa = new PassObject();
		pa.printAreas(circle,5);

	}
}

class PassObject {

	public void printAreas(Circle circle, int times) {
		if (circle == null) {
			circle = new Circle();
		}
		System.out.println("Radius\tArea");
		for (int i = 1; i <= times; i++) {
			circle.setRadius(i);
			System.out.println(circle.getRadius() + "\t" + circle.area());
		}
	}
}
