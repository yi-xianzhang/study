package com.yixian.basics.type.date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * {@link Calendar}类的使用和源码解析。<br/>
 * ---> {@link java.io.Serializable}
 * ---> {@link Cloneable}   克隆
 * ---> {@link Comparable}
 * 1 使用关键字 abstract 修饰，是一个抽象类。
 * 2 私有化构造器，使用{@link Calendar#getInstance()}获取对象。
 */
public class CalendarTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CalendarTest.class);

    // ------------------------- Date类的静态方法测试学习 -------------------------
    @Test
    public void staticMethodsOfThis() throws Exception {

        // 获取 Calendar 类的对象
        Calendar calendar = Calendar.getInstance();
        print(calendar);
        LOGGER.info(TimeZone.getDefault().toString());
        calendar = Calendar.getInstance(TimeZone.getTimeZone(
                ZoneId.SHORT_IDS.get("CTT")));
        print(calendar);
        Locale[] availableLocales = Calendar.getAvailableLocales();
        for (Locale locale : availableLocales) {
            LOGGER.info(locale.getCountry() + ":" +
                    locale.getDisplayLanguage());
        }
    }

    /**
     * 打印字段。
     * @param calendar {@link Calendar}
     */
    private void print(Calendar calendar) {
        LOGGER.info("ERA：" + calendar.get(Calendar.ERA));
        LOGGER.info("年：" + calendar.get(Calendar.YEAR));
        LOGGER.info("月：" + calendar.get(Calendar.MONTH));
        LOGGER.info("日：" + calendar.get(Calendar.DAY_OF_MONTH));
        LOGGER.info("小时：" + calendar.get(Calendar.HOUR));
        LOGGER.info("分钟：" + calendar.get(Calendar.MINUTE));
    }

    // ------------------------- Date类的构造方法测试学习 -------------------------
    @Test
    public void constructorsOfThis() {
        LOGGER.info("Calendar类是一个抽象类，不可直接通过构造器创建对象。");
    }

    // ----------------------- Date类的非静态成员方法测试学习 -----------------------
    @Test
    public void instanceMethodsOfThis() throws Exception {
        // 获取 Calendar 类的对象
        Calendar calendar = Calendar.getInstance();
        print(calendar);
    }


}
