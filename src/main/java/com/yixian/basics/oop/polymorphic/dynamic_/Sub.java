package com.yixian.basics.oop.polymorphic.dynamic_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 派生类
 * @create : 2022-06-07 21:41
 */
public class Sub extends Base {

	/**
	 * 江山代有人才出，一代更比一代强
	 */
//	protected int age = 20;


	public int getAge() {
		return age;
	}

	/**
	 * 江山代有人才出，一代更比一代强, 因此子类对象属性 加 20
	 */
	@Override
	public int sumByGet() {
		return this.getAge() + 20;
	}

	/**
	 * 江山代有人才出，一代更比一代强 , 因此子类对象属性 加 20
	 */
//	@Override
//	public int sumByProperty() {
//		return this.age + 20;
//	}
}

