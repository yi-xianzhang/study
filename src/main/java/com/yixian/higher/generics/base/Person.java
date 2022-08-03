package com.yixian.higher.generics.base;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 参数
 * @create : 2022-07-13 22:33
 */
@SuppressWarnings("all")
public class Person<L, M, R> {

    L left;

    M middle;

    R right;

    /**
     * 这样写无法确定类型
     */
//    L[] ts = (L[])new L[10];

    /**
     * 可以之定义
     */
    L[] ts;

    public Person(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public Person() {
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    /**
     * 静态方法泛型返回值的是用
     *
     * @return
     */
    public M getMiddle() {
        return middle;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Person{" +
                "left=" + left +
                ", middle=" + middle +
                ", right=" + right +
                '}';
    }

    /**
     * 静态方法泛型返回值类型和参数类型的使用
     *
     * @param t
     * @param <A>
     * @return
     */
    public static <A> A getInstances(A t) {
        return t;
    }

    /**
     * 静态方法泛型返回值类型和参数类型的使用
     *
     * @param <B>
     * @return
     */
    public <B> B getShow(B b) {
        return b;
    }

    public <B,A> void getShow(B b,A a,L l) {

    }

}
