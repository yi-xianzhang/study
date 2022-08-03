package com.yixian.basics.type.wrapper.booleans.asynchronous;

import com.yixian.basics.exception.ExceptionStarter;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link Boolean}类：boolean的包装器类型。
 * ---> {@link java.io.Serializable}抽象类。
 * ----> {@link Comparable<Boolean>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */

@SuppressWarnings("all")
public class BooleanDemo extends AbstractTestTemplate<Boolean> {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(ExceptionStarter.class);
	@Override
	protected void instanceMethodsOfThis() throws Exception {

		// compareTo方法
		LOGGER.info("[" + new Boolean(false) + "].compareTo([" +
				new Boolean(false) + "]): "
			+ new Boolean(false).compareTo(new Boolean(false)));

		LOGGER.info("[" + new Boolean(false) + "].compareTo([" +
				new Boolean(true) + "]): " +
				new Boolean(false).compareTo(new Boolean(true)));

		LOGGER.info("[" + new Boolean(true) + "].compareTo([" +
				new Boolean(false) + "]): " +
				new Boolean(true).compareTo(new Boolean(false)));

		LOGGER.info("[" + new Boolean(true) + "].compareTo([" +
				new Boolean(true) + "]): " +
				new Boolean(true).compareTo(new Boolean(true)));

		// booleanValue
		LOGGER.info("[" + new Boolean(true) + "]" +
				(new Boolean(true).booleanValue()));
		LOGGER.info("[" + new Boolean(false) + "]" +
				(new Boolean(false).booleanValue()));

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		LOGGER.info("Boolean.toString(" + false + "):" +
				Boolean.toString(false));
		LOGGER.info("Boolean.toString(" + true + "):" +
				Boolean.toString(true));

		LOGGER.info("Boolean.valueOf(" + "false" + "):" +
				Boolean.valueOf("false"));
		LOGGER.info("Boolean.valueOf(" + "true" + "):" +
				Boolean.valueOf("true"));
		LOGGER.info("Boolean.valueOf(" + null + "):" +
				Boolean.valueOf(null));
		LOGGER.info("Boolean.valueOf(" + "" + "):" +
				Boolean.valueOf(""));

		LOGGER.info("Boolean.valueOf(" + false + "):" +
				Boolean.valueOf(false));
		LOGGER.info("Boolean.valueOf(" + true + "):" +
				Boolean.valueOf(true));

		// 此方法获取的是java的JVM参数，传递的String为key
		LOGGER.info("Boolean.getBoolean(false) : " +
				Boolean.getBoolean("false"));
		LOGGER.info("Boolean.getBoolean(null) : " +
				Boolean.getBoolean(null));
		LOGGER.info("Boolean.getBoolean(true) : " +
				Boolean.getBoolean("true"));

		// 将String型转换成boolean型
		LOGGER.info("Boolean.parseBoolean(" + "false" + "):" +
				Boolean.parseBoolean("false"));
		LOGGER.info("Boolean.parseBoolean(" + "true" + "):" +
				Boolean.parseBoolean("true"));
		LOGGER.info("Boolean.parseBoolean(" + null + "):" +
				Boolean.parseBoolean(null));
		LOGGER.info("Boolean.parseBoolean(" + "" + "):" +
				Boolean.parseBoolean(""));

		// 测试Boolean型变量使用== 比较的
		LOGGER.info(Boolean.valueOf(true) + "和" +
				Boolean.valueOf(true) +"使用==比较 ：" +
				(Boolean.valueOf(true) == Boolean.valueOf(true)));

		LOGGER.info(Boolean.valueOf(false) + "和" + Boolean.valueOf(true) +
			"使用==比较 ：" + (Boolean.valueOf(false) == Boolean.valueOf(true)));

		LOGGER.info(Boolean.valueOf(false) + "和" + Boolean.valueOf(false) +
			"使用==比较 ：" + (Boolean.valueOf(false) == Boolean.valueOf(false)));

		// compare方法比较
		LOGGER.info("Boolean.compare(false,false):" +
				Boolean.compare(false, false));
		LOGGER.info("Boolean.compare(false,true):" +
				Boolean.compare(false, true));
		LOGGER.info("Boolean.compare(true,false):" +
				Boolean.compare(true, false));
		LOGGER.info("Boolean.compare(true,true):" +
				Boolean.compare(true, true));

		// 逻辑与运算
		LOGGER.info("Boolean.logicalAnd(false,false):" +
				Boolean.logicalAnd(false, false));
		LOGGER.info("Boolean.logicalAnd(false,true):" +
				Boolean.logicalAnd(false, true));
		LOGGER.info("Boolean.logicalAnd(true,true):" +
				Boolean.logicalAnd(true, true));

		// 逻辑或运算
		LOGGER.info("Boolean.logicalOr(false,false):" +
				Boolean.logicalOr(false, false));
		LOGGER.info("Boolean.logicalOr(false,true):" +
				Boolean.logicalOr(false, true));
		LOGGER.info("Boolean.logicalOr(true,true):" +
				Boolean.logicalOr(true, true));

		// 异或运算，不同为真，相同为假
		LOGGER.info("Boolean.logicalXor(false,false):" +
				Boolean.logicalXor(false, false));
		LOGGER.info("Boolean.logicalXor(false,true):" +
				Boolean.logicalXor(false, true));
		LOGGER.info("Boolean.logicalXor(true,true):" +
				Boolean.logicalXor(true, true));

		LOGGER.info("Boolean.TYPE (" + Boolean.TYPE + "):" +
				Boolean.TYPE);
	}

	@Override
	protected void constructorsOfThis() {

		LOGGER.info("new Boolean([boolean型]" + true + "):" +
				new Boolean(true));
		LOGGER.info("new Boolean([boolean型]" + false + "):" +
				new Boolean(false));
		LOGGER.info("new Boolean([String型] true ):" + new Boolean("true"));
		LOGGER.info("new Boolean([String型] false ):" + new Boolean("false"));
		LOGGER.info("new Boolean([String型] null ):" + new Boolean(null));
		LOGGER.info("new Boolean([String型] '' ):" + new Boolean(""));
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new BooleanDemo());
	}
}