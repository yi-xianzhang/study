package com.yixian.higher.congregation.collection.queue;

import java.util.NoSuchElementException;

/**
 * {@link java.util.Queue}学习，队列接口。</br>
 * --> {@link java.util.Collection}集合接口
 * --> {@link Iterable}迭代器
 * 1.队列特征：可以在队列的尾部添加元素，在队列的头部删除元素，亦可查找队列的个数，“先进先出”
 * 2.接口信息： {@link java.util.Queue#add(Object)} 在不违背队列的容量限制的情况，往队列中添加一个元素，如果添加成功则返回true,
 * 如果因为容量，限制添加失败了，则抛出{@link IllegalStateException}异常
 * {@link java.util.Queue#offer(Object)} offer方法在不违背容量限制的情况，往队列中添加一个元素，如果添加元素成功，
 * 返回true，如果因为空间限制，无法添加元素则，返回false；
 * {@link java.util.Queue#remove(Object)} 删除此队列的头部元素，若队列长度为0， 则抛出{@link NoSuchElementException}
 * {@link java.util.Queue#poll()} 删除此队列的头部,队列长度为0，返回null
 * {@link java.util.Queue#element()} 获取队列中头部元素，若队列长度为0，则抛出{@link NoSuchElementException}
 * {@link java.util.Queue#peek()} 获取队列的头元素，若队列长度为0，则返回null
 * 3.实现方式：循环数组、链表
 */
public class QueueDemo {


}
