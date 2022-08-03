package com.yixian.basics.type.numbers.math;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MathDemo extends AbstractTestTemplate<Math> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {

	}

	@Override
	protected void constructorsOfThis() {
		boolean b = super.constructorsFlag(Math.class);
		if (!b) {
			System.out.println(Math.class.getName() + "类无公共的构造方法！！");
		} else {
			Math math = null;
			try {
				math = Math.class.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			System.out.println(Math.class.getName() + "类的无参构造方法" + math.toString());
		}
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new MathDemo());
	}


	private boolean getInstanceMethodsFlag(Class tClass) {
		Type genericSuperclass = tClass.getGenericSuperclass();
		genericSuperclass.getClass().getGenericSuperclass();
		return false;
	}

	private List<Class> getAllGenericSuperclass(Class tClass) {
		return new ArrayList<>();
	}
}
