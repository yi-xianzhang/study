package com.yixian.higher.congregation.other.stream;

import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;
import com.yixian.util.StringUtils;
import org.junit.Test;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.yixian.higher.congregation.Data.USER_INFO_LIST;

public class StreamDemo {

	public static final Stream<UserInfo> STREAM = USER_INFO_LIST.stream();

	/**
	 * {@link Stream#limit(long)}取得前long条数据
	 */
	@Test
	public void limit() {
		Stream<UserInfo> limit = STREAM.limit(2);
		limit.forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	/**
	 * {@link Stream#distinct}去重测试，注：使用的是对象的{@link UserInfo#equals}方法
	 */
	@Test
	public void distinct() {
		Stream<UserInfo> limit = STREAM.distinct();
		limit.forEach(userInfo -> OperateUtil.operate(userInfo));
	}

	@Test
	public void sorted() {
		Stream<UserInfo> limit = STREAM.sorted((UserInfo o1, UserInfo o2) -> {
			if (o1 == o2) return 0;
			if (o1 == null && o2 != null) return -1;
			if (o2 == null && o1 != null) return 1;
			return o1.compareTo(o2);
		});
	}

	@Test
	public void anyMatch() {
//		System.out.println(STREAM.distinct().anyMatch(userInfo -> "userName1".equals(userInfo.getUserName())));
		System.out.println(STREAM.anyMatch(userInfo -> "userName1".equals(userInfo.getUserName())));
	}

	@Test
	public void allMatch() {
		System.out.println(STREAM.allMatch(userInfo -> "userName1".equals(userInfo.getUserName())));
	}

	@Test
	public void test() {
		Collection<UserInfo> userInfoStream = STREAM.filter(userInfo -> {
			if (userInfo == null) return false;
			String userName = userInfo.getUserName();
			if (StringUtils.isNotEmpty(userName)) return false;

			String substring = userName.substring(userName.length() - 1);
			long index = Long.parseLong(substring);
			return (index & 1) == 0 ? true : false;
		}).collect(Collectors.toList());

		userInfoStream.forEach(userInfo -> OperateUtil.operate(userInfo));
	}




}
