package com.yixian.basics.type.date.jdk8;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Objects;

/**
 * {@link LocalDateTime} 当前日期时间类的测试。</br>
 */
public class LocalDateTimeDemo extends AbstractTestTemplate {

	@Override
	protected void staticMethodsOfThis() throws Exception {
		nowMethod();
		ofMethod();
		ofEpochSecond();
		ofInstant();
		from(LocalDateTime.now());
		from(ZonedDateTime.now());
		from(OffsetDateTime.now());
		parse("2020-10-11T20:55:57.524");
		parse("2020-10-11 20:55:57.524", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
		parse("2020年10月11日20时55分57秒524纳秒", DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒SSS纳秒"));
		staticProperties();
	}

	/**
	 * {@link LocalDateTime}的now方法测试。<br/>
	 */
	private void nowMethod() {

		// {@link LocalDateTime}
		LocalDateTime localDateTimeNoParam = LocalDateTime.now();
		System.out.println("LocalDate的now()方法执行：" + localDateTimeNoParam);

		// 本地日期时间的now方法，以时钟{@link Clock}的参数
		LocalDateTime localDateTimeOfClock = LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
		System.out.println("LocalDate的now(" + Clock.system(ZoneId.of("America/Chicago")) + ")方法执行：" + localDateTimeOfClock);

		// 本地日期时间的now方法，以时区{@link ZoneId}的参数
		LocalDateTime localDateTimeOfZoneId = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("LocalDate的now(" + ZoneId.of("America/Chicago") + ")方法执行：" + localDateTimeOfZoneId);
	}

	/**
	 * {@link LocalDateTime}的of方法测试。<br/>
	 */
	private void ofMethod() {

		// 类的of方法：参数类型为：LocalDate，LocalTime
		LocalDateTime ofLocalDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(ofLocalDateTime.getClass().getTypeName() + "方法of (" + LocalDate.now()
			+ "," + LocalTime.now() + ")：= " + ofLocalDateTime);

		// 类的of方法：参数类型为：int year, int month, int dayOfMonth, int hour, int minute
		LocalDateTime ofParamsMinute = LocalDateTime.of(2021, 12, 01, 12, 23);
		System.out.println(ofParamsMinute.getClass().getTypeName() + "方法of(2021(年),12(月),01(日),12(时),23(分)) : = "
			+ ofParamsMinute);

		// 类的of方法：参数类型为：int year, int month, int dayOfMonth, int hour, int minute, int second
		LocalDateTime ofParamsSeconds = LocalDateTime.of(2021, 12, 01, 12,
			23, 23);
		System.out.println(ofParamsSeconds.getClass().getTypeName() +
			"方法of(2021(年),12(月),01(日),12(时),23(分),23(秒)) : = " + ofParamsSeconds);

		// 类的of方法：参数类型为：int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond
		LocalDateTime ofParamsSecondsNanos = LocalDateTime.of(2021, 12, 01, 12,
			23, 24, 345);
		System.out.println(ofParamsSecondsNanos.getClass().getTypeName() +
			"方法of(2021(年),12(月),01(日),12(时),23(分),23(秒),345(纳秒)) : = " + ofParamsSeconds);
	}

	/**
	 * {@link LocalDateTime}的ofEpochSecond方法测试。<br/>
	 */
	private void ofEpochSecond() {

		// 类的of方法：参数类型为：long epochSecond, int nanoOfSecond, ZoneOffset offset
		LocalDateTime ofLocalDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		long epochSecond = ofLocalDateTime.toEpochSecond(ZoneOffset.ofHours(+8));
		LocalDateTime localDateTimeOfParams = LocalDateTime.ofEpochSecond(epochSecond - 24 * 60 * 60,
			0, ZoneOffset.ofHours(+8));
		System.out.println(localDateTimeOfParams.getClass().getTypeName() +
			"方法ofEpochSecond(" + epochSecond + "," + 0 + "," + ZoneOffset.ofHours(+8) + "): = " + localDateTimeOfParams);

	}

	/**
	 * {@link LocalDateTime}的ofInstant方法测试。<br/>
	 */
	private void ofInstant() {

		// 类的of方法：参数类型为：long epochSecond, int nanoOfSecond, ZoneOffset offset
		LocalDateTime ofLocalDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.ofHours(+8));
		System.out.println(ofLocalDateTime.getClass().getTypeName() +
			"方法ofEpochSecond(" + Instant.now() + "," + ZoneOffset.ofHours(+8) + "): = " + ofLocalDateTime);
	}

	/**
	 * {@link LocalDateTime}的from方法测试。<br/>
	 */
	private void from(TemporalAccessor temporal) {
		final LocalDateTime from = LocalDateTime.from(temporal);
		System.out.println(from.getClass().getTypeName() +
			"方法from(" + temporal + "): = " + from);

	}

	/**
	 * {@link LocalDateTime}的parse方法测试。<br/>
	 */
	private void parse(CharSequence text) {
		final LocalDateTime parse = LocalDateTime.parse(text);
		System.out.println(parse.getClass().getTypeName() +
			"方法from(" + text + "): = " + parse);
	}

	/**
	 * {@link LocalDateTime}的parse方法测试。<br/>
	 */
	private void parse(CharSequence text, DateTimeFormatter formatter) {
		Objects.requireNonNull(text, text.getClass().getTypeName() + "型参数不能为空！");
		Objects.requireNonNull(formatter, formatter.getClass().getTypeName() + "型参数不能为空！");
		final LocalDateTime parse = LocalDateTime.parse(text, formatter);
		System.out.println(parse.getClass().getTypeName() +
			"方法from(" + text + "): = " + parse);
	}

	/**
	 * {@link LocalDateTime}的公共静态成员MIN和MAX测试。<br/>
	 */
	private void staticProperties() {
		System.out.println("LocalDateTime类的公共静态成员MIN：" + LocalDateTime.MIN);
		System.out.println("LocalDateTime类的公共静态成员MAX：" + LocalDateTime.MAX);
	}

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		LocalDateTime localDateTime = LocalDateTime.now();
		// -------------------------------------------------isSupported方法-------------------------------------------------
		isSupported(localDateTime, ChronoField.DAY_OF_MONTH);
		isSupported(localDateTime, ChronoUnit.DAYS);

		// ----------------------------------------------------range方法----------------------------------------------------
		range(localDateTime, ChronoField.DAY_OF_MONTH);
		range(localDateTime, ChronoField.YEAR_OF_ERA);
		range(localDateTime, ChronoField.YEAR);
		range(localDateTime, ChronoField.MONTH_OF_YEAR);
		range(localDateTime, ChronoField.MINUTE_OF_DAY);
		range(localDateTime, ChronoField.SECOND_OF_DAY);

		// -----------------------------------------------------get方法-----------------------------------------------------
		get(localDateTime, ChronoField.YEAR);
		get(localDateTime, ChronoField.MONTH_OF_YEAR);
		get(localDateTime, ChronoField.DAY_OF_MONTH);
		get(localDateTime, ChronoField.HOUR_OF_DAY);
		get(localDateTime, ChronoField.MINUTE_OF_HOUR);
		get(localDateTime, ChronoField.SECOND_OF_MINUTE);
		get(localDateTime, ChronoField.NANO_OF_SECOND);

		// ---------------------------------------------------getLong方法---------------------------------------------------
		getLong(localDateTime, ChronoField.YEAR);
		getLong(localDateTime, ChronoField.MONTH_OF_YEAR);
		getLong(localDateTime, ChronoField.DAY_OF_MONTH);
		getLong(localDateTime, ChronoField.HOUR_OF_DAY);
		getLong(localDateTime, ChronoField.MINUTE_OF_HOUR);
		getLong(localDateTime, ChronoField.SECOND_OF_MINUTE);
		getLong(localDateTime, ChronoField.NANO_OF_SECOND);

		// -------------------------------------------toLocalDate/toLocalTime方法-------------------------------------------
		toLocalDateOrLocalTime(localDateTime, true); // toLocalDate
		toLocalDateOrLocalTime(localDateTime, false); // toLocalTime

		// --getYear/getMonthValue/getMonth/getDayOfMonth/getDayOfYear/getDayOfWeek/getHour/getMinute/getSecond/getNano方法-
		getOtherMethods(localDateTime, ChronoField.YEAR, false);
		getOtherMethods(localDateTime, ChronoField.MONTH_OF_YEAR, false);
		getOtherMethods(localDateTime, ChronoField.MONTH_OF_YEAR, true);
		getOtherMethods(localDateTime, ChronoField.DAY_OF_MONTH, false);
		getOtherMethods(localDateTime, ChronoField.DAY_OF_YEAR, false);
		getOtherMethods(localDateTime, ChronoField.DAY_OF_WEEK, false);
		getOtherMethods(localDateTime, ChronoField.HOUR_OF_DAY, false);
		getOtherMethods(localDateTime, ChronoField.MINUTE_OF_HOUR, false);
		getOtherMethods(localDateTime, ChronoField.SECOND_OF_MINUTE, false);
		getOtherMethods(localDateTime, ChronoField.NANO_OF_SECOND, false);

		// -----------------------------------------------------with方法----------------------------------------------------
		with(localDateTime, LocalDate.of(2024, 8, 23));
		with(localDateTime, LocalTime.of(12, 12, 13));
		with(localDateTime, LocalDateTime.of(2024, 8, 23, 12, 12, 13));
		with(localDateTime, DayOfWeek.of(1));
		//    with(localDateTime, Instant.now());
		with(localDateTime, ChronoField.YEAR, 2022);
		with(localDateTime, ChronoField.MONTH_OF_YEAR, 11);
		with(localDateTime, ChronoField.DAY_OF_MONTH, 24);
		with(localDateTime, ChronoField.HOUR_OF_DAY, 1);
		with(localDateTime, ChronoField.MINUTE_OF_HOUR, 30);
		with(localDateTime, ChronoField.SECOND_OF_MINUTE, 34);

		// -----------withYear/withMonth/withDayOfMonth/withDayOfYear/withHour/withMinute/withSecond/withNano方法-----------
		withOtherMethods(localDateTime, ChronoField.YEAR, 2029);
		withOtherMethods(localDateTime, ChronoField.MONTH_OF_YEAR, 12);
		withOtherMethods(localDateTime, ChronoField.DAY_OF_MONTH, 12);
		withOtherMethods(localDateTime, ChronoField.DAY_OF_YEAR, 12);
		withOtherMethods(localDateTime, ChronoField.HOUR_OF_DAY, 12);
		withOtherMethods(localDateTime, ChronoField.MINUTE_OF_HOUR, 23);
		withOtherMethods(localDateTime, ChronoField.SECOND_OF_MINUTE, 59);
		withOtherMethods(localDateTime, ChronoField.NANO_OF_SECOND, 59);

		// -------------------------------------------------truncatedTo方法-------------------------------------------------
		truncatedTo(localDateTime, ChronoUnit.HOURS);
		truncatedTo(localDateTime, ChronoUnit.MINUTES);
		truncatedTo(localDateTime, ChronoUnit.NANOS);

		// ----------------------------------------------------plus方法-----------------------------------------------------
		plus(localDateTime, Period.ofDays(12));
		plus(localDateTime, Period.ofMonths(1));
		plus(localDateTime, Period.ofWeeks(2));
		plus(localDateTime, Period.ofYears(2));
		plus(localDateTime, Period.of(1, 1, 1));
		plus(localDateTime, Duration.ofHours(12));
		plus(localDateTime, Duration.ofMinutes(12));

		plus(localDateTime, 1, ChronoUnit.YEARS);
		plus(localDateTime, 1, ChronoUnit.MONTHS);
		plus(localDateTime, 1, ChronoUnit.DAYS);
		plus(localDateTime, 1, ChronoUnit.WEEKS);
		plus(localDateTime, 1, ChronoUnit.HOURS);
		plus(localDateTime, 1, ChronoUnit.MINUTES);
		plus(localDateTime, 1, ChronoUnit.SECONDS);

		// ---------------plusYears/plusMonths/plusWeeks/plusDays/plusHours/plusMinutes/plusSeconds/plusNanos---------------
		plusOtherMethods(localDateTime, ChronoUnit.YEARS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.MONTHS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.DAYS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.WEEKS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.HOURS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.MINUTES, 1);
		plusOtherMethods(localDateTime, ChronoUnit.SECONDS, 1);
		plusOtherMethods(localDateTime, ChronoUnit.NANOS, 1);

		// ----------------------------------------------------minus方法----------------------------------------------------
		minus(localDateTime, Period.ofDays(12));
		minus(localDateTime, Period.ofMonths(1));
		minus(localDateTime, Period.ofWeeks(2));
		minus(localDateTime, Period.ofYears(2));
		minus(localDateTime, Period.of(1, 1, 1));
		minus(localDateTime, Duration.ofHours(12));
		minus(localDateTime, Duration.ofMinutes(12));

		minus(localDateTime, 1, ChronoUnit.YEARS);
		minus(localDateTime, 1, ChronoUnit.MONTHS);
		minus(localDateTime, 1, ChronoUnit.DAYS);
		minus(localDateTime, 1, ChronoUnit.WEEKS);
		minus(localDateTime, 1, ChronoUnit.HOURS);
		minus(localDateTime, 1, ChronoUnit.MINUTES);
		minus(localDateTime, 1, ChronoUnit.SECONDS);

		// -----------minusYears/minusMonths/minusWeeks/minusDays/minusHours/minusMinutes/minusSeconds/minusNanos-----------
		minusOtherMethods(localDateTime, ChronoUnit.YEARS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.MONTHS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.DAYS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.WEEKS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.HOURS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.MINUTES, 1);
		minusOtherMethods(localDateTime, ChronoUnit.SECONDS, 1);
		minusOtherMethods(localDateTime, ChronoUnit.NANOS, 1);

		// ----------------------------------------------------query方法----------------------------------------------------
		query(localDateTime, TemporalQueries.zoneId());
		query(localDateTime, TemporalQueries.zoneId());
		query(localDateTime, TemporalQueries.chronology());
		query(localDateTime, TemporalQueries.offset());
		query(localDateTime, TemporalQueries.localDate());
		query(localDateTime, TemporalQueries.localTime());
		query(localDateTime, TemporalQueries.precision());

		// -------------------------------------------------adjustInto方法--------------------------------------------------
		adjustInto(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		adjustInto(LocalDateTime.of(2022, 12, 01, 12, 23, 23),
			Instant.now().atOffset(ZoneOffset.ofHours(+0)));

		// -------------------------------------------------until方法--------------------------------------------------
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.YEARS);
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.MONTHS);
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.DAYS);
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.HOURS);
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.MINUTES);
		until(localDateTime,
			LocalDateTime.of(2022, 12, 01, 12, 23, 23), ChronoUnit.SECONDS);


		// ---------------------------------------------------format方法----------------------------------------------------
		format(localDateTime, DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH：mm ：ss : SSS"));
		format(localDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH：mm ：ss : SSS"));
		format(localDateTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH：mm ：ss : SSS"));

		// ---------------------------------------------------atOffset方法--------------------------------------------------
		atOffset(localDateTime, ZoneOffset.ofHours(18));

		// ---------------------------------------------------atZone方法----------------------------------------------------
		atZone(localDateTime, ZoneId.of(ZoneId.SHORT_IDS.get("CST")));

		// ----------------------------------------------------比较方法-----------------------------------------------------
		compareTo(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		isAfter(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		isBefore(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		isEqual(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
		equals(localDateTime, LocalDateTime.of(2022, 12, 01, 12, 23, 23));
	}


	/**
	 * {@link LocalDateTime}的isSupported方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 */
	private void isSupported(LocalDateTime localDateTime, TemporalField field) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		boolean isSupportedFlag = localDateTime.isSupported(field);
		System.out.println("LocalDateTime类的isSupported(" + field + ") :" + isSupportedFlag);
	}

	/**
	 * {@link LocalDateTime}的isSupported方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param unit
	 */
	private void isSupported(LocalDateTime localDateTime, TemporalUnit unit) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		boolean isSupportedFlag = localDateTime.isSupported(unit);
		System.out.println("LocalDateTime类的isSupported(" + unit + ") :" + isSupportedFlag);
	}

	/**
	 * {@link LocalDateTime}的range方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 */
	private void range(LocalDateTime localDateTime, TemporalField field) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		ValueRange valueRange = localDateTime.range(field);
		System.out.println("LocalDateTime类的range(" + field + ") :" + valueRange);
	}

	/**
	 * {@link LocalDateTime}的get方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 */
	private void get(LocalDateTime localDateTime, TemporalField field) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		int value = localDateTime.get(field);
		System.out.println("LocalDateTime类的get(" + field + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的getLong方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 */
	private void getLong(LocalDateTime localDateTime, TemporalField field) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		long value = localDateTime.getLong(field);
		System.out.println("LocalDateTime类的getLong(" + field + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的getLong方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param dateOrTimeFlag true ：date ，FALSE ：time
	 */
	private void toLocalDateOrLocalTime(LocalDateTime localDateTime, boolean dateOrTimeFlag) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		if (dateOrTimeFlag) {
			LocalDate value = localDateTime.toLocalDate();
			System.out.println("LocalDateTime类的" + localDateTime + ".toLocalDate() :" + value);
			return;
		}
		LocalTime value = localDateTime.toLocalTime();
		System.out.println("LocalDateTime类的" + localDateTime + ".toLocalTime() :" + value);
	}


	/**
	 * {@link LocalDateTime}的getYear
	 * getMonthValue
	 * getMonth
	 * getDayOfMonth
	 * getDayOfYear
	 * getDayOfWeek
	 * getHour
	 * getMinute
	 * getSecond
	 * getNano方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 * @param monthFlag
	 */
	private void getOtherMethods(LocalDateTime localDateTime, TemporalField field, boolean monthFlag) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(field, field.getClass().getName() + "型参数不能为空！");
		// --getYear
		if (ChronoField.YEAR == field || ChronoField.YEAR.equals(field)) {
			long value = localDateTime.getYear();
			System.out.println("LocalDateTime类的getYear() :" + value);
			// getMonthValue/getMonth
		} else if (ChronoField.MONTH_OF_YEAR == field || ChronoField.MONTH_OF_YEAR.equals(field)) {
			// getMonthValue
			if (!monthFlag) {
				long value = localDateTime.getMonthValue();
				System.out.println("LocalDateTime类的getMonthValue() :" + value);
				// getMonth
			} else {
				Month value = localDateTime.getMonth();
				System.out.println("LocalDateTime类的getMonth() :" + value);
			}
			// getDayOfMonth
		} else if (ChronoField.DAY_OF_MONTH == field || ChronoField.DAY_OF_MONTH.equals(field)) {
			int value = localDateTime.getDayOfMonth();
			System.out.println("LocalDateTime类的getDayOfMonth() :" + value);
			// getDayOfYear
		} else if (ChronoField.DAY_OF_YEAR == field || ChronoField.DAY_OF_YEAR.equals(field)) {
			int value = localDateTime.getDayOfYear();
			System.out.println("LocalDateTime类的getDayOfYear() :" + value);
			// getDayOfWeek
		} else if (ChronoField.DAY_OF_WEEK == field || ChronoField.DAY_OF_WEEK.equals(field)) {
			DayOfWeek value = localDateTime.getDayOfWeek();
			System.out.println("LocalDateTime类的getDayOfWeek() :" + value);
			// getHour
		} else if (ChronoField.HOUR_OF_DAY == field || ChronoField.HOUR_OF_DAY.equals(field)) {
			int value = localDateTime.getHour();
			System.out.println("LocalDateTime类的getHour() :" + value);
			// getMinute
		} else if (ChronoField.MINUTE_OF_HOUR == field || ChronoField.MINUTE_OF_HOUR.equals(field)) {
			int value = localDateTime.getMinute();
			System.out.println("LocalDateTime类的getMinute() :" + value);
			// getSecond
		} else if (ChronoField.SECOND_OF_MINUTE == field || ChronoField.SECOND_OF_MINUTE.equals(field)) {
			int value = localDateTime.getSecond();
			System.out.println("LocalDateTime类的getSecond() :" + value);
			// /getNano方法-
		} else if (ChronoField.NANO_OF_SECOND == field || ChronoField.NANO_OF_SECOND.equals(field)) {
			int value = localDateTime.getNano();
			System.out.println("LocalDateTime类的getNano() :" + value);
		} else {
			throw new TypeNotPresentException(field.getClass().getTypeName() + "类型不支持", null);
		}
	}

	/**
	 * {@link LocalDateTime}的with方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param adjuster
	 */
	private void with(LocalDateTime localDateTime, TemporalAdjuster adjuster) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		LocalDateTime value = localDateTime.with(adjuster);
		System.out.println("LocalDateTime类的with(" + adjuster + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的with方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 * @param newValue
	 */
	private void with(LocalDateTime localDateTime, TemporalField field, long newValue) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		LocalDateTime value = localDateTime.with(field, newValue);
		System.out.println("LocalDateTime类的with(" + field + "," + newValue + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的withYear
	 * withMonth
	 * withDayOfMonth
	 * withDayOfYear
	 * withHour
	 * withMinute
	 * withSecond
	 * withNano方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param field
	 * @param newValue
	 */
	public void withOtherMethods(LocalDateTime localDateTime, TemporalField field, int newValue) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(field, field.getClass().getName() + "型参数不能为空！");
		// --withYear
		if (ChronoField.YEAR == field || ChronoField.YEAR.equals(field)) {
			LocalDateTime value = localDateTime.withYear(newValue);
			System.out.println("LocalDateTime类的withYear(" + newValue + ") :" + value);
			// withMonth
		} else if (ChronoField.MONTH_OF_YEAR == field || ChronoField.MONTH_OF_YEAR.equals(field)) {
			LocalDateTime value = localDateTime.withMonth(newValue);
			System.out.println("LocalDateTime类的withMonth(" + newValue + ") :" + value);
			// withDayOfMonth
		} else if (ChronoField.DAY_OF_MONTH == field || ChronoField.DAY_OF_MONTH.equals(field)) {
			LocalDateTime value = localDateTime.withDayOfMonth(newValue);
			System.out.println("LocalDateTime类的withDayOfMonth(" + newValue + ") :" + value);
			// withDayOfYear
		} else if (ChronoField.DAY_OF_YEAR == field || ChronoField.DAY_OF_YEAR.equals(field)) {
			LocalDateTime value = localDateTime.withDayOfYear(newValue);
			System.out.println("LocalDateTime类的withDayOfYear(" + newValue + ") :" + value);
		} else if (ChronoField.HOUR_OF_DAY == field || ChronoField.HOUR_OF_DAY.equals(field)) {
			LocalDateTime value = localDateTime.withHour(newValue);
			System.out.println("LocalDateTime类的withHour(" + newValue + ") :" + value);
			// withMinute
		} else if (ChronoField.MINUTE_OF_HOUR == field || ChronoField.MINUTE_OF_HOUR.equals(field)) {
			LocalDateTime value = localDateTime.withMinute(newValue);
			System.out.println("LocalDateTime类的withMinute(" + newValue + ") :" + value);
			// withMinute
		} else if (ChronoField.SECOND_OF_MINUTE == field || ChronoField.SECOND_OF_MINUTE.equals(field)) {
			LocalDateTime value = localDateTime.withSecond(newValue);
			System.out.println("LocalDateTime类的withSecond(" + newValue + ") :" + value);
			// withNano方法
		} else if (ChronoField.NANO_OF_SECOND == field || ChronoField.NANO_OF_SECOND.equals(field)) {
			LocalDateTime value = localDateTime.withNano(newValue);
			System.out.println("LocalDateTime类的withNano(" + newValue + ") :" + value);
		} else {
			throw new TypeNotPresentException(field.getClass().getTypeName() + "类型不支持", null);
		}
	}

	/**
	 * {@link LocalDateTime}的truncatedTo方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param unit
	 */
	private void truncatedTo(LocalDateTime localDateTime, ChronoUnit unit) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		LocalDateTime truncatedTo = localDateTime.truncatedTo(unit);
		System.out.println("LocalDateTime类的truncatedTo(" + unit + ") :" + truncatedTo);
	}

	/**
	 * {@link LocalDateTime}的plus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToAdd
	 */
	private void plus(LocalDateTime localDateTime, TemporalAmount amountToAdd) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(amountToAdd, amountToAdd.getClass().getName() + "型参数不能为空！");
		LocalDateTime plus = localDateTime.plus(amountToAdd);
		System.out.println("LocalDateTime类的plus(" + amountToAdd + ") :" + plus);
	}

	/**
	 * {@link LocalDateTime}的plus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToAdd
	 * @param unit
	 */
	private void plus(LocalDateTime localDateTime, long amountToAdd, ChronoUnit unit) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		LocalDateTime plus = localDateTime.plus(amountToAdd, unit);
		System.out.println("LocalDateTime类的plus(" + amountToAdd + "," + unit + ") :" + plus);

	}

	/**
	 * {@link LocalDateTime}的plus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToAdd
	 * @param unit
	 */
	private void plusOtherMethods(LocalDateTime localDateTime, ChronoUnit unit, long amountToAdd) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		// plusYears/plusMonths/plusWeeks/plusDays/plusHours/plusMinutes/plusSeconds/plusNanos
		LocalDateTime value = null;
		String str = "";
		if (ChronoUnit.YEARS == unit || ChronoUnit.YEARS.equals(unit)) {
			value = localDateTime.plusYears(amountToAdd);
			str = "plusYears";
		} else if (ChronoUnit.MONTHS == unit || ChronoUnit.MONTHS.equals(unit)) {
			value = localDateTime.plusMonths(amountToAdd);
			str = "plusMonths";
		} else if (ChronoUnit.WEEKS == unit || ChronoUnit.WEEKS.equals(unit)) {
			value = localDateTime.plusWeeks(amountToAdd);
			str = "plusWeeks";
		} else if (ChronoUnit.DAYS == unit || ChronoUnit.DAYS.equals(unit)) {
			value = localDateTime.plusDays(amountToAdd);
			str = "plusDays";
		} else if (ChronoUnit.HOURS == unit || ChronoUnit.HOURS.equals(unit)) {
			value = localDateTime.plusHours(amountToAdd);
			str = "plusHours";
		} else if (ChronoUnit.MINUTES == unit || ChronoUnit.MINUTES.equals(unit)) {
			value = localDateTime.plusMinutes(amountToAdd);
			str = "plusMinutes";
		} else if (ChronoUnit.SECONDS == unit || ChronoUnit.SECONDS.equals(unit)) {
			value = localDateTime.plusSeconds(amountToAdd);
			str = "plusSeconds";
		} else if (ChronoUnit.NANOS == unit || ChronoUnit.NANOS.equals(unit)) {
			value = localDateTime.plusNanos(amountToAdd);
			str = "plusNanos";
		}
		if (value == null) {
			throw new TypeNotPresentException(unit.getClass().getName() + "类型不匹配！", null);
		} else {
			System.out.println("LocalDateTime类的" + str + "(" + amountToAdd + ") :" + value);
		}
	}

	/**
	 * {@link LocalDateTime}的minus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToSubtract
	 */
	private void minus(LocalDateTime localDateTime, TemporalAmount amountToSubtract) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(amountToSubtract, amountToSubtract.getClass().getName() + "型参数不能为空！");
		LocalDateTime plus = localDateTime.minus(amountToSubtract);
		System.out.println("LocalDateTime类的minus(" + amountToSubtract + ") :" + plus);
	}

	/**
	 * {@link LocalDateTime}的plus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToSubtract
	 * @param unit
	 */
	private void minus(LocalDateTime localDateTime, long amountToSubtract, ChronoUnit unit) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		LocalDateTime minus = localDateTime.minus(amountToSubtract, unit);
		System.out.println("LocalDateTime类的minus(" + amountToSubtract + "," + unit + ") :" + minus);
	}

	/**
	 * {@link LocalDateTime}的plus方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param amountToAdd
	 * @param unit
	 */
	private void minusOtherMethods(LocalDateTime localDateTime, ChronoUnit unit, long amountToAdd) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(unit, unit.getClass().getName() + "型参数不能为空！");
		// minusYears/minusMonths/minusWeeks/minusDays/minusHours/minusMinutes/minusSeconds/minusNanos
		LocalDateTime value = null;
		String str = "";
		if (ChronoUnit.YEARS == unit || ChronoUnit.YEARS.equals(unit)) {
			value = localDateTime.minusYears(amountToAdd);
			str = "minusYears";
		} else if (ChronoUnit.MONTHS == unit || ChronoUnit.MONTHS.equals(unit)) {
			value = localDateTime.minusMonths(amountToAdd);
			str = "minusMonths";
		} else if (ChronoUnit.WEEKS == unit || ChronoUnit.WEEKS.equals(unit)) {
			value = localDateTime.minusWeeks(amountToAdd);
			str = "minusWeeks";
		} else if (ChronoUnit.DAYS == unit || ChronoUnit.DAYS.equals(unit)) {
			value = localDateTime.minusDays(amountToAdd);
			str = "minusDays";
		} else if (ChronoUnit.HOURS == unit || ChronoUnit.HOURS.equals(unit)) {
			value = localDateTime.minusHours(amountToAdd);
			str = "minusHours";
		} else if (ChronoUnit.MINUTES == unit || ChronoUnit.MINUTES.equals(unit)) {
			value = localDateTime.minusMinutes(amountToAdd);
			str = "minusMinutes";
		} else if (ChronoUnit.SECONDS == unit || ChronoUnit.SECONDS.equals(unit)) {
			value = localDateTime.minusSeconds(amountToAdd);
			str = "minusSeconds";
		} else if (ChronoUnit.NANOS == unit || ChronoUnit.NANOS.equals(unit)) {
			value = localDateTime.minusNanos(amountToAdd);
			str = "minusNanos";
		}
		if (value == null) {
			throw new TypeNotPresentException(unit.getClass().getName() + "类型不匹配！", null);
		} else {
			System.out.println("LocalDateTime类的" + str + "(" + amountToAdd + ") :" + value);
		}
	}

	/**
	 * {@link LocalDateTime}的query方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param query
	 */
	private void query(LocalDateTime localDateTime, TemporalQuery query) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Object query1 = localDateTime.query(query);
		System.out.println("LocalDateTime类的query(" + query + ") :" + query1);
	}

	/**
	 * {@link LocalDateTime}的adjustInto方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param temporal
	 */
	private void adjustInto(LocalDateTime localDateTime, Temporal temporal) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Temporal value = localDateTime.adjustInto(temporal);
		System.out.println("LocalDateTime类的adjustInto(" + temporal + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的until方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param endExclusive
	 * @param unit
	 */
	private void until(LocalDateTime localDateTime, Temporal endExclusive, TemporalUnit unit) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		long value = localDateTime.until(endExclusive, unit);
		System.out.println("LocalDateTime类的until(" + endExclusive + "," + unit + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的format方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param dateTimeFormatter
	 */
	private void format(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(dateTimeFormatter, dateTimeFormatter.getClass().getName() + "型参数不能为空！");
		String value = localDateTime.format(dateTimeFormatter);
		System.out.println("LocalDateTime类的format(" + dateTimeFormatter + ") :" + value);
	}

	/**
	 * {@link LocalDateTime}的atOffset方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param zoneOffset
	 */
	private void atOffset(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(zoneOffset, zoneOffset.getClass().getName() + "型参数不能为空！");
		OffsetDateTime offsetDateTime = localDateTime.atOffset(zoneOffset);
		System.out.println("LocalDateTime类的atOffset(" + zoneOffset + ") :" + offsetDateTime);
	}

	/**
	 * {@link LocalDateTime}的atZone方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param zone
	 */
	private void atZone(LocalDateTime localDateTime, ZoneId zone) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(zone, zone.getClass().getName() + "型参数不能为空！");
		ZonedDateTime zonedDateTime = localDateTime.atZone(zone);
		System.out.println("LocalDateTime类的atZone(" + zone + ") :" + zonedDateTime);
	}

	/**
	 * {@link LocalDateTime}的compareTo方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param other
	 */
	private void compareTo(LocalDateTime localDateTime, LocalDateTime other) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(other, other.getClass().getName() + "型参数不能为空！");
		int compareToFlag = localDateTime.compareTo(other);
		System.out.println("LocalDateTime类的compareTo(" + other + ") :" + compareToFlag);
	}

	/**
	 * {@link LocalDateTime}的isAfter方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param other
	 */
	private void isAfter(LocalDateTime localDateTime, LocalDateTime other) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(other, other.getClass().getName() + "型参数不能为空！");
		boolean isAfterFlag = localDateTime.isAfter(other);
		System.out.println("LocalDateTime类的isAfter(" + other + ") :" + isAfterFlag);
	}

	/**
	 * {@link LocalDateTime}的isBefore方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param other
	 */
	private void isBefore(LocalDateTime localDateTime, LocalDateTime other) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(other, other.getClass().getName() + "型参数不能为空！");
		boolean isBeforeFlag = localDateTime.isBefore(other);
		System.out.println("LocalDateTime类的isBefore(" + other + ") :" + isBeforeFlag);
	}

	/**
	 * {@link LocalDateTime}的isEqual方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param other
	 */
	private void isEqual(LocalDateTime localDateTime, LocalDateTime other) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(other, other.getClass().getName() + "型参数不能为空！");
		boolean isEqualFlag = localDateTime.isEqual(other);
		System.out.println("LocalDateTime类的isEqual(" + other + ") :" + isEqualFlag);
	}

	/**
	 * {@link LocalDateTime}的equals方法测试。<br/>
	 *
	 * @param localDateTime
	 * @param other
	 */
	private void equals(LocalDateTime localDateTime, LocalDateTime other) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getName() + "型参数不能为空！");
		Objects.requireNonNull(other, other.getClass().getName() + "型参数不能为空！");
		boolean equalsFlag = localDateTime.equals(other);
		System.out.println("LocalDateTime类的equals(" + other + ") :" + equalsFlag);
	}

	/**
	 * {@link LocalDateTime}没有可访问的构造方法。
	 */
	@Override
	protected void constructorsOfThis() {
	}

	public static void main(String[] args) throws Exception {
		LocalDateTimeDemo localDateTimeDemo = new LocalDateTimeDemo();
		localDateTimeDemo.setConstructorsFlag(localDateTimeDemo.constructorsFlag(LocalDateTime.class));
		TestTemplateUtil.execTemplate(localDateTimeDemo);
	}
}
