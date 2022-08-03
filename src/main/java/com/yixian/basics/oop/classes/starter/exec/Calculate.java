package com.yixian.basics.oop.classes.starter.exec;

public class Calculate {

	private double preOperand;

	private double stuffOperand;

	public Calculate() {
	}

	public Calculate(double preOperand, double stuffOperand) {
		this.preOperand = preOperand;
		this.stuffOperand = stuffOperand;
	}

	public double getPreOperand() {
		return preOperand;
	}

	public void setPreOperand(double preOperand) {
		this.preOperand = preOperand;
	}

	public double getStuffOperand() {
		return stuffOperand;
	}

	public void setStuffOperand(double stuffOperand) {
		this.stuffOperand = stuffOperand;
	}

	public double subtract() {
		return this.preOperand - this.stuffOperand;
	}

	public double add() {
		return this.preOperand + this.stuffOperand;
	}

	public Double divide() {
		if (this.stuffOperand == 0) {
			System.out.println("除数不能为0");
			return null;
		}
		return this.preOperand / this.stuffOperand;
	}

	public double multiply () {
		return this.preOperand * this.stuffOperand;
	}


	public static void main(String[] args) {
		Calculate calculate = new Calculate(12,0);
		System.out.println(calculate.add());
		System.out.println(calculate.subtract());
		System.out.println(calculate.multiply());
		System.out.println(calculate.divide());
	}
}


