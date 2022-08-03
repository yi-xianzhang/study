package com.yixian.higher.congregation.collection;

import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

import static com.yixian.higher.congregation.Data.USER_ABSTRACTCOLLECTION;

/**
 * @author Administrator
 * @date 2022-3-19
 * {@link AbstractCollection}集合学习引导,同时测试{@link AbstractCollection}接口的默认方法
 * --> {@link Iterable}
 */
public class AbstractCollectionDemo {

	static {
		System.out.println("USER_INFO_ABSTRACTCOLLECTION的元素打印--------------------------------------------------" +
			"---------------------------------------------");
		USER_ABSTRACTCOLLECTION.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
		System.out.println("USER_INFO_ABSTRACTCOLLECTION的元素打印结束--------------------------------------------------" +
			"---------------------------------------------");
	}

	/**
	 * {@link AbstractCollection#isEmpty()}方法测试
	 */
	@Test
	public void isEmpty() {
		System.out.println("USER_INFO_ABSTRACTCOLLECTION.isEmpty() := " + USER_ABSTRACTCOLLECTION.isEmpty());
	}

	/**
	 * {@link AbstractCollection#isEmpty()}方法测试
	 */
	@Test
	public void contains() {
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setUserName("userName" + (1 + 1));
		userInfo2.setAge(1 + 1);
		userInfo2.setUserCode("UserCode" + (1 + 1));
		System.out.println("USER_INFO_ABSTRACTCOLLECTION.contains(" + userInfo2 + ") := "
			+ USER_ABSTRACTCOLLECTION.contains(userInfo2));
	}

	@Test
	public void toArray() {
		Object[] objects = USER_ABSTRACTCOLLECTION.toArray();
		System.out.println("USER_INFO_ABSTRACTCOLLECTION的长度为：" + USER_ABSTRACTCOLLECTION.size()
			+ ", USER_INFO_ABSTRACTCOLLECTION.toArray() := "
			+ Arrays.toString(objects) + ",数组长度为:" + objects.length);

		AbstractCollection abstractCollection = new ArrayList();
		Object[] objects1 = abstractCollection.toArray();
		System.out.println(Arrays.toString(objects1));
	}

	@Test
	public void add() {
		AbstractCollection<UserInfo> abstractCollection = USER_ABSTRACTCOLLECTION;
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setUserName("userName" + (678 + 1));
		userInfo2.setAge(678 + 1);
		userInfo2.setUserCode("UserCode" + (678 + 1));
		abstractCollection.add(userInfo2);
		abstractCollection.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
	}




}
