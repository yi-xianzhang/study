package com.yixian.higher.congregation.collection.list.synchronize;

import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;
import com.yixian.util.number.NumberUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * {@link ArrayList}类的继承层次图。</br>
 * ---> {@link java.util.AbstractList}抽象类
 * -->  {@link java.util.AbstractCollection}
 * -->  {@link List}
 * --> {@link java.util.Collection}
 * --> {@link java.util.RandomAccess}
 * --> {@link Cloneable}
 * --> {@link java.io.Serializable}
 * <p>
 * {@link ArrayList}底层结构分析。</br>
 * <p>
 * 1. 底层结构 ：底层维护数组类型，通过动态扩充/压缩来动态改变数组长度，扩容/压缩均使用的是{@link java.util.Arrays#copyOf}方法，
 * 扩充/压缩实质上是{@link System#arraycopy(Object, int, Object, int, int)}方法，拷贝数组的方式为浅拷贝
 * 可存储null值
 * <p>
 * 2. 扩容机制 ： 每次扩容为原来的1.5倍，int newCapacity = oldCapacity + (oldCapacity >> 1);
 * <p>
 * 3. 遍历方式 ： (1). 可通过{@link ArrayList#get(int)}方法来遍历
 * (2). 可通过迭代器{@link Iterable}的实现类遍历，{@link ArrayList}底层有两个迭代器
 * {@link ArrayList.Itr}类和{@link ArrayList.ListItr}对象来遍历
 * <p>
 * 4.效率问题：由于底层结构，因此{@link ArrayList}的查找速度快，增加和删除速度慢。
 * 5.构造方法的默认容器长度：
 * (1). 无参构造器 : 生成一个默认数组{@link ArrayList#EMPTY_ELEMENTDATA}，数组长度为0
 * (2). int型参数构造器 : 若参数为0，生成一个{@link ArrayList#DEFAULTCAPACITY_EMPTY_ELEMENTDATA}的数组,
 * 若参数 > 0 ,生成长度为int的数组
 * 否则，抛出{@link IllegalArgumentException}异常
 * (3).{@link java.util.Collection}
 * <p>
 * 6.线程安全问题 ：非线程安全，无锁机制。
 * 7.contains，indexof方法均使用的是泛型的equals方法。
 */
public class ArrayListDemo {

	/**
	 * 几种不同的构造方法的测试。
	 * {@link ArrayList#ArrayList()}
	 * {@link ArrayList#ArrayList(int)}
	 * {@link ArrayList#ArrayList(java.util.Collection)}
	 */
	@Test
	public void constructor() {

		ArrayList<Integer> integers = new ArrayList<>();
		System.out.println(ArrayList.class.getTypeName() + "类的无参构造器,new ArrayList<>()生成一个空的数组，数组长度为0," +
			"数组是ArrayList.DEFAULTCAPACITY_EMPTY_ELEMENTDATA");

		ArrayList<Integer> integersIntParams = new ArrayList<>(2);
		System.out.println(ArrayList.class.getTypeName() + "类的有参构造器，new ArrayList<>([int]2),数组长度为指定的值！," +
			"参数值为0，ArrayList.EMPTY_ELEMENTDATA，小于0，抛出异常");
		integers.add(12);
		ArrayList<Integer> integersCollectParams = new ArrayList<>(integers);
		integersCollectParams = new ArrayList<>(integersIntParams);
	}

	/**
	 * {@link ArrayList#trimToSize()}
	 */
	@Test
	public void test() {
		ArrayList<UserInfo> userInfos = new ArrayList<>(10);
		userInfos.add(null);
		userInfos.add(null);
		System.out.println(ArrayList.class.getTypeName() + "trimToSize方法调用前,长度为：" + userInfos.size());
		userInfos.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
		userInfos.trimToSize();
		System.out.println(ArrayList.class.getTypeName() + "trimToSize方法调用后,长度为：" + userInfos.size());
		userInfos.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	@Test
	public void remove() {
		ArrayList<Integer> integers = new ArrayList<>(10);
		ArrayList<Integer> evens = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			if (NumberUtil.even(i))
				evens.add(i);
			integers.add(i);
		}
		integers.removeAll(evens);
		integers.stream().forEach(i -> System.out.println(i));
	}

	@Test
	public void listIterator() {
		ArrayList<Integer> integers = new ArrayList<>(10);
		ArrayList<Integer> evens = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			if (NumberUtil.even(i))
				evens.add(i);
			integers.add(i);
		}
	}

	@Test
	public void removeEvenIndex() {
		List<Integer> integers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			integers.add(i);
		}
		int index = 0;
		System.out.println("----------------删除前--------------------------------------------");
		integers.forEach(integer -> System.out.println(integer));
		System.out.println("----------------删除后--------------------------------------------");

		final Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			if ((index & 1) == 0) {
				iterator.remove();
			}
			index++;
		}
		integers.forEach(integer -> System.out.println(integer));
	}


}

