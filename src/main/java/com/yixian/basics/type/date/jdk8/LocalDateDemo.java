package com.yixian.basics.type.date.jdk8;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Objects;

@SuppressWarnings("all")
public class LocalDateDemo extends AbstractTestTemplate<LocalDate> {

	/**
	 * {@link LocalDate}的now方法测试。<br/>
	 */
	public static void nowMethodsOfLocalDate() {
		LocalDate localDateNoParam = LocalDate.now();
		System.out.println("LocalDate的now()方法执行：" + localDateNoParam);

		LocalDate localDateClockParam = LocalDate.now(Clock.system(ZoneId.of("Asia/Shanghai")));
		System.out.println("LocalDate的now(" + Clock.system(ZoneId.of("Asia/Shanghai")) + " )方法执行："
			+ localDateClockParam);

		LocalDate localDateZoneIdParam = LocalDate.now(ZoneId.of("Asia/Shanghai"));
		System.out.println("LocalDate的now(" + ZoneId.of("Asia/Shanghai") + " )方法执行："
			+ localDateZoneIdParam);

	}

	/**
	 * {@link LocalDate}的静态方法of测试。<br/>
	 */
	private static void of() {
		System.out.println("LocalDate的of（2021,12,12）：= " + LocalDate.of(2021, 12, 13));
		System.out.println("LocalDate的of（2021," + Month.APRIL + ",12）：= " +
			LocalDate.of(2021, Month.APRIL, 12));
	}

	/**
	 * {@link LocalDate}的静态方法ofYearDay测试。<br/>
	 */
	private static void ofYearDay() {
		System.out.println("LocalDate的ofYearDay（2021,45）：= " + LocalDate.ofYearDay(2021, 45));
	}

	/**
	 * {@link LocalDate}的静态方法ofEpochDay测试。<br/>
	 */
	private static void ofEpochDay() {
		System.out.println("LocalDate的ofEpochDay（12）：= " + LocalDate.ofEpochDay(12));
	}

	/**
	 * {@link LocalDate}的静态方法ofEpochDay测试。<br/>
	 */
	private static void from(TemporalAccessor temporal) {
		Objects.requireNonNull(temporal, TemporalAccessor.class.getName() + "型参数不能为空！");
		LocalDate from = LocalDate.from(temporal);
		System.out.println("LocalDate.from(" + temporal + ") : = " + from);
	}

	/**
	 * {@link LocalDate}的静态方法parse测试。<br/>
	 *
	 * @param text
	 */
	private static void parse(CharSequence text) {
		System.out.println("LocalDate的parse(" + text + ") : = " + LocalDate.parse(text));
	}

	/**
	 * {@link LocalDate}的静态方法parse测试。<br/>
	 *
	 * @param text
	 * @param formatter
	 */
	private static void parse(CharSequence text, DateTimeFormatter formatter) {
		System.out.println("LocalDate的parse(" + text + "," + formatter + ") : = "
			+ LocalDate.parse(text, formatter));
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		nowMethodsOfLocalDate();
		of();
		ofYearDay();
		ofEpochDay();
		from(LocalDate.now());
		parse("2021-10-12");
		parse("2021-10-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	@Override
	protected void constructorsOfThis() {
		System.out.println("Constructor methods exec!!");
	}

	/**
	 * {@link LocalDate}的成员方法isSupported的测试。<br/>
	 *
	 * @param localDate
	 * @param unit
	 */
	private void isSupported(LocalDate localDate, TemporalUnit unit) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的isSupported(" + unit + ") ：= " + localDate.isSupported(unit));
	}

	/**
	 * {@link LocalDate}的成员方法isSupported的测试。<br/>
	 *
	 * @param localDate
	 * @param field
	 */
	private void isSupported(LocalDate localDate, TemporalField field) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的isSupported(" + field + ") ：= " + localDate.isSupported(field));
	}

	/**
	 * {@link LocalDate}的成员方法range的测试。<br/>
	 *
	 * @param localDate
	 * @param field
	 */
	private void range(LocalDate localDate, TemporalField field) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的range(" + field + ") ：= " + localDate.range(field));
	}

	/**
	 * {@link LocalDate}的成员方法get的测试。<br/>
	 *
	 * @param localDate
	 * @param field
	 */
	private void get(LocalDate localDate, TemporalField field) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的get(" + field + ") ：= " + localDate.get(field));
	}

	/**
	 * {@link LocalDate}的成员方法getChronology的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getChronology(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getChronology( ) ：= " + localDate.getChronology());
	}

	/**
	 * {@link LocalDate}的成员方法getEra的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getEra(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getEra( ) ：= " + localDate.getEra());
	}

	/**
	 * {@link LocalDate}的成员方法getYear的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getYear(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getYear( ) ：= " + localDate.getYear());
	}

	/**
	 * {@link LocalDate}的成员方法getMonthValue的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getMonthValue(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getMonthValue( ) ：= " + localDate.getMonthValue());
	}

	/**
	 * {@link LocalDate}的成员方法getMonth的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getMonth(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getMonth( ) ：= " + localDate.getMonth());
	}

	/**
	 * {@link LocalDate}的成员方法getDayOfMonth的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getDayOfMonth(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getDayOfMonth( ) ：= " + localDate.getDayOfMonth());
	}

	/**
	 * {@link LocalDate}的成员方法getDayOfYear的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getDayOfYear(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getDayOfYear( ) ：= " + localDate.getDayOfYear());
	}

	/**
	 * {@link LocalDate}的成员方法getDayOfWeek的测试。<br/>
	 *
	 * @param localDate
	 */
	private void getDayOfWeek(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的getDayOfWeek( ) ：= " + localDate.getDayOfWeek());
	}

	/**
	 * {@link LocalDate}的成员方法isLeapYear的测试。<br/>
	 *
	 * @param localDate
	 */
	private void isLeapYear(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的isLeapYear( ) ：= " + localDate.isLeapYear());
	}

	/**
	 * {@link LocalDate}的成员方法lengthOfMonth的测试。<br/>
	 *
	 * @param localDate
	 */
	private void lengthOfMonth(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的lengthOfMonth( ) ：= " + localDate.lengthOfMonth());
	}

	/**
	 * {@link LocalDate}的成员方法lengthOfYear的测试。<br/>
	 *
	 * @param localDate
	 */
	private void lengthOfYear(LocalDate localDate) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的lengthOfYear( ) ：= " + localDate.lengthOfYear());
	}

	/**
	 * {@link LocalDate}的成员方法with的测试。<br/>
	 *
	 * @param localDate
	 * @param adjuster
	 */
	private void with(LocalDate localDate, TemporalAdjuster adjuster) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的with( ) ：= " + localDate.with(adjuster));
	}

	/**
	 * {@link LocalDate}的成员方法with的测试。<br/>
	 *
	 * @param localDate
	 * @param field
	 * @param newValue
	 */
	private void with(LocalDate localDate, TemporalField field, long newValue) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的with(" + field + "," + newValue + ") ：= " + localDate.with(field, newValue));
	}

	/**
	 * {@link LocalDate}的成员方法withYear测试。<br/>
	 *
	 * @param localDate
	 * @param year
	 */
	private void withYear(LocalDate localDate, int year) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的withYear(" + year + ") ：= " + localDate.withYear(year));
	}

	/**
	 * {@link LocalDate}的成员方法withMonth测试。<br/>
	 *
	 * @param localDate
	 * @param month
	 */
	private void withMonth(LocalDate localDate, int month) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的withMonth(" + month + ") ：= " + localDate.withMonth(month));
	}

	/**
	 * {@link LocalDate}的成员方法dayOfMonth测试。<br/>
	 *
	 * @param localDate
	 * @param dayOfMonth
	 */
	private void withDayOfMonth(LocalDate localDate, int dayOfMonth) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的withDayOfMonth(" + dayOfMonth + ") ：= " + localDate.withDayOfMonth(dayOfMonth));
	}

	/**
	 * {@link LocalDate}的成员方法withDayOfYear测试。<br/>
	 *
	 * @param localDate
	 * @param dayOfYear
	 */
	private void withDayOfYear(LocalDate localDate, int dayOfYear) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的withDayOfYear(" + dayOfYear + ") ：= " + localDate.withDayOfYear(dayOfYear));
	}

	/**
	 * {@link LocalDate}的成员方法plus测试。<br/>
	 *
	 * @param localDate
	 * @param amountToAdd
	 */
	private void plus(LocalDate localDate, TemporalAmount amountToAdd) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plus(" + amountToAdd + ") ：= " + localDate.plus(amountToAdd));
	}

	/**
	 * {@link LocalDate}的成员方法plus测试。<br/>
	 *
	 * @param localDate
	 * @param amountToAdd
	 * @param unit
	 */
	private void plus(LocalDate localDate, long amountToAdd, TemporalUnit unit) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plus(" + amountToAdd + ") ：= " + localDate.plus(amountToAdd, unit));
	}

	/**
	 * {@link LocalDate}的成员方法plusYears测试。<br/>
	 *
	 * @param localDate
	 * @param yearsToAdd
	 */
	private void plusYears(LocalDate localDate, long yearsToAdd) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plusYears(" + yearsToAdd + ") ：= " + localDate.plusYears(yearsToAdd));
	}

	/**
	 * {@link LocalDate}的成员方法plusMonths测试。<br/>
	 *
	 * @param localDate
	 * @param monthsToAdd
	 */
	private void plusMonths(LocalDate localDate, int monthsToAdd) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plusMonths(" + monthsToAdd + ") ：= " + localDate.plusMonths(monthsToAdd));

	}

	/**
	 * {@link LocalDate}的成员方法plusWeeks测试。<br/>
	 *
	 * @param localDate
	 * @param weeksToAdd
	 */
	private void plusWeeks(LocalDate localDate, int weeksToAdd) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plusWeeks(" + weeksToAdd + ") ：= " + localDate.plusWeeks(weeksToAdd));
	}

	/**
	 * {@link LocalDate}的成员方法plusDays测试。<br/>
	 *
	 * @param localDate
	 * @param daysToAdd
	 */
	private void plusDays(LocalDate localDate, long daysToAdd) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的plusDays(" + daysToAdd + ") ：= " + localDate.plusDays(daysToAdd));
	}

	/**
	 * {@link LocalDate}的成员方法minus测试。<br/>
	 *
	 * @param localDate
	 * @param amountToSubtract
	 */
	private void minus(LocalDate localDate, TemporalAmount amountToSubtract) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的minus(" + amountToSubtract + ") ：= " + localDate.minus(amountToSubtract));
	}

	/**
	 * {@link LocalDate}的成员方法format测试。<br/>
	 *
	 * @param localDate
	 * @param formatter
	 */
	private void format(LocalDate localDate, DateTimeFormatter formatter) {
		Objects.requireNonNull(localDate, localDate.getClass().getTypeName() + "型参数不能为空！");
		System.out.println("LocalDate的format(" + formatter + ") ：= " + localDate.format(formatter));
	}

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		LocalDate localDate = LocalDate.now();
		isSupported(localDate, ChronoUnit.DAYS);
		isSupported(localDate, ChronoUnit.NANOS);
		isSupported(localDate, ChronoField.SECOND_OF_DAY);
		isSupported(localDate, ChronoField.DAY_OF_MONTH);
		range(localDate, ChronoField.YEAR_OF_ERA);
		range(localDate, ChronoField.MONTH_OF_YEAR);
		range(localDate, ChronoField.DAY_OF_MONTH);
		range(localDate, ChronoField.DAY_OF_WEEK);
		get(localDate, ChronoField.DAY_OF_WEEK);
		get(localDate, ChronoField.DAY_OF_MONTH);
		getChronology(localDate);
		getChronology(LocalDate.of(2021, Month.OCTOBER, 23));
		getEra(localDate);
		getYear(localDate);
		getMonthValue(localDate);
		getMonth(localDate);
		getDayOfMonth(localDate);
		getDayOfYear(localDate);
		getDayOfWeek(localDate);
		isLeapYear(localDate);
		lengthOfMonth(localDate);
		lengthOfYear(localDate);
		with(localDate, LocalDate.of(2020, 12, 23));
		with(localDate, ChronoField.DAY_OF_MONTH, 21);
		withYear(localDate, 2024);
		withYear(LocalDate.of(2020, 2, 29), 2021);
		withMonth(localDate, 2);
		withMonth(LocalDate.of(2021, 10, 31), 2);
		withDayOfMonth(LocalDate.of(2021, 2, 28), 2);
		withDayOfYear(LocalDate.of(2021, 2, 28), 364);
		plus(LocalDate.now(), Period.ofDays(23));
		plus(LocalDate.now(), 12, ChronoUnit.DAYS);
		plusYears(LocalDate.now(), 23);
		plusMonths(LocalDate.now(), 23);
		plusWeeks(LocalDate.now(), 1);
		plusDays(LocalDate.now(), 23);
		minus(LocalDate.now(), Period.ofDays(23));// 减法
		format(LocalDate.now(), DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
	}

	public static void main(String[] args) throws Exception {
		LocalDateDemo localDateDemo = new LocalDateDemo();
		localDateDemo.setConstructorsFlag(localDateDemo.constructorsFlag(LocalDate.class));
		TestTemplateUtil.execTemplate(localDateDemo);
	}
}
