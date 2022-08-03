package com.yixian.basics.oop.classes.keywords.super_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : NotePad
 *
 * @create : 2022-06-05 04:22
 */
class NotePad extends Computer {

	private String color;

	public NotePad(String color) {
		this.color = color;
	}

	public NotePad(String cpu, double ram, double dom, String color) {
		super(cpu, ram, dom);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "NotePad{" +
			"cpu='" + this.getCpu() + '\'' +
			", ram=" + this.getRam() +
			", dom=" + this.getDom() +
			", brand='" + color + '\'' +
			'}';
	}

}

