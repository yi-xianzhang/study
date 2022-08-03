package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-12 21:58
 */
public class Sub implements Interface {

	@Override
	public int cal() {
		System.out.println(" --Sub.method() 执行" );
		return 0;
	}
}

