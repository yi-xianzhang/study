package com.yixian.basics.oop.extend_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 计算机
 * @create : 2022-06-05 04:09
 */
public class Computer {

	private String cpu;

	private double ram;

	private double dom;

	public Computer() {
	}

	public Computer(String cpu, double ram, double dom) {
		this.cpu = cpu;
		this.ram = ram;
		this.dom = dom;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getDom() {
		return dom;
	}

	public void setDom(double dom) {
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "Computer{" +
			"cpu='" + cpu + '\'' +
			", ram=" + ram +
			", dom=" + dom +
			'}';
	}

	public String getDetail() {
		return this.toString();
	}


	public static void main(String[] args) {

		PC pc = new PC("i7",16,1024,"联想");
		System.out.println(pc.getDetail());

		NotePad notePad = new NotePad("i7",16,1024,"绿色");
		System.out.println(notePad.getDetail());
	}
}



