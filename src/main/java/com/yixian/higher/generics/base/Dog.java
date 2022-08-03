package com.yixian.higher.generics.base;

import java.util.Objects;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 狗
 * @create : 2022-07-13 22:02
 */
@SuppressWarnings("all")
public class Dog {

    private String name;

    private int age;

    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() &&
                Objects.equals(getName(), dog.getName()) &&
                Objects.equals(getColor(), dog.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColor());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String print() {
        return this.toString();
    }
}
