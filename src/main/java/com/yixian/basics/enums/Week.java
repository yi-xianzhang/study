package com.yixian.basics.enums;

/**
 * 星期枚举
 */
public enum Week  implements IA{

    MONDAY("星期一"),

    TUESDAY("星期二"),

    WEDNESDAY("星期三"),

    THURSDAY("星期四"),

    FRIDAY("星期五"),

    SATURDAY("星期六"),

    SUNDAY("星期日");


    private String message;


    Week(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Week{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public void say() {
        System.out.println(this.message);
    }
}
