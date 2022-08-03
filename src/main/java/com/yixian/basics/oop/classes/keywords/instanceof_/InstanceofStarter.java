package com.yixian.basics.oop.classes.keywords.instanceof_;

import org.junit.Test;

/**
 * 用于判断对象是否为XX类型或者XX类型的子类型。参见{@link InstanceofStarter#use()}
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : instanceof关键字学习
 * @create : 2022-06-06 21:56
 */
public class InstanceofStarter {

	@Test
	public void use() {
		Sub sub = new Sub();
		System.out.println(sub instanceof Object);
		System.out.println(sub instanceof Base);
		Base base = new Base();
		System.out.println(base instanceof Object);
		System.out.println(base instanceof Sub);
		Base sub2 = new Sub();
		System.out.println(sub2 instanceof Object);
		System.out.println(sub2 instanceof Base);

		if (sub instanceof Object) {
			System.out.println(((Object) sub).toString());
		}
	}

}

