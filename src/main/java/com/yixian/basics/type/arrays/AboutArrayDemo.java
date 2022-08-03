package com.yixian.basics.type.arrays;


import com.yixian.higher.congregation.Data;
import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AboutArrayDemo {

	@Test
	public void arrayDemo() {
		// int型
		int[] ints = {};
		System.out.println(Arrays.toString(ints));

		// 数值型 初始化 0
		int[] ints1 = new int[10];
		double[] doubles = new double[10];
		System.out.println(Arrays.toString(ints1));
		System.out.println(Arrays.toString(doubles));

		// 引用型，初始化 null
		String[] strings = new String[10];
		System.out.println(Arrays.toString(strings));

		// 包装器类型 初始化 null
		Integer[] integers = new Integer[10];
		System.out.println(Arrays.toString(integers));

		// 布尔型 初始化 false
		boolean[] booleans = new boolean[10];
		System.out.println(Arrays.toString(booleans));

		// char型初始化,码点为0
		char[] chars = new char[10];
		for (int i = 0; i < 10; i++) {
			System.out.println(chars[i]);
		}
	}

	/**
	 * {@link Arrays} 的静态方法测试。<br/>
	 * 数组查找。
	 */
	@Test
	public void sortOrSearchMethodsOfArrays() {
		// 数组排序
		System.out.println("-----------------Arrays.sort()-----------");
		int[] array = {12, 235, 56, 87, 898, 989, 89};
		System.out.println("Arrays.sort()排序前：" + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Arrays.sort()排序后：" + Arrays.toString(array));
		// 数组查找
		System.out.println("数组：" + Arrays.toString(array));
		System.out.println("查找56的索引：" + Arrays.binarySearch(array,56));
	}

	/**
	 * {@link Arrays}的其他方法测试。<br/>
	 */
	@Test
	public void otherMethodsByArrays() {

		// 数组填充方法Arrays.fill()
		System.out.println("--------------------------Arrays.fill()----------" +
			"----------");
		int[] array = {12, 235, 56, 87, 898, 989, 89};
		System.out.println("Arrays.fill()填充前：" + Arrays.toString(array));
		Arrays.fill(array, 1);
		System.out.println("Arrays.fill()填充后：" + Arrays.toString(array));

		// 数组拷贝方法,Arrays.copyOf()，
		// 如果为基本类型数组，或者String型，则为深拷贝，
		// 如果为引用类型数组，则为浅拷贝，
		// copyOfRange同上
		System.out.println("--------------------------Arrays.copyOf()--------" +
			"------------");
		int[] arraySrc = {12, 235, 56, 87, 898, 989, 89};
		System.out.println("Arrays.copyOf()拷贝前，原数组：" +
			Arrays.toString(array));
		int[] arrayTarget = Arrays.copyOf(arraySrc, arraySrc.length);
		System.out.println("Arrays.copyOf()拷贝后，目标数组：" +
			Arrays.toString(arrayTarget));

		// 数组拷贝方法,Arrays.copyOf()，
		// 如果为基本类型数组，或者String型，则为深拷贝，
		// 如果为引用类型数组，则为浅拷贝，
		// copyOfRange同上
		System.out.println("--------------------------Arrays.asList()--------" +
			"------------");
		Integer[] arrayList = {12, 235, 56, 87, 898, 989, 89};
		System.out.println("Arrays.asList()拷贝前，原数组：" +
			Arrays.toString(arrayList));
		List listTarget = Arrays.asList(arrayList);
		System.out.println("Arrays.asList()拷贝后，目标List" + listTarget);
		// 数组的hashCode码取得。
		System.out.println("--------------------------Arrays.hashCode()-----" +
			"---------------");
		System.out.println(Arrays.hashCode(arrayList));
	}


	/**
	 * {@link Arrays}的sort方法详解。
	 */
	@Test
	public void sortMethodOfArraysSourceDemo() {
		int[] a = {12, 235, 56, 87, 898, 989, 89};
		Arrays.sort(a);

		for (int i = 0, j = i; i < a.length - 1; j = ++i) {
			int ai = a[i + 1];
			while (ai < a[j]) {
				a[j + 1] = a[j];
				if (j-- == 0) {
					break;
				}
			}
			a[j + 1] = ai;
		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * {@link System#arraycopy(Object, int, Object, int, int)}对于引用类型
	 * [String]是浅拷贝，并且元素为基本类型、包装类才是深拷贝
	 */
	@Test
	public void testCopy() {
		int src[] = {10, 12, 45, 90};
		int dest[] = new int[src.length];
		System.arraycopy(src, 0, dest, 0, dest.length);
		System.out.println("拷贝完成" + Arrays.toString(dest));
		src[0] = 80;
		System.out.println("目标数组" + Arrays.toString(dest));
		System.out.println("原数组" + Arrays.toString(src));

		UserInfo[] srcRef = new UserInfo[Data.USER_INFO_LIST.size()];
		// 引用类型
		srcRef = Data.USER_INFO_LIST.toArray(srcRef);
		UserInfo destRef[] = new UserInfo[srcRef.length];
		System.arraycopy(srcRef, 0, destRef, 0, destRef.length);

		System.out.println("目标数组" + Arrays.toString(srcRef));
		srcRef[0].setUserCode("changge");
		System.out.println("目标数组" + Arrays.toString(destRef));
		System.out.println("原数组" + Arrays.toString(srcRef));
	}

}
