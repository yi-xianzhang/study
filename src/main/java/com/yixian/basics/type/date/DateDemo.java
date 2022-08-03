package com.yixian.basics.type.date;


import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateDemo extends AbstractTestTemplate {

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Date date = new Date();
		System.out.println("---------------------Date.getTime------------------");
		System.out.println("(当前时间)Date.getTime : " + date.getTime());
		System.out.println("---------------------Date日期比较------------------");
		Date dateAfter = new Date();
		System.out.println("dateAfter的时间戳 : " + dateAfter.getTime());
		System.out.println("date的时间戳 ： " + date.getTime());
		System.out.println("dateAfter.after(date) : " + dateAfter.after(date));
		System.out.println("dateAfter.before(date) : " + dateAfter.before(date));
		System.out.println("dateAfter.equals(date) : " + dateAfter.equals(date));

		if (dateAfter.compareTo(date) > 0) {
			System.out.println("dateAfter.compareTo(date) : dateAfter > date");
		} else if (dateAfter.compareTo(date) == 0) {
			System.out.println("dateAfter.compareTo(date) : dateAfter = date");
		} else {
			System.out.println("dateAfter.compareTo(date) : dateAfter < date");
		}
		System.out.println("---------------------Date的拷贝------------------");
		Date date1 = new Date();
		Date dateClone = null;

		Object object = date1.clone();

		if (object instanceof Date) {
			dateClone = (Date) object;
		}
		System.out.println("原日期克隆前：" + new SimpleDateFormat("yyyy-MM-dd").format(date1));
		dateClone.setMonth(12);
		System.out.println("原日期克隆后：" + new SimpleDateFormat("yyyy-MM-dd").format(date1));
		System.out.println("原日期克隆后的日期：" + new SimpleDateFormat("yyyy-MM-dd").format(dateClone));

		System.out.println("---------------------Date的toInstant------------------");
		System.out.println(date.toInstant());
		System.out.println("---------------------Date的getTime------------------");
		System.out.println(date.getTime());

	}

	/**
	 * {@link Date}的from方法测试。<br/>
	 *
	 * @throws Exception
	 */
	@Override
	protected void staticMethodsOfThis() throws Exception {
		Instant instant = Instant.now();
		System.out.println(new SimpleDateFormat(
			"yyyy-MM-dd-HH:mm:SSSss").format(Date.from(instant)));
	}

	@Override
	protected void constructorsOfThis() {

		Date date = new Date();
		System.out.println("---------------------Date类的无参构造器------------------");
		System.out.println("当前日期：" + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("当前日期：" + sdf.format(date));

		System.out.println("---------------------Date类的Long形参数构造器------------------");
		Date dateLong = new Date(999999999999999999L);
		System.out.println("999999999999999999L的日期：" + dateLong);
		System.out.println("999999999999999999L的日期：" + sdf.format(dateLong));
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new DateDemo());
	}

}

