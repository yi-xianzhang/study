package com.yixian.basics.type.date;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * {@link Date} 第一代日期类
 *    ---> {@link java.io.Serializable}
 *    ---> {@link Cloneable}   克隆
 *    ---> {@link Comparable}
 */
@SuppressWarnings("all")
public class DateTest {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(DateTest.class);

	// ------------------------- Date类的静态方法测试学习 -------------------------

	/**
	 * {@link Date}的from方法测试。<br/>
	 *
	 * @throws Exception
	 */
	@Test
	public void staticMethodsOfThis() throws Exception {
		Instant instant = Instant.now();
		LOGGER.info(new SimpleDateFormat(
				"yyyy-MM-dd-HH:mm:ss SSS E").format(Date.from(instant)));
	}

	// ------------------------- Date类的构造方法测试学习 -------------------------

	/**
	 * {@link Date}的构造器学习。
	 * long型参数传递的是毫秒值
	 */
	@Test
	public void constructorsOfThis() {
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS E");
		Date date = new Date();
		LOGGER.info("---------------------Date类的无参构造器------------------");
		LOGGER.info("当前日期：" + date);
		LOGGER.info("当前日期：" + sdf.format(date));

		LOGGER.info("-------------------Date类的Long形参数构造器----------------");
		Date dateLong = new Date(999999999999999999L);
		LOGGER.info("999999999999999999L的日期：" + sdf.format(dateLong));
		dateLong = new Date(60 * 60 * 24 * 1000);
		LOGGER.info("60 * 60 * 24 * 1000的日期：" + sdf.format(dateLong));
	}

	// ----------------------- Date类的非静态成员方法测试学习 -----------------------

	@Test
	public void instanceMethodsOfThis() throws Exception {
		Date date = new Date();
		LOGGER.info("---------------------Date.getTime------------------");
		LOGGER.info("(当前时间)Date.getTime : " + date.getTime());
		LOGGER.info("---------------------Date日期比较------------------");
		Date dateAfter = new Date();
		LOGGER.info("dateAfter的时间戳 : " + dateAfter.getTime());
		LOGGER.info("date的时间戳 ： " + date.getTime());
		LOGGER.info("dateAfter.after(date) : " + dateAfter.after(date));
		LOGGER.info("dateAfter.before(date) : " + dateAfter.before(date));
		LOGGER.info("dateAfter.equals(date) : " + dateAfter.equals(date));

		if (dateAfter.compareTo(date) > 0) {
			LOGGER.info("dateAfter.compareTo(date) : dateAfter > date");
		} else if (dateAfter.compareTo(date) == 0) {
			LOGGER.info("dateAfter.compareTo(date) : dateAfter = date");
		} else {
			LOGGER.info("dateAfter.compareTo(date) : dateAfter < date");
		}
		LOGGER.info("---------------------Date的拷贝------------------");
		Date date1 = new Date();
		Date dateClone = null;

		Object object = date1.clone();

		if (object instanceof Date) {
			dateClone = (Date) object;
		}
		LOGGER.info("原日期克隆前：" +
				new SimpleDateFormat("yyyy-MM-dd").format(date1));
		LOGGER.info("克隆结果：" +
				new SimpleDateFormat("yyyy-MM-dd").format(dateClone));
		dateClone.setMonth(11);
		LOGGER.info("原日期克隆后的日期：" +
				new SimpleDateFormat("yyyy-MM-dd").format(dateClone));
		LOGGER.info("---------------------Date的toInstant------------------");
		LOGGER.info(date.toInstant().toString());
		LOGGER.info("---------------------Date的getTime------------------");
		LOGGER.info(String.valueOf(date.getTime()));
	}
}

