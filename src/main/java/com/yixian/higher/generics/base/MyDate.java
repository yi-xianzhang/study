package com.yixian.higher.generics.base;

import java.util.Objects;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-07-17 01:19
 */
@SuppressWarnings("all")
public class MyDate implements Comparable<MyDate>{

    private int year;

    private byte month;

    private byte day;

    public MyDate(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return getYear() == myDate.getYear() &&
                getMonth() == myDate.getMonth() &&
                getDay() == myDate.getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year = " + year +
                ", month = " + month +
                ", day = " + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o2) {
        // 比较生日
        int yearMinus = this.getYear() - o2.getYear();
        if  (yearMinus != 0) {
            return yearMinus;
        }
        int monthMinus = this.getMonth() - o2.getMonth();
        if  (monthMinus != 0) {
            return monthMinus;
        }
        return this.getDay() - o2.getDay();
    }
}
