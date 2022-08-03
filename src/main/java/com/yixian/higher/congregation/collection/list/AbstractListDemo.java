package com.yixian.higher.congregation.collection.list;

import com.yixian.higher.congregation.Data;
import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * {@link AbstractList}的测试。</br>
 * --> {@link java.util.AbstractCollection}
 * -->{@link List}
 * {@link AbstractList}的测试。
 */
public class AbstractListDemo {

	private static final AbstractList<UserInfo> USER_INFO_ABSTRACT_LIST =
		Data.USER_ABSTRACT_LIST;

	/**
	 * {@link AbstractList#clear()}
	 */
	@Test
	public void clear() {
		USER_INFO_ABSTRACT_LIST.clear();
		USER_INFO_ABSTRACT_LIST.stream().forEach(userInfo ->
			OperateUtil.operate(userInfo));
	}

	/**
	 * {@link AbstractList#listIterator()}
	 */
	@Test
	public void userInfoListIterator() {
		AbstractList<UserInfo> distinct = (AbstractList) USER_INFO_ABSTRACT_LIST
			.stream().distinct().collect(Collectors.toList());
		ListIterator<UserInfo> userInfoListIterator = distinct.listIterator();
		if (userInfoListIterator.hasNext()) {
			System.out.println(userInfoListIterator.next());
		}

		ListIterator<UserInfo> userInfoListIterator2 = distinct.listIterator();
		if (userInfoListIterator2.hasNext()) {
			System.out.println(userInfoListIterator2.next());
		}
	}

	/**
	 * {@link AbstractList#subList(int, int)}测试。
	 */
	@Test
	public void subList() {
		List<UserInfo> collect = USER_INFO_ABSTRACT_LIST.stream()
			.distinct().collect(Collectors.toList());
		List<UserInfo> userInfos = collect.subList(2, 5);
		userInfos.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
	}




}
