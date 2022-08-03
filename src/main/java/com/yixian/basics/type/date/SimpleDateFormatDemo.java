package com.yixian.basics.type.date;

import com.yixian.util.StringUtils;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static java.util.Locale.CHINESE;

/**
 * {@link SimpleDateFormat}日期格式化类的使用和源码解析。<br/>
 * 为Format接口的子类。
 * {@link SimpleDateFormat}
 * |-----------> {@link DateFormat}
 * |-----------> {@link java.text.Format}
 */

public class SimpleDateFormatDemo extends AbstractTestTemplate {

	private DateFormat dateFormatByLocale =
		getSimpleDateFormatByLocale("yyyy-MM-dd HH:mm:ssSSS", CHINESE);

	private DateFormat dateFormatByDateFormatSymbols =
		getSimpleDateFormatByDateFormatSymbols("yyyy-MM-dd HH:mm:ssSSS", DateFormatSymbols.getInstance());

	/**
	 * {@link SimpleDateFormat}成员方法测试。
	 *
	 * @throws Exception
	 */
	@Override
	protected void instanceMethodsOfThis() throws Exception {

		TimeZone timeZone = dateFormatByLocale.getTimeZone();
		System.out.println(timeZone.getDisplayName());
		System.out.println(timeZone.getID());

		final Date parse = dateFormatByLocale.parse("2018-12-31 12:33:45109");
		System.out.println(dateFormatByLocale.format(parse));

		Calendar calendar = dateFormatByLocale.getCalendar();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

	}


	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println("-------------------SimpleDateFormat的静态方法getDateInstance-----");
		DateFormat dateInstance = SimpleDateFormat.getDateInstance(0);
		System.out.println(dateInstance.format(new Date()));
		dateInstance = SimpleDateFormat.getDateInstance(1);
		System.out.println(dateInstance.format(new Date()));
		dateInstance = SimpleDateFormat.getDateInstance(2);
		System.out.println(dateInstance.format(new Date()));
		dateInstance = SimpleDateFormat.getDateInstance(3);
		System.out.println(dateInstance.format(new Date()));
		System.out.println("-------------------SimpleDateFormat的静态方法getAvailableLocales-----");

		Locale[] availableLocales = SimpleDateFormat.getAvailableLocales();
		int index = 0;
		for (Locale locale : availableLocales) {
			System.out.println("Country = " + locale.getCountry());
			System.out.println("DisplayLanguage = " + locale.getDisplayLanguage());
			System.out.println("DisplayLanguage = " + locale.getDisplayLanguage());
			System.out.println("DisplayName = " + locale.getDisplayName());
			System.out.println("DisplayScript = " + locale.getDisplayScript());
			System.out.println("Language = " + locale.getLanguage());
			index++;
		}
		System.out.println("-------------------SimpleDateFormat的静态方法getInstance-----");
		DateFormat instance = SimpleDateFormat.getInstance();
		System.out.println(instance.format(new Date()));
		System.out.println("-------------------SimpleDateFormat的静态方法getDateTimeInstance-----");

		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
		System.out.println(instance.format(new Date()));

	}

	/**
	 * {@link SimpleDateFormat}日期格式化类的构造器使用和源码解析。
	 */
	@Override
	protected void constructorsOfThis() {
		System.out.println(dateFormatByLocale.format(new Date()));
		System.out.println(dateFormatByDateFormatSymbols.format(new Date()));
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormatDemo simpleDateFormatDemo = new SimpleDateFormatDemo();
		simpleDateFormatDemo.setStaticMethodsOfThisFlag(false);
		simpleDateFormatDemo.setConstructorsFlag(false);

		TestTemplateUtil.execTemplate(simpleDateFormatDemo);
	}

	private SimpleDateFormat getSimpleDateFormatByLocale(String model,
	                                                     Locale locale) {
		// 断言
		assert locale != null || StringUtils.isNotBlank(model);
		return new SimpleDateFormat(model, locale);
	}


	private SimpleDateFormat getSimpleDateFormatByDateFormatSymbols(String pattern,
	                                                                DateFormatSymbols formatSymbols) {
		return new SimpleDateFormat(pattern, formatSymbols);
	}

}
