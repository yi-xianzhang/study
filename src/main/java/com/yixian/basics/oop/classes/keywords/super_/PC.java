package com.yixian.basics.oop.classes.keywords.super_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : PC
 * @create : 2022-06-05 04:22
 */
class PC extends Computer {

	private String brand;

	public PC(String brand) {
		this.brand = brand;
	}

	public PC(String cpu, double ram, double dom, String brand) {
		super(cpu, ram, dom);
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "PC{" +
			"cpu='" + this.getCpu() + '\'' +
			", ram=" + this.getRam() +
			", dom=" + this.getDom() +
			", brand= '" + brand + '\'' +
			'}';
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}

