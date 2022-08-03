package com.yixian.basics.oop.classes.starter;

/**
 * 构造器学习, 完成对象的初始化,有下记特点
 * 1. 无返回值
 * 2. 方法名必须与类名相同，
 * 3. 在创建对象，系统会自动调用构造器完成对象的初始化
 * 注：修饰符可以是 public，protected，默认修饰符， private
 * <p>
 * <p>
 * 类若没有显示声明构造器，则会默认提供一个无参构造器，否则，不会提供一个无参构造器
 * 下记存在构造器的重载
 * <p>
 * <p>
 * 对象创建流程
 * 1. 在方法区加载类
 * 2. 在堆区为对象开辟空间，并默认初始化(包含默认初始化，显式初始化，代码块初始化
 *    [书写顺序即为执行属性])
 * 3. 调用构造器初始化对象
 */
public class ConstructorExercise {

	public static void main(String[] args) {
		System.out.println(new Humanity());
		System.out.println(new Humanity(12, "jack"));
	}
}

/**
 * 人类
 */
class Humanity {

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 姓名
	 */
	private String name;

	public Humanity() {
		this.age = 18;
	}

	public Humanity(int pAge, String pName) {
		this.age = pAge;
		this.name = pName;
	}

	@Override
	public String toString() {
		return "Humanity{" +
			"age=" + age +
			", name='" + name + '\'' +
			'}';
	}
}


/**
 * 人物
 */
class Person {

	public String name;

	protected int age;

	String constructor;

	private String message;


	public Person() {
		constructor = "Person()";
		message = "构造器" + constructor + "被调用";
		System.out.println(message);
	}

	private Person(int age) {
		this.age = age;
		constructor = "Person(int age)";
		message = "构造器" + constructor + "被调用";
		System.out.println(message);
	}

	protected Person(String name) {
		this.name = name;
		constructor = "Person(String name)";
		message = "构造器" + constructor + "被调用";
		System.out.println(message);
	}

	Person(String name, int age) {
		this.age = age;
		this.name = name;
		constructor = "Person(String name, int age)";
		message = "构造器" + constructor + "被调用";
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	public static void main(String[] args) {
		System.out.println(new Person());
		System.out.println(new Person(78));
		System.out.println(new Person("jack"));
		System.out.println(new Person("make", 30));
	}
}


/**
 * 反编译使用，javap [类文件名]
 */
class Dog {

	public Dog(String name) {

	}
}


