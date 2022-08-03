package com.yixian.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * 工具类
 */
public class ObjectUtils {

	/**
	 * 判断参数是否为空，{@link String}会判断是否为空
	 * {@link Collection}的容量是否为空
	 * {@link Map}的容量是否为空
	 * 数组容量是否为空
	 *
	 * @param obj 参数
	 * @return {@link Boolean}
	 */
	public static boolean isBlankOrEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof CharSequence)
			return StringUtils.isBlank(obj.toString());
		else if (obj instanceof Collection)
			return ((Collection) obj).isEmpty();
		else if (obj instanceof Map)
			return ((Map) obj).isEmpty();
		else if (obj.getClass().isArray())
			return Arrays.asList(obj).isEmpty();
		return false;
	}

	/**
	 * 判断参数是否非空，{@link String}会判断是否非空
	 * {@link Collection}的容量是否非空
	 * {@link Map}的容量是否非空
	 * 数组容量是否非空
	 *
	 * @param obj 参数
	 * @return {@link Boolean}
	 */
	public static boolean isNotBlankAndEmpty(Object obj) {
		return !isBlankOrEmpty(obj);
	}

	/**
	 * @param obj 参数
	 * @param <T>
	 * @return <T>
	 * @throws IllegalAccessException,InstantiationException
	 */
	public static <T> T mergeObject(T obj) throws IllegalAccessException,
		InstantiationException {

		Objects.requireNonNull(obj, "");

		// 获取原来的数据的类型
		Class<T> tClass = (Class<T>) obj.getClass();
		// 生成对象
		T t = tClass.newInstance();
		// 取得全部的成员属性
		Field[] declaredFields = tClass.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			// 设置目标数组的值
			field.set(t, field.get(obj));
		}
		return t;
	}


}
