package com.yixian.basics.oop.classes.keywords.modifier;


import java.math.BigInteger;

/**
 * Java学习之修饰符，Java提供了四种访问修饰符，用于控制方法和属性为访问权限。</br>
 * 1.公开级别： private修饰，对外公开
 * 2.受保护级别： 用protected修饰，对子类和同包中的类公开
 * 3.默认级别：无修饰符，同一包的类公开
 * 4.私有级别： private修饰,仅有类本身可以访问
 *
 * 修饰符可修饰属性[4种均可]，行为（方法）[4种均可]，类[仅有public和默认修饰符]
 *
 * @program : JavaSeStudy
 * @description : 修饰符的使用与学习
 * @author : zhang_yx
 * @create : 2022-06-04 17:48
 * @version : 1.0.0
 *
 */
@SuppressWarnings("all")
public class ModifierStarter {

	public static void main(String[] args) {

		// 属性
		PropertyModifier propertyModifier = new PropertyModifier();
		propertyModifier.name = "3w5345";
		propertyModifier.email = "sdgdfnjk";
		propertyModifier.salary = new BigInteger("123");

		// 行为
		MethodModifier methodModifier = new MethodModifier();
		methodModifier.method();
		methodModifier.protectedMethod();
		methodModifier.protectedMethod();
	}
}

