package com.yixian.basics.type.wrapper.numbers.integering.asynchronous;

import com.yixian.basics.exception.ExceptionStarter;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link Byte}类：byte的包装器类型。
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<Byte>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */

@SuppressWarnings("all")
public class ByteDemo extends AbstractTestTemplate<Byte> {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(ExceptionStarter.class); 

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Byte aByte = new Byte((byte) 123);

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		// 将对应的进制码转换成10进制，两个参数，第一个为进制吗，第二个参数为进制数
		LOGGER.info("Byte.parseByte(\"112\",10)：" +
				Byte.parseByte("112", 10));
		LOGGER.info("Byte.parseByte(\"110\",2)：" +
				Byte.parseByte("110", 2));
		LOGGER.info("Byte.parseByte(\"112\",4)：" +
				Byte.parseByte("112", 4));
		LOGGER.info("Byte.parseByte(\"112\",8)：" +
				Byte.parseByte("112", 8));
		LOGGER.info("Byte.parseByte(\"11\",16)：" +
				Byte.parseByte("11", 16));
		LOGGER.info("Byte.parseByte(\"11\")：" +
				Byte.parseByte("11"));

		LOGGER.info("Byte.valueOf([String]123) ：" +
				Byte.valueOf("123"));
		LOGGER.info("Byte.valueOf([byte]123) ：" +
				Byte.valueOf((byte) 123));

		LOGGER.info("Byte.valueOf(\"112\",10)：" +
				Byte.valueOf("112", 10));
		LOGGER.info("Byte.valueOf(\"110\",2)：" +
				Byte.valueOf("110", 2));
		LOGGER.info("Byte.valueOf(\"112\",4)：" +
				Byte.valueOf("112", 4));
		LOGGER.info("Byte.valueOf(\"112\",8)：" +
				Byte.valueOf("112", 8));
		LOGGER.info("Byte.valueOf(\"11\",16)：" +
				Byte.valueOf("11", 16));
		LOGGER.info("Byte.valueOf(\"11\")：" +
				Byte.valueOf("11"));


		LOGGER.info("Byte.valueOf(12, 12)：" +
				Byte.compare((byte) 12, (byte) 12));
		LOGGER.info("Byte.valueOf(13, 12)：" +
				Byte.compare((byte) 13, (byte) 12));
		LOGGER.info("Byte.valueOf(12, 13)：" +
				Byte.compare((byte) 12, (byte) 13));

		LOGGER.info("Byte.toString((byte) 12):" +
				Byte.toString((byte) 12));

		LOGGER.info("Byte.decode(\"123\"):" +
				Byte.decode("123"));

		LOGGER.info("Byte.toUnsignedInt((byte) -12):" +
				Byte.toUnsignedInt((byte) -12));
		LOGGER.info("Byte.toUnsignedInt((byte) 12):" +
				Byte.toUnsignedInt((byte) 12));


		LOGGER.info("Byte.toUnsignedLong((byte) -12):" +
				Byte.toUnsignedLong((byte) -12));
		LOGGER.info("Byte.toUnsignedLong((byte) 12):" +
				Byte.toUnsignedLong((byte) 12));

	}

	@Override
	protected void constructorsOfThis() {
		Byte aByte = new Byte((byte) 12);
		aByte = new Byte("12");

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new ByteDemo());
	}
}