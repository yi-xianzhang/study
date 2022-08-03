package com.yixian.higher.generics.base;

import java.util.Objects;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 学生
 * @create : 2022-07-13 23:00
 */
@SuppressWarnings("all")
public class Student {

    private String id;
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Short age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getAge(), student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     *
     * @param name   姓名
     * @param age    年龄
     */
    public Student(String name, Short age) {
        this.name = name;
        this.age = age;
    }


    public Student() {
    }

    public Student(String id, String name, Short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
