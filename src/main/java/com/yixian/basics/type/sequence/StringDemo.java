package com.yixian.basics.type.sequence;

import com.yixian.util.test.TestTemplate;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link String}的静态方法和成员方法测试。<br/>
 * {@link String}内部维护了一个不可变的char型数组。<br/>
 */
public class StringDemo extends AbstractTestTemplate<String> implements TestTemplate {

	@Override
	protected void instanceMethodsOfThis() {

	}

	@Override
	protected void staticMethodsOfThis() {

	}

	@Override
	public void constructorsOfThis() {

		String str = "ConstrTest";

		//
		constrouctorsOfThis(str, false);

		//
		constrouctorsOfThis(str, true);

		char[] strings = {'a', 'b', 'c'};

		//
		System.out.println(new String(strings));

		//
		System.out.println(new String(strings, 1, 2));

		int[] ints = {65, 66, 67};

		System.out.println(new String(ints, 1, 2));

		//
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("stringBuffer");
		System.out.println(new String(stringBuffer));

		//
		StringBuilder stringBuilder = new StringBuilder();
		stringBuffer.append("stringBuffer");
		System.out.println(new String(stringBuilder));

	}

	public void constrouctorsOfThis(String str, boolean constrParamFlag) {

		if (constrParamFlag == false) {
			// 无参构造器
			System.out.println("-------START--------------无参构造器---------------------");
			String name = new String();
			if (name != null && "".equals(name)) {
				System.out.println("new String() 的结果为长度为0的空字符串");
			} else {
				System.out.println("new String() 的结果" + name);
			}
			System.out.println("--------END---------------String型参数构造器---------------------");
		} else {
			// 无参构造器
			System.out.println("-------START--------------String型参数构造器---------------------");
			String name = new String(str);
			if (name != null && "".equals(name)) {
				System.out.println("new String() 的结果为长度为0的空字符串");
			} else {
				System.out.println(name == str);
				System.out.println(name);
			}
			System.out.println("--------END---------------无参构造器---------------------");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new StringDemo());
	}
}
