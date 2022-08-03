package com.yixian.basics.type.numbers.integering.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link Byte}类：byte的包装器类型。
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<Byte>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
public class ByteDemo extends AbstractTestTemplate<Byte> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Byte aByte = new Byte((byte) 123);

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		// 将对应的进制码转换成10进制，两个参数，第一个为进制吗，第二个参数为进制数
		System.out.println("Byte.parseByte(\"112\",10)：" + Byte.parseByte("112", 10));
		System.out.println("Byte.parseByte(\"110\",2)：" + Byte.parseByte("110", 2));
		System.out.println("Byte.parseByte(\"112\",4)：" + Byte.parseByte("112", 4));
		System.out.println("Byte.parseByte(\"112\",8)：" + Byte.parseByte("112", 8));
		System.out.println("Byte.parseByte(\"11\",16)：" + Byte.parseByte("11", 16));
		System.out.println("Byte.parseByte(\"11\")：" + Byte.parseByte("11"));

		System.out.println("Byte.valueOf([String]123) ：" + Byte.valueOf("123"));
		System.out.println("Byte.valueOf([byte]123) ：" + Byte.valueOf((byte) 123));

		System.out.println("Byte.valueOf(\"112\",10)：" + Byte.valueOf("112", 10));
		System.out.println("Byte.valueOf(\"110\",2)：" + Byte.valueOf("110", 2));
		System.out.println("Byte.valueOf(\"112\",4)：" + Byte.valueOf("112", 4));
		System.out.println("Byte.valueOf(\"112\",8)：" + Byte.valueOf("112", 8));
		System.out.println("Byte.valueOf(\"11\",16)：" + Byte.valueOf("11", 16));
		System.out.println("Byte.valueOf(\"11\")：" + Byte.valueOf("11"));


		System.out.println("Byte.valueOf(12, 12)：" + Byte.compare((byte) 12, (byte) 12));
		System.out.println("Byte.valueOf(13, 12)：" + Byte.compare((byte) 13, (byte) 12));
		System.out.println("Byte.valueOf(12, 13)：" + Byte.compare((byte) 12, (byte) 13));

		System.out.println("Byte.toString((byte) 12):" + Byte.toString((byte) 12));

		System.out.println("Byte.decode(\"123\"):" + Byte.decode("123"));

		System.out.println("Byte.toUnsignedInt((byte) -12):" + Byte.toUnsignedInt((byte) -12));
		System.out.println("Byte.toUnsignedInt((byte) 12):" + Byte.toUnsignedInt((byte) 12));


		System.out.println("Byte.toUnsignedLong((byte) -12):" + Byte.toUnsignedLong((byte) -12));
		System.out.println("Byte.toUnsignedLong((byte) 12):" + Byte.toUnsignedLong((byte) 12));

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