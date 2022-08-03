package com.yixian.higher.congregation.collection;

import com.yixian.basics.oop.starter.UserInfo;

import java.util.Collection;

public final class OperateUtil {

	/**
	 * 操作{@link UserInfo}
	 *
	 * @param userInfo
	 * @param notNullFlag
	 */
	public static final <E> void operate(E userInfo, boolean notNullFlag) {
		if (notNullFlag && userInfo == null) {
			return;
		}
		System.out.println(userInfo);
	}

	/**
	 * 操作{@link UserInfo}
	 *
	 * @param userInfo
	 */
	public static final <E> void operate(E userInfo) {
		operate(userInfo, false);
	}

	public static final <E> void printCollect(Collection<E> e,
											  boolean notNullFlag) {
		if (e == null) {
			System.out.println(e.getClass().getTypeName() + "类型的对象为空");
			return;
		}
		System.out.println(e.getClass().getTypeName() + "类型:" +
				"打印开始-----------------------------------------------");
		e.stream().forEach(e1 -> operate(e1, notNullFlag));
		System.out.println(e.getClass().getTypeName() + "类型:" +
				"打印结束-----------------------------------------------");
	}

	public static final <E> void printCollect(Collection<E> e) {
		printCollect(e, false);
	}


}
