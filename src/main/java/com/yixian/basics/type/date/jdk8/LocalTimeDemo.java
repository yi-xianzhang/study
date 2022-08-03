package com.yixian.basics.type.date.jdk8;


import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Objects;

public class LocalTimeDemo extends AbstractTestTemplate {

	@Override
	protected void staticMethodsOfThis() throws Exception {
		now();
		now(Clock.system(ZoneId.of("-10:00")));
		now(ZoneId.of("-07:00"));
		of(12, 12, 12, 143);
		of(12, 12, 12);
		of(12, 12);
		from(LocalTime.of(23, 12));
		from(LocalDateTime.now());
		from(Instant.now().atOffset(ZoneOffset.ofHours(+8)));
		from(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));
		parse("15:24:04.124");
		parse("15:24:04.124", DateTimeFormatter.ISO_LOCAL_TIME);
		parse("15-24-04.124", DateTimeFormatter.ofPattern("HH-mm-ss.SSS"));
	}

	/**
	 * {@link LocalTime}的now方法测试。<br/>
	 */
	private void now() {
		System.out.println("LocalTime的now(): = " + LocalTime.now());
	}

	/**
	 * {@link LocalTime}的now方法测试。<br/>
	 *
	 * @param zone
	 */
	private void now(ZoneId zone) {
		System.out.println("LocalTime的now(" + zone + "): = " + LocalTime.now(zone));
	}

	/**
	 * {@link LocalTime}的now方法测试。<br/>
	 *
	 * @param clock
	 */
	private void now(Clock clock) {
		System.out.println("LocalTime的now(" + clock + "): = " + LocalTime.now(clock));
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param hour
	 * @param minute
	 * @param second
	 * @param nanoOfSecond
	 */
	private void of(int hour, int minute, int second, int nanoOfSecond) {
		LocalTime of = LocalTime.of(hour, minute, second, nanoOfSecond);
		System.out.println("LocalTime的of(" + hour + "," + minute + "," + second + "," + nanoOfSecond + "): = " + of);
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param hour
	 * @param minute
	 * @param second
	 */
	private void of(int hour, int minute, int second) {
		LocalTime of = LocalTime.of(hour, minute, second);
		System.out.println("LocalTime的of(" + hour + "," + minute + "," + second + "): = " + of);
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param hour
	 * @param minute
	 */
	private void of(int hour, int minute) {
		LocalTime of = LocalTime.of(hour, minute);
		System.out.println("LocalTime的of(" + hour + "," + minute + "): = " + of);
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param temporal
	 */
	private void from(TemporalAccessor temporal) {
		LocalTime form = LocalTime.from(temporal);
		System.out.println("LocalTime的of(" + temporal + "): = " + form);
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param text
	 */
	private void parse(CharSequence text) {
		Objects.requireNonNull(text, text.getClass().getName() + "类型不匹配！");
		LocalTime parse = LocalTime.parse(text);
		System.out.println("LocalTime的of(" + text + "): = " + parse);
	}

	/**
	 * {@link LocalTime}的of方法测试。<br/>
	 *
	 * @param text
	 */
	private void parse(CharSequence text, DateTimeFormatter formatter) {
		Objects.requireNonNull(text, text.getClass().getName() + "类型不匹配！");
		Objects.requireNonNull(formatter, formatter.getClass().getName() + "类型不匹配！");
		LocalTime parse = LocalTime.parse(text, formatter);
		System.out.println("LocalTime的of(" + text + "," + formatter + "): = " + parse);
	}

	@Override
	protected void instanceMethodsOfThis() throws Exception {

		LocalTime localTime = LocalTime.now();
		// -------------------------------------------------isSupported方法-------------------------------------------------
		isSupported(localTime, ChronoField.YEAR_OF_ERA);
		isSupported(localTime, ChronoField.YEAR);
		isSupported(localTime, ChronoField.MONTH_OF_YEAR);
		isSupported(localTime, ChronoField.DAY_OF_YEAR);
		isSupported(localTime, ChronoField.DAY_OF_WEEK);
		isSupported(localTime, ChronoField.DAY_OF_MONTH);
		isSupported(localTime, ChronoField.HOUR_OF_DAY);
		isSupported(localTime, ChronoField.MINUTE_OF_HOUR);
		isSupported(localTime, ChronoField.SECOND_OF_MINUTE);
		isSupported(localTime, ChronoField.NANO_OF_SECOND);
		isSupported(localTime, ChronoUnit.YEARS);
		isSupported(localTime, ChronoUnit.MONTHS);
		isSupported(localTime, ChronoUnit.WEEKS);
		isSupported(localTime, ChronoUnit.DAYS);
		isSupported(localTime, ChronoUnit.HOURS);
		isSupported(localTime, ChronoUnit.MINUTES);
		isSupported(localTime, ChronoUnit.SECONDS);
		isSupported(localTime, ChronoUnit.NANOS);
		isSupported(localTime, ChronoUnit.MILLIS);

		// ----------------------------------------------------range方法----------------------------------------------------
		range(localTime, ChronoField.YEAR_OF_ERA);
		range(localTime, ChronoField.YEAR);
		range(localTime, ChronoField.MONTH_OF_YEAR);
		range(localTime, ChronoField.DAY_OF_YEAR);
		range(localTime, ChronoField.DAY_OF_WEEK);
		range(localTime, ChronoField.DAY_OF_MONTH);
		range(localTime, ChronoField.HOUR_OF_DAY);
		range(localTime, ChronoField.MINUTE_OF_HOUR);
		range(localTime, ChronoField.SECOND_OF_MINUTE);
		range(localTime, ChronoField.NANO_OF_SECOND);

		// -----------------------------------------------------get方法-----------------------------------------------------
		get(localTime, ChronoField.YEAR_OF_ERA);
		get(localTime, ChronoField.YEAR);
		get(localTime, ChronoField.MONTH_OF_YEAR);
		get(localTime, ChronoField.DAY_OF_YEAR);
		get(localTime, ChronoField.DAY_OF_WEEK);
		get(localTime, ChronoField.DAY_OF_MONTH);
		get(localTime, ChronoField.HOUR_OF_DAY);
		get(localTime, ChronoField.MINUTE_OF_HOUR);
		get(localTime, ChronoField.SECOND_OF_MINUTE);
		get(localTime, ChronoField.NANO_OF_SECOND);

		// ---------------------------------------------------getLong方法---------------------------------------------------
		getLong(localTime, ChronoField.YEAR_OF_ERA);
		getLong(localTime, ChronoField.YEAR);
		getLong(localTime, ChronoField.MONTH_OF_YEAR);
		getLong(localTime, ChronoField.DAY_OF_YEAR);
		getLong(localTime, ChronoField.DAY_OF_WEEK);
		getLong(localTime, ChronoField.DAY_OF_MONTH);
		getLong(localTime, ChronoField.HOUR_OF_DAY);
		getLong(localTime, ChronoField.MINUTE_OF_HOUR);
		getLong(localTime, ChronoField.SECOND_OF_MINUTE);
		getLong(localTime, ChronoField.NANO_OF_SECOND);

		// -------------------------------------getHour/getMinute/getSecond/getNano方法-------------------------------------
		getOtherMethods(localTime, ChronoField.HOUR_OF_DAY);
		getOtherMethods(localTime, ChronoField.MINUTE_OF_HOUR);
		getOtherMethods(localTime, ChronoField.SECOND_OF_MINUTE);
		getOtherMethods(localTime, ChronoField.NANO_OF_SECOND);

		// -----------------------------------------------------with方法----------------------------------------------------
		with(localTime, LocalTime.of(23, 28));
		with(localTime, ChronoField.HOUR_OF_DAY, 12);
		with(localTime, ChronoField.MINUTE_OF_HOUR, 13);
		with(localTime, ChronoField.SECOND_OF_MINUTE, 14);
		with(localTime, ChronoField.NANO_OF_SECOND, 15);

		// -----------------------------------withHour/withMinute/withSecond/withNano方法-----------------------------------
		withOtherMethods(localTime, ChronoField.HOUR_OF_DAY, 12);
		withOtherMethods(localTime, ChronoField.MINUTE_OF_HOUR, 23);
		withOtherMethods(localTime, ChronoField.SECOND_OF_MINUTE, 59);
		withOtherMethods(localTime, ChronoField.NANO_OF_SECOND, 59);

		// -------------------------------------------------truncatedTo方法-------------------------------------------------
		truncatedTo(localTime, ChronoUnit.HOURS);
		truncatedTo(localTime, ChronoUnit.MINUTES);
		truncatedTo(localTime, ChronoUnit.SECONDS);
		truncatedTo(localTime, ChronoUnit.NANOS);

		// ----------------------------------------------------plus方法-----------------------------------------------------
		plus(localTime, Duration.ofHours(8));
		plus(localTime, Duration.ofMinutes(8));
		plus(localTime, Duration.ofSeconds(8));
		plus(localTime, Duration.ofNanos(8));
		plus(localTime, Duration.ofMillis(8));

		plus(localTime, 8, ChronoUnit.NANOS);
		plus(localTime, 8, ChronoUnit.MILLIS);
		plus(localTime, 8, ChronoUnit.MINUTES);
		plus(localTime, 8, ChronoUnit.HOURS);

		// ---------------------------------plusHours/plusMinutes/plusSeconds/plusNanos方法---------------------------------
		plusOtherMethods(localTime, ChronoUnit.HOURS, 1);
		plusOtherMethods(localTime, ChronoUnit.MINUTES, 1);
		plusOtherMethods(localTime, ChronoUnit.SECONDS, 1);
		plusOtherMethods(localTime, ChronoUnit.NANOS, 1);

		// -------------------------------------------------------minus方法-------------------------------------------------
		minus(localTime, Duration.ofHours(6));
		minus(localTime, Duration.ofMinutes(6));
		minus(localTime, Duration.ofSeconds(6));
		minus(localTime, Duration.ofMillis(6));
		minus(localTime, Duration.ofNanos(6));
		minus(localTime, Duration.ofDays(6));

		minus(localTime, 1, ChronoUnit.HOURS);
		minus(localTime, 1, ChronoUnit.MINUTES);
		minus(localTime, 1, ChronoUnit.SECONDS);
		minus(localTime, 1, ChronoUnit.MILLIS);
		minus(localTime, 1, ChronoUnit.NANOS);

		// -------------------------------minusHours/minusMinutes/minusSeconds/minusNanos方法-------------------------------
		minusOtherMethods(localTime, ChronoUnit.HOURS, 1);
		minusOtherMethods(localTime, ChronoUnit.MINUTES, 1);
		minusOtherMethods(localTime, ChronoUnit.SECONDS, 1);
		minusOtherMethods(localTime, ChronoUnit.NANOS, 1);

		// ----------------------------------------------------query方法----------------------------------------------------
		query(localTime, TemporalQueries.zoneId());
		query(localTime, TemporalQueries.zoneId());
		query(localTime, TemporalQueries.chronology());
		query(localTime, TemporalQueries.offset());
		query(localTime, TemporalQueries.localDate());
		query(localTime, TemporalQueries.localTime());
		query(localTime, TemporalQueries.precision());

		// -------------------------------------------------adjustInto方法--------------------------------------------------
		adjustInto(localTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		adjustInto(LocalTime.of(01, 12, 23, 23),
			Instant.now().atOffset(ZoneOffset.ofHours(+0)));

		// ----------------------------------------------------until方法----------------------------------------------------
		until(localTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23),
			ChronoUnit.HOURS);

		until(LocalTime.of(01, 12, 23, 23),
			Instant.now().atOffset(ZoneOffset.ofHours(+8)),
			ChronoUnit.HOURS);

		// ----------------------------------------------------format方法---------------------------------------------------
		format(localTime, DateTimeFormatter.ISO_LOCAL_TIME);
		format(localTime, DateTimeFormatter.ofPattern("HH/mm/ss .SSS"));
		format(localTime, DateTimeFormatter.ofPattern("HH-mm-ss .SSS"));
		format(localTime, DateTimeFormatter.ofPattern("HH时mm分ss秒SSS"));

		// ----------------------------------------------------atDate方法---------------------------------------------------
		atDate(localTime, LocalDate.now());

		// ---------------------------------------------------atOffset方法--------------------------------------------------
		atOffset(localTime, ZoneOffset.ofHours(-8));
		// ---------------------------------------------------toSecondOfDay方法---------------------------------------------
		toSecondOfDay(localTime);
		// ---------------------------------------------------toNanoOfDay方法---------------------------------------------
		toNanoOfDay(localTime);

	}

	/**
	 * {@link LocalTime}的isSupported方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 */
	private void isSupported(LocalTime localTime, TemporalField field) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		boolean isSupportedFlag = localTime.isSupported(field);
		System.out.println("LocalTime类的localTime(" + localTime + ").isSupported(" + field + ") : " + isSupportedFlag);
	}

	/**
	 * {@link LocalTime}的isSupported方法测试。<br/>
	 *
	 * @param localTime
	 * @param unit
	 */
	private void isSupported(LocalTime localTime, TemporalUnit unit) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		boolean isSupportedFlag = localTime.isSupported(unit);
		System.out.println("LocalTime类的localTime(" + localTime + ").isSupported(" + unit + ") : " + isSupportedFlag);
	}

	/**
	 * {@link LocalTime}的range方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 */
	private void range(LocalTime localTime, TemporalField field) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		if (localTime.isSupported(field)) {
			ValueRange valueRange = localTime.range(field);
			System.out.println("LocalTime类的localTime(" + localTime + ").range(" + field + ") : " + valueRange);
		} else {
			System.out.println("LocalTime类的localTime(" + localTime + ").range(" + field + ") : " + field + "不支持！");
		}
	}

	/**
	 * {@link LocalTime}的get方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 */
	private void get(LocalTime localTime, TemporalField field) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		if (localTime.isSupported(field)) {
			int value = localTime.get(field);
			System.out.println("LocalTime类的localTime(" + localTime + ").get(" + field + ") : " + value);
		} else {
			System.out.println("LocalTime类的localTime(" + localTime + ").get(" + field + ") : " + field + "不支持！");
		}
	}

	/**
	 * {@link LocalTime}的getLong方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 */
	private void getLong(LocalTime localTime, TemporalField field) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		if (localTime.isSupported(field)) {
			long value = localTime.getLong(field);
			System.out.println("LocalTime类的localTime(" + localTime + ").getLong(" + field + ") : " + value);
		} else {
			System.out.println("LocalTime类的localTime(" + localTime + ").getLong(" + field + ") : " + field + "不支持！");
		}
	}

	/**
	 * {@link LocalTime}的getHour
	 * getMinute
	 * getSecond
	 * getNano方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 */
	private void getOtherMethods(LocalTime localTime, TemporalField field) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(field, field.getClass().getName() + "型参数不能为空！");
		// getHour方法
		if (ChronoField.HOUR_OF_DAY == field || ChronoField.HOUR_OF_DAY.equals(field)) {
			int value = localTime.getHour();
			System.out.println("LocalTime类的localTime(" + localTime + ").getHour() :" + value);
			// getMinute方法
		} else if (ChronoField.MINUTE_OF_HOUR == field || ChronoField.MINUTE_OF_HOUR.equals(field)) {
			int value = localTime.getMinute();
			System.out.println("LocalTime类的localTime(" + localTime + ").getMinute() :" + value);
			// getSecond方法
		} else if (ChronoField.SECOND_OF_MINUTE == field || ChronoField.SECOND_OF_MINUTE.equals(field)) {
			int value = localTime.getSecond();
			System.out.println("LocalTime类的localTime(" + localTime + ").getSecond() :" + value);
			// getNano方法
		} else if (ChronoField.NANO_OF_SECOND == field || ChronoField.NANO_OF_SECOND.equals(field)) {
			int value = localTime.getNano();
			System.out.println("LocalTime类的localTime(" + localTime + ").getNano() :" + value);
		} else {
			throw new TypeNotPresentException(field.getClass().getTypeName() + "类型不支持", null);
		}
	}

	/**
	 * {@link LocalTime}的with方法测试。<br/>
	 *
	 * @param localTime
	 * @param adjuster
	 */
	private void with(LocalTime localTime, TemporalAdjuster adjuster) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		LocalTime value = localTime.with(adjuster);
		System.out.println("LocalTime类的localTime(" + localTime + ").with(" + adjuster + ") : " + value);
	}

	/**
	 * {@link LocalTime}的with方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 * @param newValue
	 */
	private void with(LocalTime localTime, TemporalField field, long newValue) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "类型不匹配");
		LocalTime value = localTime.with(field, newValue);
		System.out.println("LocalTime类的localTime(" + localTime + ").with(" + field + "," + newValue + ") : " + value);
	}

	/**
	 * {@link LocalTime}的withHour
	 * withMinute
	 * withSecond
	 * withNano方法测试。<br/>
	 *
	 * @param localTime
	 * @param field
	 * @param newValue
	 */
	public void withOtherMethods(LocalTime localTime, TemporalField field, int newValue) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(field, field.getClass().getName() + "型参数不能为空！");
		// withHour
		if (ChronoField.HOUR_OF_DAY == field || ChronoField.HOUR_OF_DAY.equals(field)) {
			LocalTime value = localTime.withHour(newValue);
			System.out.println("LocalTime类的localTime(" + localTime + ").withHour(" + newValue + ") :" + value);
			// withMinute
		} else if (ChronoField.MINUTE_OF_HOUR == field || ChronoField.MINUTE_OF_HOUR.equals(field)) {
			LocalTime value = localTime.withMinute(newValue);
			System.out.println("LocalTime类的localTime(" + localTime + ").withMinute(" + newValue + ") :" + value);
			// withMinute
		} else if (ChronoField.SECOND_OF_MINUTE == field || ChronoField.SECOND_OF_MINUTE.equals(field)) {
			LocalTime value = localTime.withSecond(newValue);
			System.out.println("LocalTime类的localTime(" + localTime + ").withSecond(" + newValue + ") :" + value);
			// withNano方法
		} else if (ChronoField.NANO_OF_SECOND == field || ChronoField.NANO_OF_SECOND.equals(field)) {
			LocalTime value = localTime.withNano(newValue);
			System.out.println("LocalTime类的localTime(" + localTime + ").withNano(" + newValue + ") :" + value);
		} else {
			throw new TypeNotPresentException(field.getClass().getTypeName() + "类型不支持", null);
		}
	}

	/**
	 * {@link LocalTime}的truncatedTo方法测试。<br/>
	 *
	 * @param localTime
	 * @param unit
	 */
	private void truncatedTo(LocalTime localTime, ChronoUnit unit) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		LocalTime truncatedTo = localTime.truncatedTo(unit);
		System.out.println("LocalTime类的localTime(" + localTime + ").truncatedTo(" + unit + ") :" + truncatedTo);
	}

	/**
	 * {@link LocalTime}的plus方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToAdd
	 */
	private void plus(LocalTime localTime, TemporalAmount amountToAdd) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		LocalTime truncatedTo = localTime.plus(amountToAdd);
		System.out.println("LocalTime类的localTime(" + localTime + ").plus(" + amountToAdd + ") :" + truncatedTo);
	}

	/**
	 * {@link LocalTime}的plus方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToAdd
	 */
	private void plus(LocalTime localTime, long amountToAdd, TemporalUnit unit) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		LocalTime truncatedTo = localTime.plus(amountToAdd, unit);
		System.out.println("LocalTime类的localTime(" + localTime + ").plus(" + amountToAdd + "," + unit + ") :" + truncatedTo);
	}

	/**
	 * {@link LocalTime}的plus方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToAdd
	 * @param unit
	 */
	private void plusOtherMethods(LocalTime localTime, ChronoUnit unit, long amountToAdd) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		// plusHours/plusMinutes/plusSeconds/plusNanos
		LocalTime value = null;
		String str = "";
		if (ChronoUnit.HOURS == unit || ChronoUnit.HOURS.equals(unit)) {
			value = localTime.plusHours(amountToAdd);
			str = "plusHours";
		} else if (ChronoUnit.MINUTES == unit || ChronoUnit.MINUTES.equals(unit)) {
			value = localTime.plusMinutes(amountToAdd);
			str = "plusMinutes";
		} else if (ChronoUnit.SECONDS == unit || ChronoUnit.SECONDS.equals(unit)) {
			value = localTime.plusSeconds(amountToAdd);
			str = "plusSeconds";
		} else if (ChronoUnit.NANOS == unit || ChronoUnit.NANOS.equals(unit)) {
			value = localTime.plusNanos(amountToAdd);
			str = "plusNanos";
		}
		if (value == null) {
			throw new TypeNotPresentException(unit.getClass().getName() + "类型不匹配！", null);
		} else {
			System.out.println("LocalTime类的localTime(" + localTime + ")." + str + "(" + amountToAdd + ") :" + value);
		}
	}

	/**
	 * {@link LocalTime}的minus方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToSubtract
	 */
	private void minus(LocalTime localTime, TemporalAmount amountToSubtract) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		LocalTime truncatedTo = localTime.minus(amountToSubtract);
		System.out.println("LocalTime类的localTime(" + localTime + ").minus(" + amountToSubtract + ") :" + truncatedTo);
	}

	/**
	 * {@link LocalTime}的minus方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToSubtract
	 * @param unit
	 */
	private void minus(LocalTime localTime, long amountToSubtract, TemporalUnit unit) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		LocalTime value = localTime.minus(amountToSubtract, unit);
		System.out.println("LocalTime类的localTime(" + localTime + ").minus(" + amountToSubtract + "," + unit + ") :" + value);
	}

	/**
	 * {@link LocalTime}的minusHours
	 * minusMinutes
	 * minusSeconds
	 * minusNanos方法测试。<br/>
	 *
	 * @param localTime
	 * @param amountToAdd
	 * @param unit
	 */
	private void minusOtherMethods(LocalTime localTime, ChronoUnit unit, long amountToAdd) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		// minusHours/minusMinutes/minusSeconds/minusNanos
		LocalTime value = null;
		String str = "";
		if (ChronoUnit.HOURS == unit || ChronoUnit.HOURS.equals(unit)) {
			value = localTime.minusHours(amountToAdd);
			str = "minusHours";
		} else if (ChronoUnit.MINUTES == unit || ChronoUnit.MINUTES.equals(unit)) {
			value = localTime.minusMinutes(amountToAdd);
			str = "minusMinutes";
		} else if (ChronoUnit.SECONDS == unit || ChronoUnit.SECONDS.equals(unit)) {
			value = localTime.minusSeconds(amountToAdd);
			str = "minusSeconds";
		} else if (ChronoUnit.NANOS == unit || ChronoUnit.NANOS.equals(unit)) {
			value = localTime.minusNanos(amountToAdd);
			str = "minusNanos";
		}
		if (value == null) {
			throw new TypeNotPresentException(unit.getClass().getName() + "类型不匹配！", null);
		} else {
			System.out.println("LocalTime类的localTime(" + localTime + ")." + str + "(" + amountToAdd + ") :" + value);
		}
	}

	/**
	 * {@link LocalTime}的query方法测试。<br/>
	 *
	 * @param localTime
	 * @param query
	 */
	private void query(LocalTime localTime, TemporalQuery query) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Object query1 = localTime.query(query);
		System.out.println("LocalTime类的localTime(" + localTime + ").query(" + query + ") :" + query1);
	}

	/**
	 * {@link LocalTime}的adjustInto方法测试。<br/>
	 *
	 * @param localTime
	 * @param temporal
	 */
	private void adjustInto(LocalTime localTime, Temporal temporal) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Temporal value = localTime.adjustInto(temporal);
		System.out.println("LocalTime类的localTime(" + localTime + ").adjustInto(" + temporal + ") :" + value);
	}

	/**
	 * {@link LocalTime}的until方法测试。<br/>
	 *
	 * @param localTime
	 * @param endExclusive
	 * @param unit
	 */
	private void until(LocalTime localTime, Temporal endExclusive, TemporalUnit unit) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		long value = localTime.until(endExclusive, unit);
		System.out.println("LocalTime类的localTime(" + localTime + ").until(" + endExclusive + "," + unit + ") :" + value);
	}

	/**
	 * {@link LocalTime}的until方法测试。<br/>
	 *
	 * @param localTime
	 * @param localDate
	 */
	private void atDate(LocalTime localTime, LocalDate localDate) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(localDate, localDate.getClass().getName() + "型参数不能为空！");
		LocalDateTime value = localTime.atDate(localDate);
		System.out.println("LocalTime类的localTime(" + localTime + ").atDate(" + localDate + ") :" + value);
	}



	/**
	 * {@link LocalTime}的atOffset方法测试。<br/>
	 *
	 * @param localTime
	 * @param zoneOffset
	 */
	private void atOffset(LocalTime localTime, ZoneOffset zoneOffset) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(zoneOffset, zoneOffset.getClass().getName() + "型参数不能为空！");
		OffsetTime offsetTime = localTime.atOffset(zoneOffset);
		System.out.println("LocalTime类的localTime(" + localTime + ").atOffset(" + zoneOffset + ") :" + offsetTime);
	}

	/**
	 * {@link LocalTime}的until方法测试。<br/>
	 *
	 * @param localTime
	 * @param formatter
	 */
	private void format(LocalTime localTime, DateTimeFormatter formatter) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(formatter, formatter.getClass().getName() + "型参数不能为空！");
		String value = localTime.format(formatter);
		System.out.println("LocalTime类的localTime(" + localTime + ").format(" + formatter + ") :" + value);
	}

	/**
	 * {@link LocalTime}的toSecondOfDay方法测试。<br/>
	 *
	 * @param localTime
	 */
	private void toSecondOfDay(LocalTime localTime) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		int value = localTime.toSecondOfDay();
		System.out.println("LocalTime类的localTime(" + localTime + ").toSecondOfDay() :" + value);
	}

	/**
	 * {@link LocalTime}的toSecondOfDay方法测试。<br/>
	 *
	 * @param localTime
	 */
	private void toNanoOfDay(LocalTime localTime) {
		Objects.requireNonNull(localTime, localTime.getClass().getName() + "型参数不能为空！");
		long value = localTime.toNanoOfDay();
		System.out.println("LocalTime类的localTime(" + localTime + ").toNanoOfDay() :" + value);
	}



	@Override
	protected void constructorsOfThis() {
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new LocalTimeDemo());
	}
}
