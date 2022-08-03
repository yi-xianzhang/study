package com.yixian.basics.oop.polymorphic.pojo;

import com.yixian.basics.oop.polymorphic.pojo.animal.Animal;
import com.yixian.basics.oop.polymorphic.pojo.animal.Cat;
import com.yixian.basics.oop.polymorphic.pojo.animal.Dog;
import com.yixian.basics.oop.polymorphic.pojo.animal.Pig;
import com.yixian.basics.oop.polymorphic.pojo.food.Bone;
import com.yixian.basics.oop.polymorphic.pojo.food.Fish;
import com.yixian.basics.oop.polymorphic.pojo.food.Food;
import com.yixian.basics.oop.polymorphic.pojo.food.Rice;
import lombok.Data;

import java.util.Objects;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 主人类
 * @create : 2022-06-06 19:26
 */

@Data
public class Master {

	private String name;

	public Master(String name) {
		this.name = name;
	}

	public Master() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Master master = (Master) o;
		return Objects.equals(name, master.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Master{" +
			"name='" + name + '\'' +
			'}';
	}

	// --------------------------------多态优化前-------------------------------
	/**
	 * 主人喂食方法，优化前。
	 */
	public void feedBeforeOptimization(Dog dog, Bone bone) {
		System.out.println("主人\t" + name + "\t给\t" + dog.getName() +
			"\t喂食\t" + bone.getName() + "\t");
	}

	public void feedBeforeOptimization(Cat cat, Fish fish) {
		System.out.println("主人\t" + name + "\t给\t" + cat.getName() +
			"\t喂食\t" + fish.getName() + "\t");
	}

	public void feedBeforeOptimization(Pig pig, Rice rice) {
		System.out.println("主人\t" + name + "\t给\t" + pig.getName() +
			"\t喂食\t" + rice.getName() + "\t");
	}


	// --------------------------------多态优化后-------------------------------

	public void feedOptimized(Animal animal, Food food) {
		System.out.println("主人\t" + name + "\t给\t" + animal.getName() +
			"\t喂食\t" + food.getName() + "\t");
	}




}

