package com.yixian.higher.congregation.collection.list.asynchronous;

import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;

import java.util.*;

/**
 * {@link Vector},相对线程安全。
 * --> {@link AbstractList}
 * --> {@link List}
 * --> {@link RandomAccess}
 * --> {@link Cloneable}
 * --> {@link java.io.Serializable}
 * <p>
 * {@link Vector}底层结构分析。</br>
 * <p>
 * 1. 底层结构 ：底层维护数组类型，通过动态扩充/压缩来动态改变数组长度，扩容/压缩均
 *    使用的是{@link Arrays#copyOf}方法，扩充/压缩实质上是
 *    {@link System#arraycopy(Object, int, Object, int, int)}方法，拷贝数组的方式
 *    为浅拷贝。
 * 2.扩容规律 ： {@link Vector}中存在一个成员属性<tt>capacityIncrement<tt/>来表示
 *   每次要扩充的容量大小若<tt>capacityIncrement<tt/>大于0，则扩容为
 *   原来的长度+capacityIncrement的大小否则，扩容为原来的2倍
 * 3.线程问题 ：相对线程安全，对于复合操作无法绝对保证线程安全
 * 4.锁机制 ： 使用关键字修饰方法<tt>synchronized</tt>,重量级锁，效率较低
 * 5.构造器 :  {@link Vector#Vector()}默认构造器，初始化长度为10,扩容因子为
 *            capacityIncrement为0
 * {@link Vector#Vector(int initialCapacity)} 初始化长度为initialCapacity，
 * 扩容因子为capacityIncrement为0
 * {@link Vector#Vector(int initialCapacity, int capacityIncrement)}初始化长度为
 * initialCapacity,扩容因子为capacityIncrement
 * {@link Vector#Vector(Collection)}初始化长度为Collection的长度,扩容因子为0
 */
public class VectorDemo {
	Vector<UserInfo> vector = new Vector();

	public static void main(String[] args) {
		List<UserInfo> userInfoList = new ArrayList<>();
		UserInfo userInfo = new UserInfo();
		userInfoList.add(userInfo);
		userInfoList.add(userInfo);
		userInfoList.stream().forEach(userInfo1 -> OperateUtil.operate(userInfo));
	}


}
