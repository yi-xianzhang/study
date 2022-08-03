package com.yixian.basics.oop.classes.keywords.final_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : final修饰方法时，该方法不能被子类重写
 * @create : 2022-06-12 18:05
 */
public class FinalMethod {

	public final void test() {

	}
}

class SubMethod extends FinalMethod {

//	public final void test() {
//
//	}
}

