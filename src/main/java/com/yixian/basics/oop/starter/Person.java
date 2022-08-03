package com.yixian.basics.oop.starter;

import com.yixian.basics.enums.Education;
import com.yixian.basics.enums.Gender;

import java.util.Objects;

public class Person {

	private String idCard;

	private int age;

	private Gender gender;

	private double salary;

	private Education education;

	public Person(String idCard, int age, Gender gender) {
		this.idCard = idCard;
		this.age = age;
		this.gender = gender;
	}

	public Person() {
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age &&
			Objects.equals(idCard, person.idCard) &&
			gender == person.gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCard, age, gender);
	}

	@Override
	public String toString() {
		return "Person{" +
			"idCard='" + idCard + '\'' +
			", age=" + age +
			", gender=" + gender.toString() +
			'}';
	}

	public void speak() {
		System.out.println(this.getClass().getTypeName() + ".speak:" +
			"我是一个好人");
	}

	public int cal(int from, int to) {
		int sum = 0;

		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}

	public int getSum(int num1, int num2) {
		return num1 + num2;
	}

	public boolean isOdd(int number) {
		return number % 2 == 0;
	}

	public void printChar(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}
