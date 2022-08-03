package com.yixian.basics.oop.classes.keywords.this_;

import java.util.Objects;

/**
 * this的练习
 */
public class PersonOfThisExec {


	private int age;

	private String name;

	public PersonOfThisExec(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public PersonOfThisExec(int age) {
		this.age = age;
	}

	public PersonOfThisExec() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonOfThisExec that = (PersonOfThisExec) o;
		return age == that.age &&
			Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	public boolean compareTo(PersonOfThisExec other) {
		return this.equals(other);
	}
}

