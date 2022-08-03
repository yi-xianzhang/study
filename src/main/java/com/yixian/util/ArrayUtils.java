package com.yixian.util;

import com.yixian.basics.oop.classes.starter.exec.Book;

import java.util.Arrays;

@SuppressWarnings("all")
public class ArrayUtils {

	/**
	 * 求最大值
	 * @param args
	 * @return
	 */
	public static Double max(double ... args) {
		if (args == null || args.length <= 0) {
			return null;
		}
		double max = 0;
		for (double temp : args) {
			if (max < temp) {
				max = temp;
			}
		}
		return max;
	}

	/**
	 * 查找
	 * @param searchStr
	 * @param datas
	 * @return
	 */
	public static int find(String searchStr, String... datas) {
		if (datas == null || datas.length <= 0) {
			return -1;
		}
		if (searchStr == null) {
			for (int i = 0; i < datas.length; i++) {
				if (datas[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < datas.length; i++) {
				if (searchStr.equals(datas[i])) {
					return i;
				}
			}
		}
		return -1;
	}


	/**
	 * 数组克隆，深拷贝
	 * @param <T>
	 * @return
	 */
	public static <T> T[] arrCopy(T[] ts) {
		return null;
	}


	/***
	 * 数组拷贝，深拷贝
	 * @param books
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Book[] arrCopy(Book[] books)
		throws InstantiationException, IllegalAccessException {
		if (ObjectUtils.isBlankOrEmpty(books)) {
			return books;
		}
		int size = books.length;
		Book[] ret = new Book[size];
		for (int i = 0; i < size; i++) {
			ret[i] = ObjectUtils.mergeObject(books[i]);
		}
		return ret;
	}

	public static void main(String[] args)
		throws IllegalAccessException, InstantiationException {


		Book[] srcBooks = {
			new Book("java", 123),
			new Book("HTML5", 123),
			new Book("C++", 123)
		};


		Book[] books = arrCopy(srcBooks);


		if (ObjectUtils.isBlankOrEmpty(books)) {
			System.out.println("原数组为空");

		} else {
			Arrays.asList(books).stream().forEach(book -> {
				System.out.println(book.toString());
			});
		}


	}
}
