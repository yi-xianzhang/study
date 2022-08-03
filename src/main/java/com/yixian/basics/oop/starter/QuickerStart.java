package com.yixian.basics.oop.starter;

import com.yixian.basics.enums.Gender;
import org.junit.Test;

public class QuickerStart {

	@Test
	public void test() throws CloneNotSupportedException {
		Car car = new Car();
		car.setAge(2);
		car.setColor("蓝色");
		car.setName("小白");
		System.out.println("原对象" + car);
		Object clone = car.clone();
		if (clone instanceof Car) {
			System.out.println("目标对象" + clone);
		}
		car.setName("小花");
		System.out.println("原对象" + car);
		System.out.println("目标对象" + clone);
	}

	@Test
	public void quickerStart() {
		Person person = new Person();

		person.setAge(1);
		person.setGender(Gender.getInstance(1));
		System.out.println(person);

		Gender[] values = Gender.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	@Test
	public void testMethodOfPerson() {
		Person person = new Person();
		person.speak();
		System.out.println(person.cal(1, 5));
	}

	@Test
	public void isOddOfPerson() {
		System.out.println("42 是奇数吗?  " +
			(new Person().isOdd(42) ? "是偶数" : "是奇数"));
		System.out.println("43 是奇数吗?  " +
			(new Person().isOdd(43) ? "是偶数" : "是奇数"));
		new Person().printChar(10, 20, '$');
		System.out.println(8 * 7 * 6 * 5 * 4 * 3 * 2);
		System.out.println(8 * 7 * 6 * 5 * 4 * 3 * 2 / (91));
		System.out.println(91 * 433);
	}




}

