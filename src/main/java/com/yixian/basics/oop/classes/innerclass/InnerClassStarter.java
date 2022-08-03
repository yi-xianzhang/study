package com.yixian.basics.oop.classes.innerclass;

import org.junit.Test;

/**
 * 内部类概述学习引导
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 内部类学习引导
 * @create : 2022-06-13 21:37
 * <p>
 * 1.基本介绍
 * 一个类的内部又完整的嵌套了另一个类的结构，被嵌套的类称为内部类，嵌套其他类的类称为外部
 * 类。这是我们类的第五大成员，内部类的特点是可以直接访问私有属性，可以体现类的包含关系。
 * <p>
 * 2. 基本语法
 * class Outer {   // 外部类
 *    class Inner {}  // 内部类
 * }
 *
 * 参见 {@link OuterClass}
 *
 * 3. 种类
 * (1). 静态内部类  定义位置外部类成员，有类名，有static修饰
 * (2). 成员内部类  定义位置外部类成员，有类名，无static修饰
 * (3). 局部内部类  定义位置方法或者代码块内，有类名，无修饰符
 * (4). 匿名内部类  定义位置方法或者代码块内，无类名，无修饰符
 *
 * 参见{@link OuterClass}
 *
 */
public class InnerClassStarter {

	@Test
	public void test() {
		OuterClass outerClass = new OuterClass(45);
		try {
			outerClass.defaultMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

