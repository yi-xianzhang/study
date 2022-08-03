package com.yixian.basics.oop.classes.keywords.this_.starter;

import com.yixian.basics.oop.classes.keywords.this_.PersonOfThisExec;

/**
 * 关键字之 <tt>this</tt>学习。</br>
 * 1. 释义 ：java虚拟机会给每个对象分配一个<tt>this</tt>，代表当前对象。</br>
 * 2. 作用 : 解决构造器参数和属性赋值的问题。</br>
 * 3. 理解 : ① 简单来说，是那个对象使用，指向的就是那个对象。</br>
 *           ② <tt>this</tt>只能在类中定义的非静态方法中使用
 */
public class ThisKeyWordsStarter {

	private int age;

	private String name;

	/**
	 * 构造器<tt>this</tt>的使用如下
	 */
	public ThisKeyWordsStarter() {
		// 下记访问构造器，必须放在构造器的第一行
		this(34,"mike");
		System.out.println("ThisKeywords的无参构造器ThisKeywords()执行");
	}

	public ThisKeyWordsStarter(int age) {
		age = age;
		System.out.println("ThisKeywords的有参构造器ThisKeywords(int age)执行");
		System.out.println("this.hashCode = " + this.hashCode());
	}

	/**
	 * 属性使用<tt>this</tt>的方式如下
	 * @param age
	 * @param name
	 */
	public ThisKeyWordsStarter(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("ThisKeywords的有参构造器ThisKeywords(int age, " +
			"String name)执行");
		System.out.println("this.hashCode = " + this.hashCode());
	}

	public void say() {
		System.out.println(this.toString());
		System.out.println("方法say()执行");
	}

	/**
	 * 方法的<tt>this</tt>使用如下
	 */
	public void reSay() {
		System.out.println("方法reSay()执行");
		say();
		this.say();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ThisKeywords{" +
			"age=" + this.age +
			", name='" + name + '\'' +
			'}';
	}


	/**
	 * 构造器
	 */
	public static void constructorTest() {
		System.out.println("-------------------构造器的执行-------------------");
		System.out.println(new ThisKeyWordsStarter());
	}

	/**
	 * 方法
	 */
	public static void methodTest() {
		System.out.println("--------------------方法的执行--------------------");
		new ThisKeyWordsStarter().reSay();
	}

	/**
	 * 属性
	 */
	public static void propertyTest() {
		System.out.println("--------------------属性的执行--------------------");
		ThisKeyWordsStarter useThis = new ThisKeyWordsStarter(23, "jack");
		System.out.println("useThis.getAge() = " + useThis.getAge());

		useThis.say();
		System.out.println("useThis.hashCode = " + useThis.hashCode());

		// 就近原则导致下记结果
		ThisKeyWordsStarter notUseThis = new ThisKeyWordsStarter(23);
		notUseThis.say();
		System.out.println("notUseThis.getAge() = " + notUseThis.getAge());
		System.out.println("notUseThis.hashCode = " + notUseThis.hashCode());


		System.out.println("----------------this关键字练习----------------");

	}


	/**
	 * 关键字之 <tt>this</tt>练习
	 */
	public static void thisExec() {
		PersonOfThisExec personOfThisExec =
			new PersonOfThisExec(12,"jack");

		PersonOfThisExec other =
			new PersonOfThisExec(12,"jack");

		System.out.println(personOfThisExec.compareTo(other));
	}

	public static void main(String[] args) {
		constructorTest();
		propertyTest();
		methodTest();
		thisExec();
	}
}


