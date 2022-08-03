package com.yixian.srccode;

import org.junit.Test;

/**
 * 源代码{@link Object}的学习,此处使用Junit学习。</br>
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 源代码{@link Object}的学习
 * @create : 2022-06-07 22:55
 *
 * <p>
 * 1. 所有的类都需要重写{@link Object#equals(Object)}和{@link Object#hashCode()}
 * <p>
 * 2. 重写{@link Object#equals(Object)}是为了用来判断两个对象是否相等，用于集合
 * {@link java.util.List#contains(Object)}方法的中使用了此方法。
 * <p>
 * 3. 重写{@link Object#hashCode()}返回对象的哈希码值。 为了提高具有哈希结构的容器的效
 * 率，因此在使用容器时，其中存储的对象的类必须重写此方法。
 * <p>
 * 4. 重写两个方法时需要满足下记条件：
 * (1). 两个引用若指向的是同一个对象，则哈希值一定是一样的。
 * (2). equals判断两个对象相等时，hashCode值一定相等。</br>
 * (3). equals判断两个对象不相等时，hashCode值不一定不相等。</br>
 * (4). {@link Object#hashCode()}是通过该对象的内部地址转换成一个整数实现的，因此不等同
 * 于地址。
 * <p>
 * 5. {@link Object#toString()}返回对象的字符串表示。默认为全类名 + @ + 哈希值的16进制
 * 子类往往会重写此方法，用于返回对象的属性信息。
 * 注：打印或者字符串拼接时一个对象时，都会自动的调用后带对象的此方法。
 * <p>
 * 6. {@link Object#finalize()},当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象
 * 上调用该对象一个子类覆盖了处理系统资源或执行其他清理的finalize方法。
 */
@SuppressWarnings("all")
public class ObjectStarter {

	public static final Object OBJECT = new Object();

	/**
	 * 双 == 判断。</br>
	 */
	@Test
	public void equal2() {
		Object obj = new Object();
		Object objTemp = OBJECT;
		System.out.println(objTemp == OBJECT);
		System.out.println(obj == OBJECT);
		String str = "test";
		Object obj2 = str;
		System.out.println(obj2 == str);
		// 注，因为此方法使用的是 == 判断，因此返回的是false
		System.out.println(OBJECT.equals(objTemp));
	}

	/**
	 * {@link Object#equals(Object)}用于判断两个对象是否相等，只能判断引用类型。
	 * 其中常用类大多都重写了{@link Object#equals(Object)}方法，如
	 * {@link Integer#equals(Object)}
	 * {@link String#equals(Object)}
	 * ....
	 */
	@Test
	public void equalsTest() {
		System.out.println("hello".equals(null));
		Integer integer1 = new Integer(5);
		Integer integer2 = new Integer(5);
		System.out.println(integer1 == integer2);
		System.out.println(integer1.equals(integer2));
		System.out.println("==========String ===========");
		String string1 = new String("123");
		String string2 = new String("123");
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		String string3 = "123";
		System.out.println(string1 == string3);
	}

	/**
	 * {@link Object#hashCode()}用于改对象的哈希码值，为了提高哈希表的性能。</br>
	 * 注意：使用{@link java.util.HashMap}、{@link java.util.HashSet}
	 * 时将使用对象的哈希码值。</br>
	 */
	@Test
	public void hashCodeTest() {
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3 = object1;
		System.out.println("object1[" + object1 + "].hashCode() = " +
			object1.hashCode());
		System.out.println("object2[" + object2 + "].hashCode() = " +
			object2.hashCode());
		System.out.println("object3[" + object3 + "].hashCode() = " +
			object3.hashCode());
		System.out.println("object1.hashCode() == object2.hashCode() ? " +
			(object1.hashCode() == object2.hashCode()));
		System.out.println("object1.hashCode() == object3.hashCode() ? " +
			(object1.hashCode() == object3.hashCode()));
	}

	/**
	 * {@link Object#toString()}用于返回该对象的字符串表示。</br>
	 * 常用语开发环境或者打印log时使用。
	 * {@link Object#toString()} 的值形如 java.lang.Object@369f73a2
	 */
	@Test
	public void toStringTest() {
		Monster smallMonster = new Monster("小妖怪", "巡山", 3000);
		System.out.println("OBJECT.toString() = " +
			OBJECT.toString());
		System.out.println("smallMonster.toString() = " +
			smallMonster.toString());
		System.out.println(smallMonster);
	}

	/**
	 * {@link Object#finalize()}，提供给垃圾回收器使用，这个方法将在该对象被
	 * 垃圾回收器回收之前调用。</br>
	 * <p>
	 * 注：可在此方法中写自己的东西
	 * 可用于释放资源，如释放数据库连接，关闭流。
	 */
	@Test
	public void finalizeTest() throws InterruptedException {
		Monster smallMonster = new Monster("小妖怪", "巡山", 3000);
		smallMonster = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("----------程序退出----------");
	}

}

