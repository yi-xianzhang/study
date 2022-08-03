package com.yixian.higher.congregation.collection.queue.synchronize;

import com.yixian.higher.congregation.collection.OperateUtil;
import com.yixian.basics.oop.starter.UserInfo;
import org.junit.Test;

import java.util.*;

/**
 * {@link PriorityQueue}一种允许高效删除最小元素的集合。
 * --> {@link AbstractQueue}
 * --> {@link Collection}
 * 1.底层结构 : 数组
 * {@link PriorityQueue#PriorityQueue()},实际调用{@link PriorityQueue#PriorityQueue(int, Comparator)}
 * int型参数为{@link PriorityQueue#DEFAULT_INITIAL_CAPACITY},
 * Comparator型参数为null
 * {@link PriorityQueue#PriorityQueue(int)},实际调用{@link PriorityQueue#PriorityQueue(int, Comparator)}
 * int型参数为int,
 * Comparator型参数为null
 * {@link PriorityQueue#PriorityQueue(int, Comparator)} , int型参数为底层数组的长度，比较器用于比较元素的大小。
 * {@link PriorityQueue#PriorityQueue(Collection)}
 * <p>
 * 2.扩容： 旧容量小于64时，扩容为原来的2倍+2，否则，扩容为原来的1.5倍
 */
public class PriorityQueueDemo {

	private static Queue<Integer> priorityQueues = new PriorityQueue<>();

	static {
		for (int i = 0; i < 127; i++) {
			priorityQueues.add(i);
		}
	}


	/**
	 * {@link PriorityQueue#PriorityQueue()}构造器比较。
	 */
	@Test
	public void constructor() {
		System.out.println(PriorityQueue.class.getTypeName() + "无参构造器{PriorityQueue<>()}: ---------------------------");
		PriorityQueue<UserInfo> userInfos = new PriorityQueue<>(8, null);
		userInfos.add(new UserInfo(
			12, "u000001", "admin", "userName1", "loginName1",
			"D000001", 5, "622622622622622622", new Date(), "01"));
		userInfos.add(new UserInfo(12, "u000002", "admin", "userName2",
			"loginName2", "D000002", 0, "622622622622622623", new Date(), "02"));

		userInfos.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
		System.out.println(PriorityQueue.class.getTypeName() + "无参构造器{PriorityQueue<>()}:----------------------------");

		List<UserInfo> userInfos1 = new ArrayList<>();
		userInfos1.add(new UserInfo(
			12, "u000001", "admin", "userName1", "loginName1",
			"D000001", 5, "622622622622622622", new Date(), "01"));
		userInfos1.add(new UserInfo(12, "u000002", "admin", "userName2",
			"loginName2", "D000002", 0, "622622622622622623", new Date(), "02"));
		System.out.println(PriorityQueue.class.getTypeName() + "有参构造器{PriorityQueue<>(" + userInfos1.getClass().getTypeName() + ")}:----------------------------");
		PriorityQueue<UserInfo> userInfosCollection = new PriorityQueue<>(userInfos1);
		userInfosCollection.stream().forEach(userInfo -> OperateUtil.operate(userInfo));
		System.out.println(PriorityQueue.class.getTypeName() + "有参构造器{PriorityQueue<>(" + userInfos1.getClass().getTypeName() + ")}:----------------------------");


	}
}
