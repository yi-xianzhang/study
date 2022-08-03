package com.yixian.basics.oop.polymorphic.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-06-06 22:16
 */
public class ExerciseStarter {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.count);
		sub.disPlay();
		sub.show();

		Base base = sub;

		System.out.println(base == sub);
		System.out.println(base.count);
		base.disPlay();
		base.show();
	}

}

