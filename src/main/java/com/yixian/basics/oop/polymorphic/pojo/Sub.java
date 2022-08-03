package com.yixian.basics.oop.polymorphic.pojo;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类，派生类
 * @create : 2022-06-06 20:06
 */
public class Sub extends Base{

	@Override
	public void say() {
		System.out.println(this.getClass().getTypeName() + " Sub.say()....");
	}
}

