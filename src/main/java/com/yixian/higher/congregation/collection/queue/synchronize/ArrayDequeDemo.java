package com.yixian.higher.congregation.collection.queue.synchronize;

import org.junit.Test;

import java.util.ArrayDeque;

/**
 * {@link ArrayDeque}循环数组构造双向链表。
 * 1.底层结构 ：数组
 * 2.构造器：{@link ArrayDeque#ArrayDeque()}:默认长度16
 * {@link ArrayDeque#ArrayDeque(int)}:若int型参数小于8，底层数组长度为8，
 * 否则长度为大于int型参数的最小2的次幂数且不能超过2的30次幂。
 * {@link ArrayDeque#ArrayDeque(java.util.Collection)} Collection参数的size小于8，底层数组长度为8，
 * 否则长度为大于Collection参数的size的最小2的次幂数且不能超过2的30次幂。
 * 3.扩容： 每次扩容为原来的2倍，最大容量不能超过{@link Integer#MAX_VALUE}
 */
public class ArrayDequeDemo {

	/**
	 * {@link ArrayDeque#ArrayDeque()}无参构造器，底层数组长度为16
	 * {@link ArrayDeque#ArrayDeque(int)}int型参数构造器，若int型参数小于8，底层数组长度为8，
	 * 否则长度为大于int型参数的最小2的次幂数且不能超过2的30次幂
	 */
	@Test
	public void constructor() {
		// 无参数构造器
		ArrayDeque<String> strings = new ArrayDeque<String>();
		System.out.println(strings);

		// int型参数构造器，底层数组长度为
		ArrayDeque<String> stringsByParamInt = new ArrayDeque<String>(3);
		System.out.println(stringsByParamInt);
		System.out.println(5 >> 1);
	}

	@Test
	public void test() {
		// 0x00020000 ： 表示2的17次方
		for (int i = 0x00020000; i < (0x00020000 + 1000); i++) {
			System.out.println(i + ":" + test(i));
		}

		System.out.println((1 + 1) & (8 - 1));
	}

	public int test(int initialCapacity) {
		initialCapacity |= (initialCapacity >>> 1);
		initialCapacity |= (initialCapacity >>> 2);
		initialCapacity |= (initialCapacity >>> 4);
		initialCapacity |= (initialCapacity >>> 8);
		initialCapacity |= (initialCapacity >>> 16);
		initialCapacity++;
		return initialCapacity;
	}
}
