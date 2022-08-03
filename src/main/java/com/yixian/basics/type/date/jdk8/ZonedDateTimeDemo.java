package com.yixian.basics.type.date.jdk8;

import com.yixian.basics.type.date.util.JDK8OfDateOfAttributesUtil;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ZonedDateTimeDemo extends AbstractTestTemplate {

	@Override
	protected void staticMethodsOfThis() throws Exception {

		// ----------------------------------------------------now()方法----------------------------------------------------
		now();
		for (int i = 9; i >= 0; i--)
			now(Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(i)));
		now(ZoneId.systemDefault());

		Set<Map.Entry<String, String>> entries = ZoneId.SHORT_IDS.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			now(ZoneId.of(iterator.next().getValue()));
		}

		// ----------------------------------------------------of()方法----------------------------------------------------
		for (Map.Entry<String, String> entry : entries) {
			of(LocalDateTime.now(), ZoneId.of(entry.getValue()));
			of(LocalDate.now(), LocalTime.now(), ZoneId.of(entry.getValue()));
		}

		// --------------------------------------------------------ofLocal（）方法------------------------------------------
		ofLocal(LocalDateTime.now(), ZoneId.of("Africa/Addis_Ababa"), null);
		ofLocal(LocalDateTime.now(), ZoneId.of("Africa/Addis_Ababa"), ZoneOffset.ofHours(+8));

		// -------------------------------------------------------ofInstant（）方法-----------------------------------------
		ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai"));
		ofInstant(LocalDateTime.now(), ZoneOffset.ofHours(8), ZoneId.of("Africa/Addis_Ababa"));
		ofInstant(LocalDateTime.now(), ZoneOffset.ofHours(8), ZoneId.of("Asia/Shanghai"));

		// --------------------------------------------------ofStrict（）方法-----------------------------------------------
		ofStrict(LocalDateTime.now(), ZoneOffset.ofHours(+8), ZoneId.of("Asia/Shanghai"));

		// ----------------------------------------------------from（）方法-------------------------------------------------
		from(OffsetDateTime.now());
		from(Instant.now().atOffset(ZoneOffset.ofHours(+7)));

		// ---------------------------------------------------parse（）方法------------------------------------------------
		parse("2001-11-02T20:12:43.371+07:00", DateTimeFormatter.ISO_ZONED_DATE_TIME);

	}


	/**
	 * {@link ZonedDateTime} 类的静态方法now测试。<br/>
	 */
	private void now() {
		System.out.println("ZonedDateTime的静态方法now()：" + ZonedDateTime.now());
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法now测试。<br/>
	 */
	private void now(Clock clock) {
		System.out.println("ZonedDateTime的静态方法now(" + clock + ")：" + ZonedDateTime.now(clock));
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法now测试。<br/>
	 */
	private void now(ZoneId zoneId) {
		System.out.println("ZonedDateTime的静态方法now(" + zoneId + ")：" + ZonedDateTime.now(zoneId));
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法of测试。<br/>
	 *
	 * @param localDateTime
	 * @param zone
	 */
	private void of(LocalDateTime localDateTime, ZoneId zone) {
		Objects.requireNonNull(localDateTime, "类型不能为空");
		Objects.requireNonNull(zone, "类型不能为空");
		System.out.println("ZonedDateTime的静态方法of(" + localDateTime + "," + zone + ")："
			+ ZonedDateTime.of(localDateTime, zone));

	}

	/**
	 * {@link ZonedDateTime} 类的静态方法of测试。<br/>
	 *
	 * @param localDate
	 * @param localTime
	 * @param zone
	 */
	private void of(LocalDate localDate, LocalTime localTime, ZoneId zone) {
		Objects.requireNonNull(localDate, "类型不能为空");
		Objects.requireNonNull(zone, "类型不能为空");
		System.out.println("ZonedDateTime的静态方法of(" + localDate + "," + localTime + "," + zone + ")："
			+ ZonedDateTime.of(localDate, localTime, zone));
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法ofLocal测试。<br/>
	 *
	 * @param localDateTime
	 * @param zone
	 * @param preferredOffset
	 */
	private void ofLocal(LocalDateTime localDateTime, ZoneId zone, ZoneOffset preferredOffset) {
		Objects.requireNonNull(localDateTime, "类型不能为空");
		Objects.requireNonNull(zone, "类型不能为空");
		System.out.println("ZonedDateTime的静态方法of(" + localDateTime + "," + zone + "," + preferredOffset + ")："
			+ ZonedDateTime.ofLocal(localDateTime, zone, preferredOffset));
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法ofInstant测试。<br/>
	 *
	 * @param instant
	 * @param zoneId
	 */
	private void ofInstant(Instant instant, ZoneId zoneId) {
		Objects.requireNonNull(instant, "类型不能为空");
		Objects.requireNonNull(zoneId, "类型不能为空");

		System.out.println("ZonedDateTime的静态方法ofInstant(" + instant + "," + zoneId + ")："
			+ ZonedDateTime.ofInstant(instant, zoneId));
	}

	/**
	 * {@link ZonedDateTime} 类的静态方法ofInstant测试。<br/>
	 *
	 * @param localDateTime the local date-time, not null
	 * @param offset        the zone offset, not null
	 * @param zone          the time-zone, not null
	 */
	private void ofInstant(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone) {
		Objects.requireNonNull(localDateTime, "类型不能为空");
		Objects.requireNonNull(offset, "类型不能为空");
		Objects.requireNonNull(zone, "类型不能为空");

		System.out.println("ZonedDateTime的静态方法ofInstant(" + localDateTime + "," + offset + "," + zone + ")："
			+ ZonedDateTime.ofInstant(localDateTime, offset, zone));
	}

	/**
	 * {@link ZonedDateTime}类的静态方法<function>ofStrict</function>测试。</br>
	 *
	 * @param localDateTime
	 * @param zoneOffset
	 * @param zoneId
	 */
	private void ofStrict(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
		Objects.requireNonNull(localDateTime, localDateTime.getClass().getTypeName() + "类型不能为空!");
		Objects.requireNonNull(zoneOffset, zoneOffset.getClass().getTypeName() + "类型不能为空!");
		Objects.requireNonNull(zoneId, zoneId.getClass().getTypeName() + "类型不能为空!");
		System.out.println("ZonedDateTime的静态方法ofStrict(" + localDateTime + "," + zoneOffset + "," + zoneId + ")："
			+ ZonedDateTime.ofStrict(localDateTime, zoneOffset, zoneId));
	}

	/**
	 * {@link ZonedDateTime}类的静态方法<function>from</function>测试。</br>
	 *
	 * @param temporalAccessor 支持{@link TemporalAccessor} 的子类{@link OffsetDateTime} 和{@link ZonedDateTime}。
	 */
	private void from(TemporalAccessor temporalAccessor) {
		System.out.println("ZonedDateTime的静态方法from(" + temporalAccessor + ")：" + ZonedDateTime.from(temporalAccessor));
	}

	/**
	 * {@link ZonedDateTime}类的静态方法<function>parse</function>测试。</br>
	 * 此方法存在重载，此处只测试基本的方法。
	 *
	 * @param text
	 * @param formatter
	 */
	private void parse(CharSequence text, DateTimeFormatter formatter) {
		System.out.println("ZonedDateTime的静态方法parse(" + text + "," + formatter + ")：" +
			ZonedDateTime.parse(text, formatter));

	}

	/**
	 * 成员方法测试。<br/>
	 *
	 * @throws Exception
	 */
	@Override
	protected void instanceMethodsOfThis() throws Exception {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		// ----------------------------------------------------isSupported--------------------------------------------------
		for (ChronoField field : JDK8OfDateOfAttributesUtil.CHRONO_FIELDS) {
			isSupported(zonedDateTime, field);
		}

		for (ChronoUnit chronoUnit : JDK8OfDateOfAttributesUtil.CHRONO_UNITS) {
			isSupported(zonedDateTime, chronoUnit);
		}

		// -------------------------------------------------------range-----------------------------------------------------
		for (ChronoField field : JDK8OfDateOfAttributesUtil.CHRONO_FIELDS) {
			range(zonedDateTime, field);
		}

		// --------------------------------------------------------get------------------------------------------------------
		for (ChronoField field : JDK8OfDateOfAttributesUtil.CHRONO_FIELDS) {
			if (field == ChronoField.NANO_OF_DAY ||
				field == ChronoField.MICRO_OF_DAY ||
				field == ChronoField.EPOCH_DAY ||
				field == ChronoField.PROLEPTIC_MONTH ||
				field == ChronoField.INSTANT_SECONDS) {
				continue;
			}
			get(zonedDateTime, field);
		}

		// ------------------------------------------------------getLong----------------------------------------------------
		for (ChronoField field : JDK8OfDateOfAttributesUtil.CHRONO_FIELDS) {
			getLong(zonedDateTime, field);
		}

		// -----------------------------------------------------getOffset---------------------------------------------------
		getOffset(zonedDateTime);

	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>isSupported</function>测试。</br>
	 * 支持枚举类{@link ChronoField}的所有枚举。
	 *
	 * @param zonedDateTime
	 * @param field
	 */
	private void isSupported(ZonedDateTime zonedDateTime, TemporalField field) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		Objects.requireNonNull(field, field.getClass().getTypeName() + "类型不能为空！");
		Object value = zonedDateTime.isSupported(field);
		System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). isSupported(" + field + ")：" + value);
	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>isSupported</function>测试。</br>
	 * 支持枚举类{@link ChronoField}的下列枚举。
	 * {@link ChronoUnit.NANOS}
	 * {@link ChronoUnit.MICROS}
	 * {@link ChronoUnit.MILLIS}
	 * {@link ChronoUnit.SECONDS}
	 * {@link ChronoUnit.MINUTES}
	 * {@link ChronoUnit.HOURS}
	 * {@link ChronoUnit.HALF_DAYS}
	 * {@link ChronoUnit.DAYS}
	 * {@link ChronoUnit.WEEKS}
	 * {@link ChronoUnit.MONTHS}
	 * {@link ChronoUnit.YEARS}
	 * {@link ChronoUnit.DECADES}
	 * {@link ChronoUnit.CENTURIES}
	 * {@link ChronoUnit.MILLENNIA}
	 * {@link ChronoUnit.ERAS}
	 *
	 * @param zonedDateTime
	 * @param temporalUnit
	 */
	private void isSupported(ZonedDateTime zonedDateTime, TemporalUnit temporalUnit) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		Objects.requireNonNull(temporalUnit, temporalUnit.getClass().getTypeName() + "类型不能为空！");
		Object value = zonedDateTime.isSupported(temporalUnit);
		System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). isSupported(" + temporalUnit + ")：" + value);
	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>range</function>测试。</br>
	 *
	 * @param zonedDateTime
	 * @param field
	 */
	private void range(ZonedDateTime zonedDateTime, TemporalField field) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		Objects.requireNonNull(field, field.getClass().getTypeName() + "类型不能为空！");
		if (zonedDateTime.isSupported(field)) {
			Object value = zonedDateTime.range(field);
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). range(" + field + ")：" + value);
		} else {
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). range(" + field + ")：" + "不支持！");
		}

	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>get</function>测试。</br>
	 *
	 * @param zonedDateTime
	 * @param field
	 */
	private void get(ZonedDateTime zonedDateTime, TemporalField field) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		Objects.requireNonNull(field, field.getClass().getTypeName() + "类型不能为空！");
		if (zonedDateTime.isSupported(field)) {
			Object value = zonedDateTime.get(field);
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). get(" + field + ")：" + value);
		} else {
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). get(" + field + ")：" + "不支持！");
		}

	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>get</function>测试。</br>
	 *
	 * @param zonedDateTime
	 * @param field
	 */
	private void getLong(ZonedDateTime zonedDateTime, TemporalField field) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		Objects.requireNonNull(field, field.getClass().getTypeName() + "类型不能为空！");
		if (zonedDateTime.isSupported(field)) {
			Object value = zonedDateTime.getLong(field);
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). getLong(" + field + ")：" + value);
		} else {
			System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). getLong(" + field + ")：" + "不支持！");
		}
	}

	/**
	 * {@link ZonedDateTime}类的成员方法<function>getOffset</function>测试。</br>
	 *
	 * @param zonedDateTime
	 */
	private void getOffset(ZonedDateTime zonedDateTime) {
		Objects.requireNonNull(zonedDateTime, zonedDateTime.getClass().getTypeName() + "类型不能为空！");
		System.out.println("ZonedDateTime的静态方法zonedDateTime(" + zonedDateTime + "). getOffset()：" + zonedDateTime.getOffset());

	}


	@Override
	protected void constructorsOfThis() {
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new ZonedDateTimeDemo());
	}
}
