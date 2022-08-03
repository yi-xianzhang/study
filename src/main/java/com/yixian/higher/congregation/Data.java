package com.yixian.higher.congregation;

import com.yixian.basics.oop.starter.UserInfo;

import java.util.*;

public final class Data {

	/**
	 * {@link List}
	 */
	public static final List<UserInfo> USER_INFO_LIST = new ArrayList<>();

	/**
	 * {@link Set}
	 */
	public static final Set<UserInfo> USER_INFO_SET = new HashSet<>();

	/**
	 * {@link Collection}
	 */
	public static final Collection<UserInfo> USER_INFO_COLLECTION =
		new ArrayList<>();

	/**
	 * {@link AbstractCollection}
	 */
	public static final AbstractCollection<UserInfo> USER_ABSTRACTCOLLECTION =
		new ArrayList<>();

	/**
	 * {@link AbstractList}
	 */
	public static final AbstractList<UserInfo> USER_ABSTRACT_LIST =
		new ArrayList<>();

	static {
		for (int i = 0; i < 1; i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName("userName" + (i + 1));
			userInfo.setAge(i + 1);
			userInfo.setUserCode("UserCode" + (i + 1));

			USER_INFO_LIST.add(userInfo);
			USER_INFO_LIST.add(userInfo);



			UserInfo userInfo2 = new UserInfo();
			userInfo2.setUserName("userName" + (i + 1));
			userInfo2.setAge(i + 1);
			userInfo2.setUserCode("UserCode" + (i + 1));
			USER_INFO_LIST.add(userInfo2);
		}
		USER_ABSTRACTCOLLECTION.addAll(USER_INFO_LIST);
		USER_INFO_COLLECTION.addAll(USER_INFO_LIST);
		USER_INFO_SET.addAll(USER_INFO_LIST);
		USER_ABSTRACT_LIST.addAll(USER_INFO_LIST);
	}

}
