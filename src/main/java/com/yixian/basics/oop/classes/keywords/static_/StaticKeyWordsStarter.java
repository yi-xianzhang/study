package com.yixian.basics.oop.classes.keywords.static_;

import org.junit.Test;

/**
 * static关键字的使用。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : static关键字学习
 * @create : 2022-06-05 12:46
 * <p>
 * 1. static 修饰属性时，该属性为类变量，静态属性，将会被类的所有对象共享。
 * 参见{@link StaticKeyWordsStarter#useStaticProperty()}
 * (1). static变量随着类的加载而开始，随着类的销毁而死亡，可通过类名.变量名或者对象.
 * 变量名，同时需要满足访问修饰符的访问权限。
 * <p>
 * 2. static 修饰方法时，该属性为类方法。
 * 参见{@link StaticKeyWordsStarter#useStaticMethod()}
 * (1). 可通过类名.方法名或者对象.方法名，同时需要满足访问修饰符的访问权限。
 * (2). 类方法不访问非静态成员
 * (3). 非静态成员可访问类成员
 */
public class StaticKeyWordsStarter {

	/**
	 *
	 * @param count
	 * @param child
	 * @return
	 */
	public int add(int count, Child child) {
		child.join();
		count++;
		return count;
	}

	@Test
	public void notUseStatic() {
		int count = 0;
		count = add(count, new Child("白骨精"));
		count = add(count, new Child("狐狸精"));
		count = add(count, new Child("老鼠精"));
		System.out.println("总共有" + count + "个孩子在玩游戏");
	}

	/**
	 *
	 * @param child
	 */
	public void add(Child child) {
		if (child == null)
			return;
		child.join();
	}

	/**
	 * 静态属性测试。
	 */
	@Test
	public void useStaticProperty() {
		Child child1 = new Child("白骨精");
		Child child2 = new Child("狐狸精");
		Child child3 = new Child("老鼠精");
		add(child1);
		add(child2);
		add(child3);
		System.out.println("总共有" + Child.totalNum + "个孩子在玩游戏");
		System.out.println("child1.totalNum = " + child1.totalNum);
		System.out.println("child2.totalNum = " + child2.totalNum);
		System.out.println("child3.totalNum = " + child3.totalNum);
	}

	/**
	 * 静态方法测试。
	 */
	@Test
	public void useStaticMethod() {
		Student child1 = new Student("白骨精");
		child1.payTuition(100);
		Student child2 = new Student("狐狸精");
		child2.payTuition(200);
		Student child3 = new Student("老鼠精");
		child3.payTuition(300);
		System.out.println("当前收到的总学费 = " + Student.getTotalTuition());
	}

	@Test
	public void useStaticFinalMethod() {
		UseStaticFinalMethod.staticFinalMethod();
	}

}

