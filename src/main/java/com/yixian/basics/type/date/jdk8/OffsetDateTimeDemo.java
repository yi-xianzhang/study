package com.yixian.basics.type.date.jdk8;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Objects;

public class OffsetDateTimeDemo extends AbstractTestTemplate {
	private static Temporal adjustInto(Temporal temporal1) {
		return null;
	}

	// ---------------------------------------------OffsetDateTime的静态方法----------------------------------------------

	@Override
	protected void staticMethodsOfThis() throws Exception {
		// -------------------------------------------------now的静态方法---------------------------------------------------
		now();
		now(Clock.system(ZoneId.of("America/Chicago")));
		now(Clock.system(ZoneId.of("Asia/Shanghai")));
		now(ZoneId.of("America/Chicago"));
		now(ZoneId.of("Asia/Shanghai"));

		// -------------------------------------------------of的静态方法----------------------------------------------------
		of(LocalDate.now(), LocalTime.now(), ZoneOffset.ofHours(+8));
		of(LocalDate.now(), LocalTime.now(), ZoneOffset.ofHours(+7));

		of(LocalDateTime.now(), ZoneOffset.ofHours(+7));
		of(LocalDateTime.now(), ZoneOffset.ofHours(+8));

		of(2021, 12, 23, 13, 15, 45, 234, ZoneOffset.ofHours(+7));
		of(2022, 02, 24, 22, 27, 59, 456, ZoneOffset.ofHours(+7));

		// -------------------------------------------------of的静态方法----------------------------------------------------
		ofInstant(Instant.now(), ZoneId.of("America/Chicago"));
		ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai"));

		// -------------------------------------------------from的静态方法--------------------------------------------------
		from(OffsetDateTime.now());
		from(ZonedDateTime.now());

		// -------------------------------------------------parse的静态方法-------------------------------------------------
		parse("2021-10-25T23:02:05.006+08:00");
		parse("2021-10-25T23:02:05.006+07:00");
		parse("2021-10-25T23:02:05.006+07:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

	}

	/**
	 * {@link OffsetDateTime}类的静态方法now测试。</br>
	 */
	private void now() {
		System.out.println("OffsetDateTime的静态方法now()：" + OffsetDateTime.now());
	}

	/**
	 * {@link OffsetDateTime}类的静态方法now测试。</br>
	 *
	 * @param clock
	 */
	private void now(Clock clock) {
		System.out.println("OffsetDateTime的静态方法now(" + clock + ")：" + OffsetDateTime.now(clock));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法now测试。</br>
	 *
	 * @param zone
	 */
	private void now(ZoneId zone) {
		System.out.println("OffsetDateTime的静态方法now(" + zone + ")：" + OffsetDateTime.now(zone));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法of测试。</br>
	 *
	 * @param date
	 * @param time
	 * @param offset
	 */
	private void of(LocalDate date, LocalTime time, ZoneOffset offset) {
		System.out.println("OffsetDateTime的静态方法of(" + date + "," + time + "," + offset + ")："
			+ OffsetDateTime.of(date, time, offset));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法of测试。</br>
	 *
	 * @param localDateTime
	 * @param offset
	 */
	private void of(LocalDateTime localDateTime, ZoneOffset offset) {
		System.out.println("OffsetDateTime的静态方法of(" + localDateTime + "," + offset + ")："
			+ OffsetDateTime.of(localDateTime, offset));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法of测试。</br>
	 *
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * @param hour
	 * @param minute
	 * @param second
	 * @param nanoOfSecond
	 * @param offset
	 */
	private void of(int year, int month, int dayOfMonth,
	                int hour, int minute, int second, int nanoOfSecond, ZoneOffset offset) {
		System.out.println("OffsetDateTime的静态方法of(" + year + "," + month + "," + dayOfMonth + "," + hour
			+ "," + minute + "," + second + "," + nanoOfSecond + "," + offset + ")："
			+ OffsetDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, offset));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法ofInstant测试。</br>
	 *
	 * @param instant
	 * @param zone
	 */
	private void ofInstant(Instant instant, ZoneId zone) {
		System.out.println("OffsetDateTime的静态方法of(" + instant + "," + zone + ")："
			+ OffsetDateTime.ofInstant(instant, zone));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法from测试。</br>
	 *
	 * @param temporal
	 */
	private void from(TemporalAccessor temporal) {
		System.out.println("OffsetDateTime的静态方法from(" + temporal + ")："
			+ OffsetDateTime.from(temporal));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法parse测试。</br>
	 *
	 * @param text
	 */
	private void parse(CharSequence text) {
		System.out.println("OffsetDateTime的静态方法parse(" + text + ")："
			+ OffsetDateTime.parse(text));
	}

	/**
	 * {@link OffsetDateTime}类的静态方法parse测试。</br>
	 *
	 * @param text
	 * @param formatter
	 */
	private void parse(CharSequence text, DateTimeFormatter formatter) {
		System.out.println("OffsetDateTime的静态方法parse(" + text + "," + formatter + ")："
			+ OffsetDateTime.parse(text, formatter));
	}

	// ---------------------------------------------OffsetDateTime的成员方法----------------------------------------------

	@Override
	protected void instanceMethodsOfThis() throws Exception {

		// --------------------------------------------isSupported的成员方法------------------------------------------------
		isSupported(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND);
		isSupported(OffsetDateTime.now(), ChronoField.NANO_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.MICRO_OF_SECOND);
		isSupported(OffsetDateTime.now(), ChronoField.MICRO_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.MILLI_OF_SECOND);
		isSupported(OffsetDateTime.now(), ChronoField.MILLI_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE);
		isSupported(OffsetDateTime.now(), ChronoField.SECOND_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR);
		isSupported(OffsetDateTime.now(), ChronoField.MINUTE_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.HOUR_OF_AMPM);
		isSupported(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_AMPM);
		isSupported(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.AMPM_OF_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.DAY_OF_WEEK);
		isSupported(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		isSupported(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		isSupported(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH);
		isSupported(OffsetDateTime.now(), ChronoField.DAY_OF_YEAR);
		isSupported(OffsetDateTime.now(), ChronoField.EPOCH_DAY);
		isSupported(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_MONTH);
		isSupported(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_YEAR);
		isSupported(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR);
		isSupported(OffsetDateTime.now(), ChronoField.PROLEPTIC_MONTH);
		isSupported(OffsetDateTime.now(), ChronoField.YEAR_OF_ERA);
		isSupported(OffsetDateTime.now(), ChronoField.YEAR);
		isSupported(OffsetDateTime.now(), ChronoField.ERA);
		isSupported(OffsetDateTime.now(), ChronoField.INSTANT_SECONDS);
		isSupported(OffsetDateTime.now(), ChronoField.OFFSET_SECONDS);

		isSupported(OffsetDateTime.now(), ChronoUnit.NANOS);
		isSupported(OffsetDateTime.now(), ChronoUnit.MICROS);
		isSupported(OffsetDateTime.now(), ChronoUnit.MILLIS);
		isSupported(OffsetDateTime.now(), ChronoUnit.SECONDS);
		isSupported(OffsetDateTime.now(), ChronoUnit.MINUTES);
		isSupported(OffsetDateTime.now(), ChronoUnit.HOURS);
		isSupported(OffsetDateTime.now(), ChronoUnit.HALF_DAYS);
		isSupported(OffsetDateTime.now(), ChronoUnit.DAYS);
		isSupported(OffsetDateTime.now(), ChronoUnit.WEEKS);
		isSupported(OffsetDateTime.now(), ChronoUnit.MONTHS);
		isSupported(OffsetDateTime.now(), ChronoUnit.YEARS);
		isSupported(OffsetDateTime.now(), ChronoUnit.DECADES);
		isSupported(OffsetDateTime.now(), ChronoUnit.CENTURIES);
		isSupported(OffsetDateTime.now(), ChronoUnit.MILLENNIA);
		isSupported(OffsetDateTime.now(), ChronoUnit.ERAS);
		isSupported(OffsetDateTime.now(), ChronoUnit.FOREVER);

		// -----------------------------------------------range的成员方法---------------------------------------------------
		range(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND);
		range(OffsetDateTime.now(), ChronoField.NANO_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.MICRO_OF_SECOND);
		range(OffsetDateTime.now(), ChronoField.MICRO_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.MILLI_OF_SECOND);
		range(OffsetDateTime.now(), ChronoField.MILLI_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE);
		range(OffsetDateTime.now(), ChronoField.SECOND_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR);
		range(OffsetDateTime.now(), ChronoField.MINUTE_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.HOUR_OF_AMPM);
		range(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_AMPM);
		range(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.AMPM_OF_DAY);
		range(OffsetDateTime.now(), ChronoField.DAY_OF_WEEK);
		range(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		range(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		range(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH);
		range(OffsetDateTime.now(), ChronoField.DAY_OF_YEAR);
		range(OffsetDateTime.now(), ChronoField.EPOCH_DAY);
		range(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_MONTH);
		range(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_YEAR);
		range(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR);
		range(OffsetDateTime.now(), ChronoField.PROLEPTIC_MONTH);
		range(OffsetDateTime.now(), ChronoField.YEAR_OF_ERA);
		range(OffsetDateTime.now(), ChronoField.YEAR);
		range(OffsetDateTime.now(), ChronoField.ERA);
		range(OffsetDateTime.now(), ChronoField.INSTANT_SECONDS);
		range(OffsetDateTime.now(), ChronoField.OFFSET_SECONDS);

		// ------------------------------------------------get的成员方法----------------------------------------------------
		get(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND);
		get(OffsetDateTime.now(), ChronoField.MICRO_OF_SECOND);
		get(OffsetDateTime.now(), ChronoField.MILLI_OF_SECOND);
		get(OffsetDateTime.now(), ChronoField.MILLI_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE);
		get(OffsetDateTime.now(), ChronoField.SECOND_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR);
		get(OffsetDateTime.now(), ChronoField.MINUTE_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.HOUR_OF_AMPM);
		get(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_AMPM);
		get(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.AMPM_OF_DAY);
		get(OffsetDateTime.now(), ChronoField.DAY_OF_WEEK);
		get(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		get(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		get(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH);
		get(OffsetDateTime.now(), ChronoField.DAY_OF_YEAR);
		get(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_MONTH);
		get(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_YEAR);
		get(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR);
		get(OffsetDateTime.now(), ChronoField.YEAR_OF_ERA);
		get(OffsetDateTime.now(), ChronoField.YEAR);
		get(OffsetDateTime.now(), ChronoField.ERA);
		get(OffsetDateTime.now(), ChronoField.OFFSET_SECONDS);

		// ----------------------------------------------getLong的成员方法--------------------------------------------------
		getLong(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND);
		getLong(OffsetDateTime.now(), ChronoField.NANO_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.MICRO_OF_SECOND);
		getLong(OffsetDateTime.now(), ChronoField.MICRO_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.MILLI_OF_SECOND);
		getLong(OffsetDateTime.now(), ChronoField.MILLI_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE);
		getLong(OffsetDateTime.now(), ChronoField.SECOND_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR);
		getLong(OffsetDateTime.now(), ChronoField.MINUTE_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.HOUR_OF_AMPM);
		getLong(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_AMPM);
		getLong(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.CLOCK_HOUR_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.AMPM_OF_DAY);
		getLong(OffsetDateTime.now(), ChronoField.DAY_OF_WEEK);
		getLong(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		getLong(OffsetDateTime.now(), ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		getLong(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH);
		getLong(OffsetDateTime.now(), ChronoField.DAY_OF_YEAR);
		getLong(OffsetDateTime.now(), ChronoField.EPOCH_DAY);
		getLong(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_MONTH);
		getLong(OffsetDateTime.now(), ChronoField.ALIGNED_WEEK_OF_YEAR);
		getLong(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR);
		getLong(OffsetDateTime.now(), ChronoField.PROLEPTIC_MONTH);
		getLong(OffsetDateTime.now(), ChronoField.YEAR_OF_ERA);
		getLong(OffsetDateTime.now(), ChronoField.YEAR);
		getLong(OffsetDateTime.now(), ChronoField.ERA);
		getLong(OffsetDateTime.now(), ChronoField.INSTANT_SECONDS);
		getLong(OffsetDateTime.now(), ChronoField.OFFSET_SECONDS);

		// ---------------------------------------------getOffset的成员方法-------------------------------------------------
		getOffset(OffsetDateTime.now());

		// ----------------------------------------withOffsetSameLocal的成员方法--------------------------------------------
		for (int i = 8; i > 0; i--)
			withOffsetSameLocal(OffsetDateTime.now(), ZoneOffset.ofHours(i));

		// ---------------------------------------withOffsetSameInstant 的成员方法-------------------------------------------
		for (int i = 8; i > 0; i--)
			withOffsetSameInstant(OffsetDateTime.now(), ZoneOffset.ofHours(i));

		// ------------------------------------------toLocalDateTime 的成员方法---------------------------------------------
		toLocalDateTime(OffsetDateTime.now());

		// -------------------------------------------toLocalDate 的成员方法------------------------------------------------
		toLocalDate(OffsetDateTime.now());

		// -------------------------------------------toLocalTime 的成员方法------------------------------------------------
		toLocalTime(OffsetDateTime.now());

		// ----------------------------------------------with 的成员方法----------------------------------------------------
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), LocalDateTime.now());
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), LocalDate.now());
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), LocalTime.now());
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), Instant.now());
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), ZoneOffset.ofHours(-12));
		with(OffsetDateTime.of(2022, 12, 23, 13, 15, 45, 234,
			ZoneOffset.ofHours(+8)), OffsetDateTime.now());

		with(OffsetDateTime.now(), ChronoField.YEAR, 2022);
		with(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR, 12);
		with(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH, 12);
		with(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY, 12);
		with(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR, 12);
		with(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE, 12);
		with(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND, 12);

		// -------------withYear/withDayOfMonth/withDayOfYear/withMonth/withHour/withMinute/withSecond/withNano-------------
		withOthersMethods(OffsetDateTime.now(), ChronoField.YEAR, 2022);
		withOthersMethods(OffsetDateTime.now(), ChronoField.DAY_OF_MONTH, 23);
		withOthersMethods(OffsetDateTime.now(), ChronoField.DAY_OF_YEAR, 12);
		withOthersMethods(OffsetDateTime.now(), ChronoField.MONTH_OF_YEAR, 12);
		withOthersMethods(OffsetDateTime.now(), ChronoField.HOUR_OF_DAY, 12);
		withOthersMethods(OffsetDateTime.now(), ChronoField.MINUTE_OF_HOUR, 12);
		withOthersMethods(OffsetDateTime.now(), ChronoField.SECOND_OF_MINUTE, 12);
		withOthersMethods(OffsetDateTime.now(), ChronoField.NANO_OF_SECOND, 12);

		// -------------------------------------------truncatedTo 的成员方法------------------------------------------------

		truncatedTo(OffsetDateTime.now(), ChronoUnit.NANOS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.MICROS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.MILLIS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.SECONDS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.MINUTES);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.HOURS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.HALF_DAYS);
		truncatedTo(OffsetDateTime.now(), ChronoUnit.DAYS);

		// -----------------------------------------------plus 的成员方法---------------------------------------------------
		plus(OffsetDateTime.now(), Duration.ofDays(12));
		plus(OffsetDateTime.now(), Duration.ofHours(12));
		plus(OffsetDateTime.now(), Duration.ofMinutes(12));
		plus(OffsetDateTime.now(), Duration.ofSeconds(12));
		plus(OffsetDateTime.now(), Duration.ofMillis(12));
		plus(OffsetDateTime.now(), Duration.ofNanos(12));

		// ------------------------------------------------atZoneSameInstant------------------------------------------------
		atZoneSameInstant(OffsetDateTime.now(), ZoneId.of("America/Chicago"));
		atZoneSameInstant(OffsetDateTime.now(), ZoneId.of("Asia/Shanghai"));

		// ------------------------------------------------atZoneSimilarLocal-----------------------------------------------
		atZoneSimilarLocal(OffsetDateTime.now(), ZoneId.of("America/Chicago"));
		atZoneSimilarLocal(OffsetDateTime.now(), ZoneId.of("Asia/Shanghai"));

	}

	/**
	 * {@link OffsetDateTime}类的成员方法isSupported测试，支持{@link ChronoField}的所有静态成员变量。</br>
	 *
	 * @param offsetDateTime
	 * @param field
	 */
	private void isSupported(OffsetDateTime offsetDateTime, TemporalField field) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）isSupported(" + field + ")："
			+ offsetDateTime.isSupported(field));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法isSupported测试，
	 * 支持{@link ChronoUnit}除了{@link ChronoUnit.FOREVER}之外的所有静态全局变量。</br>
	 *
	 * @param offsetDateTime
	 * @param unit
	 */
	private void isSupported(OffsetDateTime offsetDateTime, TemporalUnit unit) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）isSupported(" + unit + ")："
			+ offsetDateTime.isSupported(unit));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法isSupported测试。</br>
	 *
	 * @param offsetDateTime
	 * @param field
	 */
	private void range(OffsetDateTime offsetDateTime, TemporalField field) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配");
		if (offsetDateTime.isSupported(field)) {
			ValueRange valueRange = offsetDateTime.range(field);
			System.out.println("OffsetDateTime类的offsetDateTime(" + offsetDateTime + ").range(" + field + ") : "
				+ valueRange);
		} else {
			System.out.println("offsetDateTime类的offsetDateTime(" + offsetDateTime + ").range(" + field + ") : "
				+ field + "不支持！");
		}
	}

	/**
	 * {@link OffsetDateTime}类的成员方法get测试,
	 * {@link ChronoField.NANO_OF_DAY} , {@link ChronoField.MICRO_OF_DAY} , {@link ChronoField.EPOCH_DAY} ,
	 * {@link ChronoField.PROLEPTIC_MONTH} , {@link ChronoField.INSTANT_SECONDS}不支持使用此方法，使用getLong（）。</br>
	 *
	 * @param offsetDateTime
	 * @param field
	 */
	public void get(OffsetDateTime offsetDateTime, TemporalField field) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配");
		if (offsetDateTime.isSupported(field)) {
			try {
				int valueRange = offsetDateTime.get(field);
				System.out.println("OffsetDateTime类的offsetDateTime(" + offsetDateTime + ").get(" + field + ") : "
					+ valueRange);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("offsetDateTime类的offsetDateTime(" + offsetDateTime + ").get(" + field + ") : "
				+ field + "不支持！");
		}
	}

	/**
	 * {@link OffsetDateTime}类的成员方法getLong测试。</br>
	 *
	 * @param offsetDateTime
	 * @param field
	 */
	private void getLong(OffsetDateTime offsetDateTime, TemporalField field) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配");
		if (offsetDateTime.isSupported(field)) {
			try {
				Long valueRange = offsetDateTime.getLong(field);
				System.out.println("OffsetDateTime类的offsetDateTime(" + offsetDateTime + ").getLong(" + field + ") : "
					+ valueRange);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("offsetDateTime类的offsetDateTime(" + offsetDateTime + ").getLong(" + field + ") : "
				+ field + "不支持！");
		}
	}

	/**
	 * {@link OffsetDateTime}类的成员方法getOffsetd测试。</br>
	 *
	 * @param offsetDateTime
	 */
	private void getOffset(OffsetDateTime offsetDateTime) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）getOffset()："
			+ offsetDateTime.getOffset());
	}

	/**
	 * {@link OffsetDateTime}类的成员方法withOffsetSameLocal测试。仅设置时间的偏移量，并不修改具体的时间。</br>
	 *
	 * @param offsetDateTime
	 * @param offset
	 */
	private void withOffsetSameLocal(OffsetDateTime offsetDateTime, ZoneOffset offset) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）withOffsetSameLocal(" + offset + ")："
			+ offsetDateTime.withOffsetSameLocal(offset));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法withOffsetSameInstant测试。不仅设置时间的偏移量，还会修改具体的时间。</br>
	 *
	 * @param offsetDateTime
	 * @param offset
	 */
	private void withOffsetSameInstant(OffsetDateTime offsetDateTime, ZoneOffset offset) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）withOffsetSameInstant(" + offset + ")："
			+ offsetDateTime.withOffsetSameInstant(offset));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法toLocalDateTime测试。</br>
	 *
	 * @param offsetDateTime
	 */
	private void toLocalDateTime(OffsetDateTime offsetDateTime) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.toLocalDateTime()："
			+ offsetDateTime.toLocalDateTime());
	}

	/**
	 * {@link OffsetDateTime}类的成员方法toLocalDate测试。</br>
	 *
	 * @param offsetDateTime
	 */
	private void toLocalDate(OffsetDateTime offsetDateTime) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.toLocalDate()："
			+ offsetDateTime.toLocalDate());
	}

	/**
	 * {@link OffsetDateTime}类的成员方法toLocalTime测试。</br>
	 *
	 * @param offsetDateTime
	 */
	private void toLocalTime(OffsetDateTime offsetDateTime) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.toLocalTime()："
			+ offsetDateTime.toLocalTime());
	}

	/**
	 * {@link OffsetDateTime}类的成员方法with测试。</br>
	 *
	 * @param adjuster
	 */
	private void with(OffsetDateTime offsetDateTime, TemporalAdjuster adjuster) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.with( " + adjuster + ")："
			+ offsetDateTime.with(adjuster));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法with测试。</br>
	 *
	 * @param offsetDateTime
	 * @param field
	 * @param newValue
	 */
	private void with(OffsetDateTime offsetDateTime, TemporalField field, long newValue) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.with( " + field + "," + newValue + ")："
			+ offsetDateTime.with(field, newValue));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法withYear
	 * withDayOfMonth
	 * withDayOfYear
	 * withMonth
	 * withHour
	 * withMinute
	 * withSecond
	 * withNano测试。</br>
	 *
	 * @param offsetDateTime
	 * @param chronoField
	 * @param newValue
	 */
	private void withOthersMethods(OffsetDateTime offsetDateTime, ChronoField chronoField, int newValue) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		Objects.requireNonNull(chronoField, chronoField.getClass().getName() + "类型不匹配!");
		switch (chronoField) {
			case YEAR:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withYear( " + newValue + ")："
					+ offsetDateTime.withYear(newValue));
				break;
			case DAY_OF_MONTH:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withDayOfMonth( " + newValue + ")："
					+ offsetDateTime.withDayOfMonth(newValue));
				break;
			case DAY_OF_YEAR:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withDayOfYear( " + newValue + ")："
					+ offsetDateTime.withDayOfYear(newValue));
				break;
			case MONTH_OF_YEAR:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withMonth( " + newValue + ")："
					+ offsetDateTime.withMonth(newValue));
				break;
			case HOUR_OF_DAY:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withHour( " + newValue + ")："
					+ offsetDateTime.withHour(newValue));
				break;
			case MINUTE_OF_HOUR:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withMinute( " + newValue + ")："
					+ offsetDateTime.withMinute(newValue));
				break;
			case SECOND_OF_MINUTE:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withSecond( " + newValue + ")："
					+ offsetDateTime.withSecond(newValue));
				break;
			case NANO_OF_SECOND:
				System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.withNano( " + newValue + ")："
					+ offsetDateTime.withNano(newValue));
				break;
			default:
				break;
		}
	}

	/**
	 * {@link OffsetDateTime}类的成员方法truncatedTo测试，截取对应的字段。
	 * 如日期是2021-10-27T21:31:40.163+08:00，参数是{@link ChronoUnit.DAYS}，返回值是2021-10-27T00:00+08:00。
	 * {@link ChronoUnit.NANOS}
	 * {@link ChronoUnit.MICROS}
	 * {@link ChronoUnit.MILLIS}
	 * {@link ChronoUnit.SECONDS}
	 * {@link ChronoUnit.MINUTES}
	 * {@link ChronoUnit.HOURS}
	 * {@link ChronoUnit.HALF_DAYS}
	 * {@link ChronoUnit.DAYS}
	 *
	 * @param offsetDateTime
	 * @param field
	 * @param newValue
	 */
	private void truncatedTo(OffsetDateTime offsetDateTime, TemporalUnit unit) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.truncatedTo( " + unit + ")："
			+ offsetDateTime.truncatedTo(unit));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法plus测试，截取对应的字段。
	 *
	 * @param offsetDateTime
	 * @param amountToAdd
	 */
	private void plus(OffsetDateTime offsetDateTime, TemporalAmount amountToAdd) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.plus( " + amountToAdd + ")："
			+ offsetDateTime.plus(amountToAdd));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法plus测试，截取对应的字段。
	 *
	 * @param offsetDateTime
	 * @param amountToAdd
	 */
	private void atZoneSameInstant(OffsetDateTime offsetDateTime, ZoneId zone) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.atZoneSameInstant( " + zone + ")："
			+ offsetDateTime.atZoneSameInstant(zone));
	}

	/**
	 * {@link OffsetDateTime}类的成员方法plus测试，截取对应的字段。
	 *
	 * @param offsetDateTime
	 * @param amountToAdd
	 */
	private void atZoneSimilarLocal(OffsetDateTime offsetDateTime, ZoneId zone) {
		Objects.requireNonNull(offsetDateTime, offsetDateTime.getClass().getName() + "类型不匹配!");
		System.out.println("OffsetDateTime的成员方法offsetDateTime（" + offsetDateTime + "）.atZoneSimilarLocal( " + zone + ")："
			+ offsetDateTime.atZoneSimilarLocal(zone));
	}




	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new OffsetDateTimeDemo());
	}
}
