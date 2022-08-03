package com.yixian.basics.oop.classes.keywords.override_;

import com.yixian.basics.oop.classes.keywords.override_.exercise.Person;
import com.yixian.basics.oop.classes.keywords.override_.exercise.Student;
import org.junit.Test;

/**
 * 方法重写的入门类。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 重写学习
 * @create : 2022-06-05 12:46
 * 1.释义：方法重写(覆盖)就是子类[派生类]有一个方法和父类[基类、超类]的某个方法的
 * 名称、返回类型、形参列表一致，我们就说子类[派生类]的这个方法覆盖了父类[基类、超类]
 * 的那个方法。参见{@link OverrideAnnotationStarter#overrideMethodTest()}方法。
 * 2.细节：
 * (1). 子类[派生类]方法的参数，方法名称要和父类[基类、超类]方法的参数方法名称完全
 * 一样，详细参照{@link Dog#getInfo2()},讲注释的代码块 @Override 取消注释，
 * 则报编译错误。
 * <p>
 * (2).子类[派生类]方法的返回类型要和父类[基类、超类]方法的返回类型一样，或者是父类
 * [基类、超类]返回类型的子类。
 * 例：父类[基类、超类]返回{@link Object},子类[派生类]方法的返回{@link String}。
 * <p>
 * 参见{@link OverrideAnnotationStarter#returnMethod}
 *
 * (3)子类[派生类]不能缩小父类[超类、基类]的访问权限。
 * 详细参见{@link Dog}的注释方法eat，取消注释，就会报错，联系{@link Animal#eat()}
 * 正解参照：{@link Dog}带有@Override注解的方法和{@link Animal}的所有方法。
 */
public class OverrideAnnotationStarter {

	/**
	 * 1.释义
	 * 这是一个重写例子，详细参照{@link Animal#cry()}和{@link Dog#cry()}。
	 */
	@Test
	public void overrideMethodTest() {
		new Dog().cry();
	}

	/**
	 * 2.细节的（2）
	 * 这是一个重写返回类型不一致的例子。
	 * 详细参照{@link Animal#getInfo()}和{@link Dog#getInfo()}。
	 */
	@Test
	public void returnMethod() {
		Dog dog = new Dog();
		System.out.println(dog.getInfo());
	}

	/**
	 * 练习
	 */
	@Test
	public void exercise() {

		Person person = new Person("杨过",(short)80);
		System.out.println("人：" + person.say());

		Student student =
			new Student("欧阳锋",(short)120,"123456",80);
		System.out.println("学生：" + student.say());
	}

}

