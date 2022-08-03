package com.yixian.basics.type.date.util;

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public interface JDK8OfDateOfAttributesUtil {

	public static final ChronoField[] CHRONO_FIELDS = {
		ChronoField.NANO_OF_SECOND,
		ChronoField.NANO_OF_DAY,
		ChronoField.MICRO_OF_SECOND,
		ChronoField.MICRO_OF_DAY,
		ChronoField.MILLI_OF_SECOND,
		ChronoField.MILLI_OF_DAY,
		ChronoField.SECOND_OF_MINUTE,
		ChronoField.SECOND_OF_DAY,
		ChronoField.MINUTE_OF_HOUR,
		ChronoField.MINUTE_OF_DAY,
		ChronoField.HOUR_OF_AMPM,
		ChronoField.CLOCK_HOUR_OF_AMPM,
		ChronoField.HOUR_OF_DAY,
		ChronoField.CLOCK_HOUR_OF_DAY,
		ChronoField.AMPM_OF_DAY,
		ChronoField.DAY_OF_WEEK,
		ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH,
		ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR,
		ChronoField.DAY_OF_MONTH,
		ChronoField.DAY_OF_YEAR,
		ChronoField.EPOCH_DAY,
		ChronoField.ALIGNED_WEEK_OF_MONTH,
		ChronoField.ALIGNED_WEEK_OF_YEAR,
		ChronoField.MONTH_OF_YEAR,
		ChronoField.PROLEPTIC_MONTH,
		ChronoField.YEAR_OF_ERA,
		ChronoField.YEAR,
		ChronoField.ERA,
		ChronoField.INSTANT_SECONDS,
		ChronoField.OFFSET_SECONDS
	};

	public static final ChronoUnit[] CHRONO_UNITS = {
		ChronoUnit.NANOS,
		ChronoUnit.MICROS,
		ChronoUnit.MILLIS,
		ChronoUnit.SECONDS,
		ChronoUnit.MINUTES,
		ChronoUnit.HOURS,
		ChronoUnit.HALF_DAYS,
		ChronoUnit.DAYS,
		ChronoUnit.WEEKS,
		ChronoUnit.MONTHS,
		ChronoUnit.YEARS,
		ChronoUnit.DECADES,
		ChronoUnit.CENTURIES,
		ChronoUnit.MILLENNIA,
		ChronoUnit.ERAS,
		ChronoUnit.FOREVER
	};
}
