package com.yixian.basics.type.numbers.booleans.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link Boolean}类：boolean的包装器类型。
 * ---> {@link java.io.Serializable}抽象类。
 * ----> {@link Comparable<Boolean>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
public class BooleanDemo extends AbstractTestTemplate<Boolean> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {

		// compareTo方法
		System.out.println("[" + new Boolean(false) + "].compareTo([" + new Boolean(false) + "]): "
			+ new Boolean(false).compareTo(new Boolean(false)));

		System.out.println("[" + new Boolean(false) + "].compareTo([" + new Boolean(true) + "]): "
			+ new Boolean(false).compareTo(new Boolean(true)));

		System.out.println("[" + new Boolean(true) + "].compareTo([" + new Boolean(false) + "]): "
			+ new Boolean(true).compareTo(new Boolean(false)));

		System.out.println("[" + new Boolean(true) + "].compareTo([" + new Boolean(true) + "]): "
			+ new Boolean(true).compareTo(new Boolean(true)));

		// booleanValue
		System.out.println("[" + new Boolean(true) + "]" + (new Boolean(true).booleanValue()));
		System.out.println("[" + new Boolean(false) + "]" + (new Boolean(false).booleanValue()));

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println("Boolean.toString(" + false + "):" + Boolean.toString(false));
		System.out.println("Boolean.toString(" + true + "):" + Boolean.toString(true));

		System.out.println("Boolean.valueOf(" + "false" + "):" + Boolean.valueOf("false"));
		System.out.println("Boolean.valueOf(" + "true" + "):" + Boolean.valueOf("true"));
		System.out.println("Boolean.valueOf(" + null + "):" + Boolean.valueOf(null));
		System.out.println("Boolean.valueOf(" + "" + "):" + Boolean.valueOf(""));

		System.out.println("Boolean.valueOf(" + false + "):" + Boolean.valueOf(false));
		System.out.println("Boolean.valueOf(" + true + "):" + Boolean.valueOf(true));

		// 此方法获取的是java的JVM参数，传递的String为key
		System.out.println("Boolean.getBoolean(false) : " + Boolean.getBoolean("false"));
		System.out.println("Boolean.getBoolean(null) : " + Boolean.getBoolean(null));
		System.out.println("Boolean.getBoolean(true) : " + Boolean.getBoolean("true"));

		// 将String型转换成boolean型
		System.out.println("Boolean.parseBoolean(" + "false" + "):" + Boolean.parseBoolean("false"));
		System.out.println("Boolean.parseBoolean(" + "true" + "):" + Boolean.parseBoolean("true"));
		System.out.println("Boolean.parseBoolean(" + null + "):" + Boolean.parseBoolean(null));
		System.out.println("Boolean.parseBoolean(" + "" + "):" + Boolean.parseBoolean(""));

		// 测试Boolean型变量使用== 比较的
		System.out.println(Boolean.valueOf(true) + "和" + Boolean.valueOf(true) +
			"使用==比较 ：" + (Boolean.valueOf(true) == Boolean.valueOf(true)));

		System.out.println(Boolean.valueOf(false) + "和" + Boolean.valueOf(true) +
			"使用==比较 ：" + (Boolean.valueOf(false) == Boolean.valueOf(true)));

		System.out.println(Boolean.valueOf(false) + "和" + Boolean.valueOf(false) +
			"使用==比较 ：" + (Boolean.valueOf(false) == Boolean.valueOf(false)));

		// compare方法比较
		System.out.println("Boolean.compare(false,false):" + Boolean.compare(false, false));
		System.out.println("Boolean.compare(false,true):" + Boolean.compare(false, true));
		System.out.println("Boolean.compare(true,false):" + Boolean.compare(true, false));
		System.out.println("Boolean.compare(true,true):" + Boolean.compare(true, true));

		// 逻辑与运算
		System.out.println("Boolean.logicalAnd(false,false):" + Boolean.logicalAnd(false, false));
		System.out.println("Boolean.logicalAnd(false,true):" + Boolean.logicalAnd(false, true));
		System.out.println("Boolean.logicalAnd(true,true):" + Boolean.logicalAnd(true, true));

		// 逻辑或运算
		System.out.println("Boolean.logicalOr(false,false):" + Boolean.logicalOr(false, false));
		System.out.println("Boolean.logicalOr(false,true):" + Boolean.logicalOr(false, true));
		System.out.println("Boolean.logicalOr(true,true):" + Boolean.logicalOr(true, true));

		// 异或运算，不同为真，相同为假
		System.out.println("Boolean.logicalXor(false,false):" + Boolean.logicalXor(false, false));
		System.out.println("Boolean.logicalXor(false,true):" + Boolean.logicalXor(false, true));
		System.out.println("Boolean.logicalXor(true,true):" + Boolean.logicalXor(true, true));

		System.out.println("Boolean.TYPE (" + Boolean.TYPE + "):" + Boolean.TYPE);
	}

	@Override
	protected void constructorsOfThis() {

		System.out.println("new Boolean([boolean型]" + true + "):" + new Boolean(true));
		System.out.println("new Boolean([boolean型]" + false + "):" + new Boolean(false));

		System.out.println("new Boolean([String型] true ):" + new Boolean("true"));
		System.out.println("new Boolean([String型] false ):" + new Boolean("false"));
		System.out.println("new Boolean([String型] null ):" + new Boolean(null));
		System.out.println("new Boolean([String型] '' ):" + new Boolean(""));

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new BooleanDemo());
	}
}