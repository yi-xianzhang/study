package com.yixian.basics.oop.classes.keywords.final_;

import com.yixian.basics.oop.classes.keywords.final_.exercise.Circle;
import org.junit.Test;

/**
 * final关键字的使用
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : final关键字学习
 * @create : 2022-06-05 12:47
 * <p>
 * 1. 修饰符的一种，可以用来修饰属性，方法，类和局部变量。
 * (1).修饰类时，该类不能被继承,可实例化，参照{@link FinalClass}
 * (2).修饰方法时，该方法不能被他的子类重写,参照{@link FinalMethod}
 * (3).修饰属性时，属性值不能修改,未用static修饰可以在构造器，初始化代码块，属性初始化
 * 时赋值，这三者只能选则其一
 * 使用static修饰可以静态化代码块和静态变量初始化时赋值，这两者只能选择其一。
 * 参见{@link FinalProperty}
 * (4).修饰局部变量时，变量值不能被修改，
 * 参见{@link FinalKeyWordsStarter#localVariable}
 * <p>
 * 2. final和static往往搭配使用，不会导致类加载,底层编译器做了优化。
 * 参见{@link FinalKeyWordsStarter#useStaticFinal}、
 * {@link FinalKeyWordsStarter#useStaticFinal2()}
 * <p>
 * 3.案例 包装器{@link Integer}、{@link Boolean}、{@link String}、{@link Double}
 */
public class FinalKeyWordsStarter {

	@Test
	public void localVariable() {
		final int x = 0;

//		x = 8;

		final int y;

		y = 9;
	}

	@Test
	public void useStaticFinal() {
		System.out.println(StaticFinal.PERSON_RATE);
	}

	@Test
	public void useStaticFinal2() {
		System.out.println(StaticFinal.getPersonRate2());
	}

	@Test
	public void circle() {
		Circle circle = new Circle(4);
		System.out.println("面积 = " + circle.area());
		System.out.println("周长 = " + circle.perimeter());
	}
}

