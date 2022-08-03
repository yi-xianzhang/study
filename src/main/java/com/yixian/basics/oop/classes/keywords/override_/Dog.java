package com.yixian.basics.oop.classes.keywords.override_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-05 23:48
 */
public class Dog extends Animal {

	/**
	 * 此方法重写了{@link Animal#cry()}方法。
	 */
	@Override
	public void cry() {
		System.out.println(this.getClass().getTypeName() + ".test() : " +
			"狗叫");
	}

	/**
	 * 此方法重写了{@link Animal#getInfo()}方法。
	 */
	@Override
	public String getInfo() {
		return this.getClass().getTypeName() + "狗";
	}

	/**
	 * 此处该注解报错，表示不是重写方法。
	 * @return
	 */
//	@Override
	public String getInfo2() {
		return this.getClass().getTypeName() + "狗";
	}

//	@Override
//	private void eat() {
//		System.out.println(this.getClass().getTypeName() + ".test() : " +
//			"狗吃");
//	}

	@Override
	public void drink() {
		System.out.println(this.getClass().getTypeName() + ".test() : " +
			"动物喝");
	}

}

