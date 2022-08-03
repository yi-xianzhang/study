package com.yixian.basics.oop.polymorphic.pojo.food;

import java.util.Objects;

/**
 * 食物类。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 食物类
 * @create : 2022-06-06 19:17
 */
public class Food {

	/**
	 * 名字
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food(String name) {
		this.name = name;
	}

	public Food() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Food food = (Food) o;
		return Objects.equals(name, food.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Food{" +
			"name='" + name + '\'' +
			'}';
	}
}

