package com.yixian.util.test;

import com.yixian.util.StringUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestTemplateUtil<T> implements TestTemplateType {

	public static final void execTemplate(TestTemplate testTemplate) throws Exception {
		if (testTemplate == null)
			throw new NullPointerException("testTemplate can not null !!");
		testTemplate.testExec();
	}

	private static void methods(Class tClass, String methodType)
		throws IllegalAccessException, InstantiationException {

		if (tClass == null)
			throw new NullPointerException("类型不能为空");

		if (StringUtils.isEmpty(methodType))
			throw new NullPointerException("methodType 不能为空");

		final Method[] methods = tClass.getMethods();

		List<Method> methods1 = new ArrayList<>();
		for (Method method : methods) {
			if (method == null) {
				continue;
			}
			if (StringUtils.isEmpty(method.toString()))
				continue;

			if (StringUtils.isEmpty(method.toString().trim()))
				continue;

			if (!method.toString().contains(methodType))
				continue;
			methods1.add(method);
		}

		if (methods1.size() == 0) {
			System.out.println(tClass.getClass() + ":" + "没有静态方法");
			return;
		}

		for (Method method : methods1) {
			System.out.println(tClass.getClass() + ":" + method.toString());
		}
	}

	public static final void staticMethods(Class tClass) throws InstantiationException, IllegalAccessException {
		methods(tClass, STATIC_METHOD);
	}

	public static final void nativeMethods(Class tClass)
		throws InstantiationException, IllegalAccessException {

		methods(tClass, NATIVE_METHOD);
	}

	public static final void synchronizedMethods(Class tClass)
		throws InstantiationException, IllegalAccessException {

		methods(tClass, SYNCHRONIZED_METHOD);
	}


}
