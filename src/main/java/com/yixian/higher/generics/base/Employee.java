package com.yixian.higher.generics.base;

import java.util.Objects;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 雇员类
 * @create : 2022-07-17 01:17
 */
@SuppressWarnings("all")
public class Employee implements Comparable<Employee> {

    private String name;

    private double salary;

    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", salary = " + salary +
                ", birthday = " + birthday.toString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Employee o2) {
        if (o2 == null) {
            return 0;
        }
        // 先比较name
        int resTemp = this.getName().compareTo(o2.getName());
        if  (resTemp != 0) {
            return resTemp;
        }
        return this.getBirthday().compareTo(o2.getBirthday());
    }
}
