package com.yixian.basics.type.sequence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * {@link String}的静态方法和成员方法测试。<br/>
 * {@link String}内部维护了一个不可变的char型数组。<br/>
 * ---> {@link java.io.Serializable}说明String可以在网络传输等。
 * ---> {@link Comparable}说明String可以比较。
 * 1 JDK1.8 使用Unicode字符编码，一个字符占2个字节。
 * 2 实现构造器的重载。
 * 3 是final类，不能被继承。
 * 4 底层维护了一个char型数组，用来保存字符串。并使用final修饰，则value指向的地址值不可修改。
 * 5 创建{@link String}对象的2中方式：
 * 方式1：直接赋值：类似基本类型，字符串字面量的方式，{@code  String src = "111";}
 * 先在常量池中查找，若存在，直接指向常量池的与该字符串相等的值的地址，否则，创建，然后指向，
 * 最终的变量指向地址为常量池的空间地址。
 * 方式2 ：构造器
 * 先在堆区创建空间，维护value属性指向常量池的地址，若有，直接value指向，否则，重新创建，
 * 通过value指向，最终指向堆区空间地址。
 * 6 方法学习，参见{@link StringTest#nonStaticMethodOfStringTest()}和
 * {@link StringTest#staticMethodOfStringTest()}
 */
@SuppressWarnings("all")
public class StringTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringTest.class);

    /**
     * {@link String}构造器的测试。
     *
     * @param str             字符串
     * @param constrParamFlag
     */
    public void constructorsOfThis(String str, boolean constrParamFlag) {
        if (!constrParamFlag) {
            // 无参构造器
            LOGGER.info("-------START--------------无参构造器-------------");
            String name = new String();
            if ("".equals(name)) {
                LOGGER.info("new String() 的结果为长度为0的空字符串");
            } else {
                LOGGER.info("new String() 的结果" + name);
            }
            LOGGER.info("--------END------String型参数构造器------");
            return;
        }
        // 有参构造器
        LOGGER.info("-------START------String型参数构造器------");
        String name = new String(str);
        if (name != null && "".equals(name)) {
            LOGGER.info("new String() 的结果为长度为0的空字符串");
        } else {
            LOGGER.info(String.valueOf(name == str));
            LOGGER.info(name);
        }
        LOGGER.info("--------END---------------无参构造器--------------");
    }

    @Test
    public void constructorsOfThis() {
        String str = "ConstrTest";
        constructorsOfThis(str, false);
        constructorsOfThis(str, true);
        char[] strings = {'a', 'b', 'c'};
        LOGGER.info(new String(strings));
        LOGGER.info(new String(strings, 1, 2));
        int[] ints = {65, 66, 67};
        LOGGER.info(new String(ints, 1, 2));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("stringBuffer");
        LOGGER.info(new String(stringBuffer));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuffer.append("stringBuffer");
        LOGGER.info(new String(stringBuilder));
    }

    /**
     * {@link String} 的 + 号的实质，debugger
     * <p>
     * 实质是使用无参构造方法创建了一个{@link StringBuilder}对象，每次 + 都调用
     * {@link StringBuilder#append(String)}方法， + 执行完毕后，在调用
     * {@link StringBuilder#toString()}方法。
     */
    public static void main(String[] args) {
        String str = "abc";
        String abc = "hello";
        String finalStr = str + abc;
        System.out.println(finalStr);
    }


    //   -------------------- more static methods of String --------------------

    /**
     * {@link String}静态成员方法以外的方法学习
     */

    @Test
    public void staticMethodOfStringTest() {
        formatOfString();
    }

    /**
     * {@link String#format(String, Object...)}
     * {@link String#format(Locale, String, Object...)}
     */
    public void formatOfString() {
        String strTemplate = "伟哥%s是个%d";
        LOGGER.info("String.format(strTemplate,\"123\",345) = " +
                String.format(strTemplate, "123", 345));

        Locale locale = new Locale("chinese", "china", "1");
        LOGGER.info("String.format(" + locale.toString() + ",strTemplate,\"123\"," +
                "345) " + "= " +
                String.format(locale, strTemplate, "123", 345));
    }

    // ------------------- more static not methods of String -------------------

    /**
     * {@link String}非静态成员方法以外的方法学习
     */
    @Test
    public void nonStaticMethodOfStringTest() {
        internOfString();
        equalsIgnoreCaseOfString();

    }

    /**
     * {@link String#intern()}具体含义参见源码注释
     * 返回常量池的地址。
     */
    @Test
    public void internOfString() {
        String name = "zyx";
        String name2 = new String("zyx");
        LOGGER.info("name2[" + name2 + "].intern():=" + name2.intern());
        LOGGER.info("name2[" + name2 + "] == name := " +
                String.valueOf(name2.intern() == name));
    }

    /**
     * {@link String#equals()}比较内容是否相同，不忽略大小写
     */
    @Test
    public void equalsOfString() {
        // 字符串常量或字面量
        String s = "123";
        String str = new String("123");
        LOGGER.info("s[" + s + "].equals(str[" + str + "]) := " +
                String.valueOf(s.equals(str)));
        LOGGER.info("s[" + s + "] == str[" + str + "] : = " +
                String.valueOf(s == str));
        LOGGER.info("s[" + s + "] == str[" + str + "].intern() := " +
                String.valueOf(s == str.intern()));
        LOGGER.info("str[" + s + "] == str[" + str + "].intern() := " +
                String.valueOf(str == str.intern()));
        String str1 = String.valueOf(123);
        String str2 = String.valueOf(123);
        LOGGER.info("str1[" + 127 + "] == str2[" + str2 + "] : = " +
                String.valueOf(str1 == str2));
    }

    /**
     * {@link String#equals()}比较内容是否相同，忽略大小写
     */
    @Test
    public void equalsIgnoreCaseOfString() {
        LOGGER.info("\"abd\".equalsIgnoreCase(\"ABD\") := " +
                String.valueOf("abd".equalsIgnoreCase("ABD")));
    }

    /**
     * {@link String#concat(String)}字符串拼接
     */
    @Test
    public void concatOfString() {
        System.out.println("111".concat("222"));
    }
}