package com.yixian.higher.congregation.collection.queue.synchronize;

import com.yixian.higher.congregation.collection.OperateUtil;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * {@link LinkedList}链表学习。</br>
 * --> {@link List}
 * --> {@link java.util.Deque}
 * --> {@link Cloneable}
 * --> {@link java.io.Serializable}
 * --> {@link java.util.AbstractSequentialList}
 * <p>
 * 1.底层结构：链表，实现{@link java.util.Deque}，具备了双向链表的特性(可在头尾获取/删除/添加元素)
 * 实现{@link java.util.Queue}，具备了队列的特性(先进先出)
 * 底层维护了一个Node类型的节点，其中有以下三个成员，
 * E item;        元素参数
 * Node<E> next;  元素的前一个Node
 * Node<E> prev;  元素的后一个Node
 * 2.效率问题：由于底层结构，因此{@link LinkedList}的增删速度快，查找速度慢。
 * 3.构造器：由于底层结构的原因，{@link LinkedList}的几个重载的构造器差别不大
 * 4.迭代器:
 */
public class LinkedListDemo {

	public static final LinkedList<String> STRING_LINKED_LIST = new LinkedList<>();

	static {
		for (int i = 0; i < 5; i++) {
			STRING_LINKED_LIST.add("" + i + i);
		}
	}

	/**
	 * {@link LinkedList}私有方法的记录：
	 * {@link LinkedList#linkFirst(Object)}修改链表的第一个元素为Object
	 * {@link LinkedList#linkLast(Object)}修改链表的最后一个元素为Object
	 * {@link LinkedList#linkBefore(Object, LinkedList.Node)}在LinkedList.Node前插入元素Object
	 * {@link LinkedList#unlinkFirst(LinkedList.Node)}将LinkedList.Node从链表中删除，并将first设置成LinkedList.Node的后继，
	 * 若{@link LinkedList.Node.next}为null,则若{@link LinkedList.last}设置为null
	 * {@link LinkedList#unlinkLast(LinkedList.Node)}将LinkedList.Node从链表中删除，并将last设置成LinkedList.Node的前驱，
	 * 若{@link LinkedList.Node.prev}为null,则first设置为null
	 * {@link LinkedList#unlink(LinkedList.Node)}将LinkedList.Node从链表中删除，
	 */
	public void privateMethods() {

	}

	/**
	 * {@link LinkedList#getFirst()}：获取LinkedList的第一个元素
	 */
	@Test
	public void getFirst() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getName() + "类型,STRING_LINKED_LIST.getFirst() : "
			+ STRING_LINKED_LIST.getFirst());
	}


	/**
	 * {@link LinkedList#getLast()}：获取LinkedList的最后一个元素
	 */
	@Test
	public void getLast() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getName() + "类型,STRING_LINKED_LIST.getLast() : "
			+ STRING_LINKED_LIST.getLast());
	}

	/**
	 * {@link LinkedList#removeFirst()}：删除LinkedLis的第一个元素,
	 * 实质上使用的是{@link LinkedList#unlinkFirst(LinkedList.Node)}
	 */
	@Test
	public void removeFirst() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".removeFirst()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getName() + "类型,STRING_LINKED_LIST.removeFirst() : "
			+ STRING_LINKED_LIST.removeFirst());
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".removeFirst()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#removeLast()} ：删除LinkedLis的最后一个元素,
	 * 实质上使用的是{@link LinkedList#unlinkLast(LinkedList.Node)}
	 */
	@Test
	public void removeLast() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".removeLast()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getName() + "类型,STRING_LINKED_LIST.removeLast() : "
			+ STRING_LINKED_LIST.removeLast());
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".removeLast()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#addFirst(Object)} 在链表的第一个元素的位置添加Object,
	 * 实质上使用的是{@link LinkedList#linkFirst(Object)}
	 */
	@Test
	public void addFirst() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addFirst()执行前的集合内容-------------------");
		STRING_LINKED_LIST.addFirst("addFirst");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addFirst()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#addLast(Object)} 在链表的第一个元素的位置添加Object,
	 * 实质上使用的是{@link LinkedList#linkLast(Object)}
	 */
	@Test
	public void addLast() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addLast()执行前的集合内容-------------------");
		STRING_LINKED_LIST.addLast("addLast");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addLast()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}


	/**
	 * {@link LinkedList#remove(Object)} 在链表的第一个元素的位置添加Object,
	 * 实质上使用的是{@link LinkedList#unlink(LinkedList.Node)}
	 */
	@Test
	public void remove() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove([String]33) :" + STRING_LINKED_LIST.remove("33"));
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#addAll(int, Collection)}  在链表的第一个参数位置添加一个集合
	 */
	@Test
	public void addAll() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addAll()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addAll([int]2," + STRING_LINKED_LIST + ") :"
			+ STRING_LINKED_LIST.addAll(2, STRING_LINKED_LIST));
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addAll()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#peek()},获取链表的头部元素。
	 */
	@Test
	public void peek() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".addAll()执行前的集合内容------------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".peek() :" + STRING_LINKED_LIST.peek());
	}

	/**
	 * {@link LinkedList#add(int, Object)}添加元素。</br>
	 */
	@Test
	public void add() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".add()执行前的集合内容-------------------");
		STRING_LINKED_LIST.add(0, "add01");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);

		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".add()执行前的集合内容-------------------");
		STRING_LINKED_LIST.add(4, "add021");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);

	}

	/**
	 * {@link LinkedList#poll()}删除链表第一个元素并返回第一个元素值。</br>
	 */
	@Test
	public void poll() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".poll()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".poll()" + STRING_LINKED_LIST.poll());
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".poll()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}

	/**
	 * {@link LinkedList#poll()}删除链表第一个元素并返回第一个元素值。</br>
	 */
	@Test
	public void removeNoParam() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()" + STRING_LINKED_LIST.remove());
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".remove()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}


	/**
	 * {@link LinkedList#offer(Object)} 在链表尾部加入元素Object
	 */
	@Test
	public void offer() {
		OperateUtil.printCollect(STRING_LINKED_LIST);
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".offer()执行前的集合内容-------------------");
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".offer()：" + STRING_LINKED_LIST.offer("offer01"));
		System.out.println(STRING_LINKED_LIST.getClass().getTypeName() + ".offer()执行后的集合内容-------------------");
		OperateUtil.printCollect(STRING_LINKED_LIST);
	}
}
