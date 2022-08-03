package com.yixian.higher.congregation.other.iterable;

import com.yixian.higher.congregation.Data;
import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

/**
 * {@link Iterable}存在一个抽象方法，可获取一个{@link java.util.Iterator}迭代器对象。
 * 实现这个接口，表示具有迭代能力，也符合Java的接口规范。
 */
import java.util.Spliterator;

/**
 * {@link Iterable}
 */
public class IterableDemo {

	@Test
	public void forEachOfIterable() {
		Data.USER_INFO_LIST.forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	@Test
	public void spliteratorOfIterable() {
		Spliterator<UserInfo> spliterator = Data.USER_INFO_LIST.spliterator();
		if (spliterator == null) {
			return;
		}
		spliterator.forEachRemaining(userInfo -> OperateUtil.operate(userInfo));
	}

	@Test
	public void tryAdvanceOfIterable() {
		Spliterator<UserInfo> spliterator = Data.USER_INFO_LIST.spliterator();
		if (spliterator == null) {
			return;
		}
		spliterator.tryAdvance(userInfo -> OperateUtil.operate(userInfo));
	}
}
