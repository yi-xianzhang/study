package com.yixian.basics.oop.classes.interface_;

import com.yixian.basics.oop.interfaces.TestInterface;
import org.junit.Test;

/**
 * 接口学习。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 接口的使用
 * @create : 2022-06-12 21:21
 * <p>
 * 1. 释义：为某一种事物提供一种规范。所有实现该接口的类都满足此规范,具体来说，是给出一
 * 些没有实现的方法（也可以没有方法，只提供一个规范），封装到一起，到某个类要使用时，在
 * 根据具体情况把这些方法写出来。
 * 参见{@link java.util.List}、{@link java.io.Serializable}、{@link Usb}
 * {@link Interface}
 * <p>
 * 2. 语法参照 {@link Interface}
 * 3. 小结：
 * (1). JDK1.7之前接口没有方法体。
 * (2). JDK8.0(包含JDK8.0)后接口类可以有默认方法，静态方法，也就是说接口中可以有方法的
 * 具体实现,也可以有抽象方法(可以不写修饰符，默认public abstract，若显示声明，
 * 则必须是public)，参见{@link Interface#method()}、
 * {@link Interface#staticMethod()}
 * <p>
 * (3). 在JDK8静态方法可以不写修饰符，默认public，若显示声明，则必须是public,
 * 默认方法可以不写修饰符，默认public，若显示声明，则必须是public
 * 二者依旧参照{@link Interface}
 * <p>
 * (4). 接口中的属性默认使用了public final static 这三个关键字修饰。
 * 参照{@link InterfaceStarter#propertyTest()}
 * <p>
 * (5). 接口不能被实例化，参见{@link InterfaceStarter#instanceInterface()}
 * (6). 一个类实现了接口，要么将接口的所有抽象方法实现，要么将自己声明为抽象类。
 * 参见{@link SubImpl}、{@link SubImpl2}
 * <p>
 * (7). 一个类可以同时实现多个接口。参见{@link SubImpl2}
 * (8). 接口不能继承其他的类，但是可以继承多个接口。
 * 参见{@link MoreExtends}
 * <p>
 * (9). 接口的修饰符必须是public 和默认的，参见{@link MoreExtends}。
 * <p>
 * 4.接口 vs 继承
 * 接口： like-a  继承 is-a
 * 接口实现解耦：接口规范性 + 动态绑定
 * <p>
 * 5.多态
 * 多态性,参见{@link InterfaceStarter#test()}和{@link Computer#work(Usb)}
 */
public class InterfaceStarter {

	@Test
	public void test() {
		Usb phone = new Phone();
		Usb camera = new Camera();
		Computer computer = new Computer();
		computer.work(phone);
		computer.work(camera);
	}

	@Test
	public void instanceInterface() {
//		new Interface();
	}

	@Test
	public void propertyTest() {
		// 编译成功，说明此属性使用了  static 关键字修饰
		System.out.println(Interface.PI);
		System.out.println(TestInterface.PI);
		System.out.println();
//		Interface.PI = 9; // 编译报错，说明此属性使用了 final 关键字修饰
		Sub sub = new Sub();
		System.out.println(sub.PI);
		System.out.println(Sub.PI);
	}

	@Test
	public void testDb() {
		DBInterface mysql = new MySql();
		execDb(mysql);
		DBInterface oracle = new Oracle();
		execDb(oracle);
	}

	private static void execDb(DBInterface dbInterface) {
		dbInterface.connection();
		dbInterface.close();
	}
}

