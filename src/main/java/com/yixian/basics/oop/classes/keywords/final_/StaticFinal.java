package com.yixian.basics.oop.classes.keywords.final_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : static和final同时使用，
 * @create : 2022-06-12 18:34
 */
public class StaticFinal {

	static {
		System.out.println("---StaticFinal---");
	}

	public final static double PERSON_RATE = 0.03;

	public static double PERSON_RATE2 = 0.03;

	public final static  double getPersonRate2() {
		return PERSON_RATE2;
	}

}

