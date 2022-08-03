package com.yixian.basics.type.date.jdk8;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.time.*;
import java.time.temporal.*;
import java.util.Objects;

/**
 * {@link Instant}日期类的使用和源码解析。<br/>
 * 为{@link TemporalAdjuster} 和{@link Temporal}接口的子类。
 * {@link Instant}
 * |-----------> {@link Temporal}
 * |----> {@link TemporalAccessor}
 * |-----------> {@link TemporalAdjuster}
 */
public class InstantDemo extends AbstractTestTemplate<Instant> {

	@Override
	protected void staticMethodsOfThis() throws Exception {
		nowOfInstantStaticMethod();
		ofEpochSecondDemo();
		ofEpochMilliDemo();
		fromDemo(Instant.now());
		parse("2021-09-27T15:00:36.000001Z");
	}

	/**
	 * {@link Instant}的now方法测试，now方法不能直接取得与时区相关联的日期
	 */
	private static void nowOfInstantStaticMethod() {
		// 默认无参构造器执行
		final Instant now = Instant.now();
		System.out.println("系统当前毫秒值：" + System.currentTimeMillis());
		System.out.println("Instant.now() :" + now);
		// 获取秒值
		long epochSecondOfNow = now.getEpochSecond();
		// 获取纳秒值
		int nanoOfNow = now.getNano();
		System.out.println("Instant.now() 的毫秒值：" + (epochSecondOfNow * 1000 + (nanoOfNow / 1000000)));
		// 有参构造器执行

		Instant nowOfParam = Instant.now(Clock.systemDefaultZone());
		System.out.println("系统当前毫秒值：" + System.currentTimeMillis());
		System.out.println("Instant.now(" + Clock.systemDefaultZone() + ") : " + nowOfParam);
		// 获取秒值
		long epochSecondOfParam = nowOfParam.getEpochSecond();
		// 获取纳秒值
		int nanoOfParam = nowOfParam.getNano();
		System.out.println("nowOfParam的毫秒值：" + (epochSecondOfParam * 1000 + (nanoOfParam / 1000000)));

		Clock clock = Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(8));
		nowOfParam = Instant.now(clock);
		System.out.println("nowOfParam的毫秒值：" + nowOfParam);
		System.out.println("nowOfParam的毫秒值：" + (epochSecondOfParam * 1000 + (nanoOfParam / 1000000)));
	}

	/**
	 * {@link Instant}的ofEpochSecond方法测试，需要传入秒数。
	 */
	private static void ofEpochSecondDemo() {
		Instant instant = Instant.ofEpochSecond(System.currentTimeMillis() / 1000 + 8 * 60 * 60);
		System.out.println("instant的ofEpochSecond的方法：" + instant);
		// 注： 第二个参数传递的为纳秒单位，纳秒到毫秒的转换为1毫秒=1，000，000纳秒
		Instant instant1 = Instant.ofEpochSecond(System.currentTimeMillis() / 1000 + 8 * 60 * 60, 1000);
		System.out.println("instant的ofEpochSecond的方法：" + instant1);
	}

	/**
	 * {@link Instant}的ofEpochMilli方法测试，需要传入毫秒数。1s = 1000ms
	 */
	private static void ofEpochMilliDemo() {
		Instant instant = Instant.ofEpochMilli(System.currentTimeMillis() + 8 * 60 * 60 * 1000);
		System.out.println("instant的ofEpochMilli的方法：" + instant);
		Instant.ofEpochMilli(System.currentTimeMillis() + 8 * 60 * 60 * 1000);
	}

	/**
	 * {@link Instant}的ofEpochMilli方法测试，需要传入毫秒数。1s = 1000ms
	 */
	private static void fromDemo(TemporalAccessor temporal) {
		Instant from = Instant.from(temporal);
		System.out.println(from);
	}

	private static void parse(final CharSequence text) {
		Instant from = Instant.parse(text);
		System.out.println("instant的parse(" + text + ")的方法：" + from);
	}

	@Override
	protected void constructorsOfThis() {
		if (!super.constructorsFlag(Instant.class)) {
			System.out.println("无构造方法！！");
			return;
		}
	}

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Instant instant = Instant.now();
		atZoneDemo(instant);
		isSupported(instant, ChronoField.INSTANT_SECONDS);
		isSupported(instant, IsoFields.DAY_OF_QUARTER);
		isSupported(instant, ChronoUnit.DAYS);
		isSupported(instant, ChronoUnit.MONTHS);
		get(instant, ChronoField.NANO_OF_SECOND);
		with(instant, instant.now(Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(8L))));
		truncatedTo(instant, ChronoUnit.NANOS);
		plus(instant, Duration.ofHours(8));
		atOffset(instant, ZoneOffset.ofHours(8));
	}

	/**
	 * isSupported方法测试。
	 */
	private void isSupported(Instant instant, TemporalField field) {
		Objects.requireNonNull(instant, "参数不能为空！");
		System.out.println("isSupported(" + field + ") ：" + instant.isSupported(field));
	}

	/**
	 * isSupported方法测试。<br/>
	 */
	private void isSupported(Instant instant, TemporalUnit field) {
		Objects.requireNonNull(instant, "参数不能为空！");
		System.out.println("isSupported(" + field + ") ：" + instant.isSupported(field));
	}

	/**
	 * {@link Instant}的get方法。<br/>
	 *
	 * @param instant
	 * @param field
	 */
	public void get(Instant instant, TemporalField field) {
		Objects.requireNonNull(instant, "Instant型参数不能为空！");
		int i = instant.get(field);
		System.out.println("instant.get(field): = " + i);
	}

	/**
	 * {@link Instant}的with方法。<br/>
	 *
	 * @param instant
	 * @param adjuster
	 */
	public void with(Instant instant, TemporalAdjuster adjuster) {
		Objects.requireNonNull(instant, "Instant型参数不能为空");
		Instant with = instant.with(adjuster);
		System.out.println("Instant的with(" + adjuster + ") := " + with);
	}

	/**
	 * {@link Instant}的truncatedTo方法。<br/>
	 *
	 * @param instant
	 * @param unit
	 */
	public void truncatedTo(Instant instant, TemporalUnit unit) {
		Objects.requireNonNull(instant, "Instant型参数不能为空");
		Instant with = instant.truncatedTo(unit);
		System.out.println("Instant的truncatedTo(" + unit + ") := " + with);
	}

	public void plus(Instant instant, TemporalAmount amountToAdd) {
		Objects.requireNonNull(instant, "Instant型参数不能为空");
		Instant instantByPlus = instant.plus(amountToAdd);
		System.out.println("Instant的plus(" + amountToAdd + ") := " + instantByPlus);
	}

	/**
	 * {@link Instant}的atOffset方法。<br/>
	 *
	 * @param instant
	 * @param offset
	 */
	public void atOffset(Instant instant, ZoneOffset offset) {
		Objects.requireNonNull(instant, "Instant型参数不能为空");
		OffsetDateTime offsetDateTime = instant.atOffset(offset);
		System.out.println(offsetDateTime);
	}

	/**
	 * {@link Instant}对象的atZone方法测试，可以设置时区，时区的id参见{@link ZoneId}类的map型静态常量SHORT_IDS，
	 * 下面是SHORT_IDS的 Key和 Value
	 * <ul>
	 * <li>EST - -05:00</li>
	 * <li>HST - -10:00</li>
	 * <li>MST - -07:00</li>
	 * <li>ACT - Australia/Darwin</li>
	 * <li>AET - Australia/Sydney</li>
	 * <li>AGT - America/Argentina/Buenos_Aires</li>
	 * <li>ART - Africa/Cairo</li>
	 * <li>AST - America/Anchorage</li>
	 * <li>BET - America/Sao_Paulo</li>
	 * <li>BST - Asia/Dhaka</li>
	 * <li>CAT - Africa/Harare</li>
	 * <li>CNT - America/St_Johns</li>
	 * <li>CST - America/Chicago</li>
	 * <li>CTT - Asia/Shanghai</li>
	 * <li>EAT - Africa/Addis_Ababa</li>
	 * <li>ECT - Europe/Paris</li>
	 * <li>IET - America/Indiana/Indianapolis</li>
	 * <li>IST - Asia/Kolkata</li>
	 * <li>JST - Asia/Tokyo</li>
	 * <li>MIT - Pacific/Apia</li>
	 * <li>NET - Asia/Yerevan</li>
	 * <li>NST - Pacific/Auckland</li>
	 * <li>PLT - Asia/Karachi</li>
	 * <li>PNT - America/Phoenix</li>
	 * <li>PRT - America/Puerto_Rico</li>
	 * <li>PST - America/Los_Angeles</li>
	 * <li>SST - Pacific/Guadalcanal</li>
	 * <li>VST - Asia/Ho_Chi_Minh</li>
	 * </ul>
	 *
	 * @param instant 瞬时值对象
	 */
	private void atZoneDemo(Instant instant) {
		Objects.requireNonNull(instant, "参数不能为空！");
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Shanghai"));
		System.out.println("instant对象的atZoneZoneId.of(\"Asia/Shanghai\")方法： " + zonedDateTime);
	}

	public static void main(String[] args) throws Exception {
		InstantDemo instantDemo = new InstantDemo();
		TestTemplateUtil.execTemplate(instantDemo);
	}
}
