package com.yixian.higher.reflect.base;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @program: JavaSeStudy
 * @description: 人物类
 * @author: zhang_hj
 * @create: 2022-07-27 10:01
 * @version: 1.0.0
 */

@Data
@Comment
public class Person {

    public Double salaryPublic;

    @Comment
    private Integer id;

    private String name;

    private String password;

    private Gender gender;

    private int age;

    private double salary;

    private Double totalSalary;

    private Date birth;

    private LocalDateTime workDate;

    private List<String> honors;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(id, person.id) &&
                Objects.equals(name, person.name) &&
                Objects.equals(password, person.password) &&
                gender == person.gender &&
                Objects.equals(totalSalary, person.totalSalary) &&
                Objects.equals(birth, person.birth) &&
                Objects.equals(workDate, person.workDate) &&
                Objects.equals(honors, person.honors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, gender, age, salary,
                totalSalary, birth, workDate, honors);
    }

    public Comparable<Person> getComparableInstances() {
        return o -> 0;
    }

    public Serializable getSerializableInstances() {
        class SerializableImpl implements Serializable {

        }
        return new SerializableImpl();
    }

    public static class Node {

    }

    private String getPrivateOptId() {
        return this.getClass().getSimpleName();
    }

    String getOptId() {
        return this.getClass().getCanonicalName();
    }


    protected String getProtectedOptId() {
        return this.getClass().getTypeName();
    }

    public String getPublicOptId() {
        return this.getClass().getName();
    }
}

