package com.yixian.basics.type.wrapper.numbers.integering.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;
import org.junit.Test;

/**
 * {@link Integer}类：byte的包装器类型。
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<Integer>}类，用来比较大小。
 * @author Administrator
 * @since 1.1
 */
@SuppressWarnings("all")
public class IntegerDemo extends AbstractTestTemplate<Integer> {

    /**
     * {@link Integer}类的静态方法{@link Integer#toString(int, int)}测试。</br>
     * {@link Integer#digits}数组相关联。
     *
     * @param i
     * @param radix
     * @return
     */
    private void toString(int i, int radix) {
        System.out.println(Integer.class.getTypeName() + "的静态方法 toString (" +
                i + "," + radix + " ) := "
                + Integer.toString(i, radix));
    }

    /**
     * {@link Integer}类的静态方法{@link Integer#toUnsignedString(int, int)}测试。
     * </br>
     * {@link Integer#digits}数组相关联。
     * 实际源码参见{@link Long#toUnsignedString(long, int)}
     *
     * @param i
     * @param radix
     * @return
     */
    private void toUnsignedString(int i, int radix) {
        System.out.println(Integer.class.getTypeName() +
                "的静态方法 toUnsignedString (" + i + "," + radix + " ) := "
                + Integer.toUnsignedString(i, radix));
    }


    /**
     * {@link Integer}类的静态方法{@link Integer#toBinaryString(int)},
     * {@link Integer#toOctalString(int)},
     * {@link Integer#toHexString(int)}测试。</br>
     * {@link Integer#digits}数组相关联。
     * 实际源码参见{@link Integer#toUnsignedString0(int, int)}
     *
     * @param i
     * @param radix
     * @return
     */
    private void toRadixString(int i, int radix) {
        String value = "";
        String methods = "";
        switch (radix) {
            case 2:
                value = Integer.toBinaryString(i);
                methods = "toBinaryString";
                break;
            case 8:
                value = Integer.toOctalString(i);
                methods = "toOctalString";
                break;
            case 16:
                value = Integer.toHexString(i);
                methods = "toHexString";
                break;
            default:
        }
        System.out.println(Integer.class.getTypeName() + "的静态方法 " + methods +
                " (" + i + " ) := "
                + value);
    }

    /**
     * {@link Integer}类的静态方法{@link Integer#numberOfLeadingZeros(int)}
     *
     * @param value
     * @return
     */
    private void numberOfLeadingZeros(int value) {
        System.out.println(Integer.class.getTypeName() +
                "的静态方法 toUnsignedString (" + value + " ) := "
                + Integer.numberOfLeadingZeros(value));
    }


    @Override
    protected void staticMethodsOfThis() throws Exception {

        /**
         * ---------------------------{@link Integer#toString(int, int)}-----
         */
        toString(8, 2);
        toString(-8, 2);

        /**
         * -----------------{@link Integer#toUnsignedString(int, int)}----------
         */
        toUnsignedString(Integer.MAX_VALUE, 16);
        toUnsignedString(Integer.MIN_VALUE, 16);
        toUnsignedString(Integer.MAX_VALUE, 8);
        toUnsignedString(Integer.MIN_VALUE, 8);
        toUnsignedString(Integer.MAX_VALUE, 2);
        toUnsignedString(Integer.MIN_VALUE, 2);

        /**
         * ----------{@link Integer#toUnsignedString0(int, int)}----------------
         */
        toRadixString(Integer.MAX_VALUE, 16);
        toRadixString(Integer.MIN_VALUE, 16);
        toRadixString(Integer.MAX_VALUE, 8);
        toRadixString(Integer.MIN_VALUE, 8);
        toRadixString(Integer.MAX_VALUE, 2);
        toRadixString(Integer.MIN_VALUE, 2);

        //--------------------@link Integer#numberOfLeadingZeros(int)}-----
        for (int i = 12; i >= -12; i--) {
            numberOfLeadingZeros(i);
        }

    }


    @Override
    protected void instanceMethodsOfThis() throws Exception {

    }

    @Override
    protected void constructorsOfThis() {

    }

    public static void main(String[] args) throws Exception {
        TestTemplateUtil.execTemplate(new IntegerDemo());
        System.out.println(new Integer(1) == new Integer(1));
    }

    @Test
    public void test() {

        Integer num1 = Integer.valueOf(1);
        Integer num1Temp = Integer.valueOf(1);
        System.out.println("Integer.valueOf(1) 的==比较:" + (num1 == num1Temp));

        num1 = new Integer(1);
        num1Temp = new Integer(1);
        System.out.println("new Integer(1) 的==比较:" + (num1 == num1Temp));

    }

    /**
     * 包装器如果使用 >= > < <= 会自动拆箱。
     */
    @Test
    public void opter() {
        Integer num = Integer.valueOf(654);
        Integer num2 = Integer.valueOf(456);
        System.out.println(num > num2);
        System.out.println(num | num2);
        System.out.println(num & num2);

        Integer num4 = 34;
        int num5 = num4;
    }

    @Test
    public void binOpter() {
        System.out.println(Integer.reverse(0x12345678));
    }


}
