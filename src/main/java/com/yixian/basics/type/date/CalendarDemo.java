package com.yixian.basics.type.date;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.ZoneId;
import java.util.*;

/**
 * {@link Calendar}类的使用和源码解析。<br/>
 */
public class CalendarDemo extends AbstractTestTemplate {

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Calendar calendar = Calendar.getInstance();
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println("ERA：" + calendar.get(Calendar.ERA));
		System.out.println("年：" + calendar.get(Calendar.YEAR));
		System.out.println("月：" + calendar.get(Calendar.MONTH));
		System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时：" + calendar.get(Calendar.HOUR));
		System.out.println("分钟：" + calendar.get(Calendar.MINUTE));

		System.out.println(TimeZone.getDefault());
		calendar = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.SHORT_IDS.get("CTT")));
		System.out.println("ERA：" + calendar.get(Calendar.ERA));
		System.out.println("年：" + calendar.get(Calendar.YEAR));
		System.out.println("月：" + calendar.get(Calendar.MONTH));
		System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时：" + calendar.get(Calendar.HOUR));
		System.out.println("分钟：" + calendar.get(Calendar.MINUTE));

		Locale[] availableLocales = Calendar.getAvailableLocales();
		for (Locale locale : availableLocales) {
			System.out.println(locale.getCountry() + ":" + locale.getDisplayLanguage());
		}

		Object object = null;
		Optional.ofNullable(object).orElse(new Object());


	}

	@Override
	protected void constructorsOfThis() {
		System.out.println("------Calendar是一个抽象类，" + "不可直接通过构造器创建对象------");
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new CalendarDemo());
	}

}
