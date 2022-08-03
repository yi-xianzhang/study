package com.yixian.higher.congregation.collection;

import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.yixian.higher.congregation.Data.USER_INFO_LIST;

/**
 * @author Administrator
 * @date 2022-3-19
 * {@link Collection}集合学习引导,同时测试{@link Collection}接口的默认方法
 * --> {@link Iterable}
 */
public class CollectionDemo {

	/**
	 * {@link Collection#removeIf(Predicate)}删除Collection集合中满足条件的数据，<td>Predicate</td>为条件表达式，
	 * 基本使用lambda表达式
	 */
	@Test
	public void removeIf() {
		System.out.println("USER_INFO_LIST删除之前：------------------------------------------------------------------------------------------------------");
		USER_INFO_LIST.forEach(userInfo -> OperateUtil.operate(userInfo));
		boolean b = USER_INFO_LIST.removeIf(userInfo -> !"userName1".equals(userInfo.getUserName()));
		System.out.println("USER_INFO_LIST删除之后：------------------------------------------------------------------------------------------------------");
		USER_INFO_LIST.forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	/**
	 * {@link Collection#spliterator()} 获取迭代器{@link Spliterator}对象。
	 * 基本使用lambda表达式
	 */
	@Test
	public void spliterator() {
		Spliterator<UserInfo> spliterator = USER_INFO_LIST.spliterator();
		if (spliterator == null) {
			return;
		}
		spliterator.forEachRemaining(userInfo -> OperateUtil.operate(userInfo));
	}

	/**
	 * {@link Collection#stream()} 获取迭代器{@link Stream}对象。
	 * 基本使用lambda表达式
	 */
	@Test
	public void stream() {
		Stream<UserInfo> stream = USER_INFO_LIST.stream();
		if (stream == null) return;
		stream.forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	/**
	 * {@link Collection#parallelStream()} 获取迭代器{@link Stream}对象，此方式为并行方式
	 * 基本使用lambda表达式
	 */
	@Test
	public void parallelStream() {
		Stream<UserInfo> stream = USER_INFO_LIST.parallelStream();
		if (stream == null) return;
		stream.forEach(userInfo -> OperateUtil.operate(userInfo));
		Stream<UserInfo> stream2 = USER_INFO_LIST.parallelStream();
		System.out.println(stream2.anyMatch(userInfo -> "userName1".equals(userInfo.getUserName())));
	}
}
