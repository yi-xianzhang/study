package com.yixian.basics.oop.classes.keywords.final_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 圆
 * @create : 2022-06-12 18:42
 */
public class Circle {

	private double radius;

	private final double PI = 3.14;

	private final double PI_BY_BLOCK;

	private final double PI_BY_CONSTRUCTOR;

	{
		PI_BY_BLOCK = 3.14;
	}

	public Circle(double radius) {
		this.radius = radius;
		this.PI_BY_CONSTRUCTOR = 3.14;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public double getPI_BY_BLOCK() {
		return PI_BY_BLOCK;
	}

	public double getPI_BY_CONSTRUCTOR() {
		return PI_BY_CONSTRUCTOR;
	}

	public double perimeter() {
		return 2 * PI * this.radius;
	}

	public double area() {
		return PI * this.radius * this.radius;
	}
}

