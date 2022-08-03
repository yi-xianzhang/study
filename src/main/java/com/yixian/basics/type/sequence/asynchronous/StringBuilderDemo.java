package com.yixian.basics.type.sequence.asynchronous;

import com.yixian.basics.type.sequence.StringTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * {@link StringBuilder}表示可变的字符序列，可以对字符增删，同时是一个容器。
 * ---> {@link java.io.Serializable}表示可以保存到文件、网络传输等。
 * ---> {@link CharSequence}  表示字符序列
 * ———> {@link AbstractStringBuilder}
 * |———> {@link Object}
 * |---> {@link CharSequence}   表示字符序列
 * |---> {@link Appendable}     表示可以追加
 * <p>
 * 1 与{@link StringBuffer}兼容。但不保证线程安全，用在字符串缓冲区被单个线程使用的时候，
 * 速度快于{@link StringBuffer}
 * 2 继承体系图与{@link StringBuffer}完全一致。
 * 3 在直接父类{@link AbstractStringBuilder}中定义默认容量为16的char[]属性value，
 * 存放字符串内容，与{@link StringBuffer}完全一致。
 * <p>
 * 4 使用final修饰，不能被继承。
 */

@SuppressWarnings("all")
public class StringBuilderDemo {

    public static final Logger LOGGER = LoggerFactory.getLogger(StringTest.class);

    /**
     * {@link StringBuilder}的静态方法。
     */
    @Test
    public void staticMethodsOfThis() {
        Method[] methods = StringBuilder.class.getMethods();
        boolean staticFlag = false;
        for (Method method : methods) {
            if (method.getName().contains("static")) {
                staticFlag = true;
                break;
            }
        }
        if (!staticFlag) {
            LOGGER.info(StringBuilder.class.getName() + "； 无静态方法");
        } else {
            LOGGER.info(StringBuilder.class.getName() + "； 存在静态方法");
        }
    }

    /**
     * {@link StringBuffer}的不同构造器初始化容量大小。<br/>
     */
    @Test
    public void constructorsOfThis() {

        LOGGER.info("-------------StringBuilder无型参数构造器初始化-------------");
        // 初始化了一个长度为16的char[],每次扩容成原来的2倍 + 2
        StringBuilder stringBuffer = new StringBuilder();
        LOGGER.info("StringBuilder默认构造器方法初始化后，容器的容量：" +
                stringBuffer.capacity());
        LOGGER.info("StringBuilder默认构造器方法初始化后，数组的有值元素的个数：" +
                stringBuffer.length());
        stringBuffer.append((char) 90);
        LOGGER.info("StringBuilder默认构造器方法初始化后，添加一个int型90的容量："
                + stringBuffer.capacity());
        LOGGER.info("StringBuilder默认构造器方法初始化后，添加一个int型90的容量，" +
                "数组的有值元素的个数：" + stringBuffer.length());
        LOGGER.info("-------------再添加15个元素-------------");
        for (int index = 1; index <= 15; index++)
            stringBuffer.append((char) 90);
        LOGGER.info("再添加15个元素的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加15个元素，数组的有值元素的个数：" + stringBuffer.length());
        LOGGER.info("---char型数组需要扩容-----");
        stringBuffer.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" +
                stringBuffer.length());
        LOGGER.info("--------------String型参数(123)构造器初始化--------------");
        // 初始化了一个长度为(String型参数长度+16)的char[],每次扩容成原来的2倍 + 2
        stringBuffer = new StringBuilder("123");
        LOGGER.info("StringBuilder默认构造器方法初始化后，添加一个String型123的容量：" +
                stringBuffer.capacity());
        LOGGER.info("StringBuilder默认构造器方法初始化后，添加一个String型123的容量，" +
                "数组的有值元素的个数：" + stringBuffer.length());
        for (int index = 1; index <= 16; index++) {
            stringBuffer.append((char) 90);
        }
        LOGGER.info("---再添加16个元素-----");
        LOGGER.info("再添加16个元素的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加16个元素，数组的有值元素的个数：" + stringBuffer.length());
        LOGGER.info("---char型数组需要扩容-----");
        stringBuffer.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" +
                stringBuffer.length());
        LOGGER.info("-CharSequence型参数(789)构造器初始化扩容与String型参数构造器一致-");

        // 初始化了一个长度为(CharSequence型参数长度+16)的char[],每次扩容成原来的2倍 + 2
        CharSequence charSequence = "789".subSequence(0, 3);
        stringBuffer = new StringBuilder(charSequence);

        LOGGER.info("---------------Int型参数(10)构造器初始化扩容---------------");

        // 初始化了一个长度为(指定参数长度)的char[],每次扩容成原来的2倍 + 2
        stringBuffer = new StringBuilder(10);
        LOGGER.info("StringBuilder的int型参数(10)构造器方法初始化后，容器的容量：" +
                stringBuffer.capacity());
        LOGGER.info("StringBuilder的int型参数(10)构造器方法初始化后，数组的有值元素的个数："
                + stringBuffer.length());

        stringBuffer.append("123");
        LOGGER.info("StringBuilder的int型参数(10)构造器方法初始化后，" +
                "添加一个String型123的容量：" + stringBuffer.capacity());
        LOGGER.info("StringBuilder的int型参数(10)构造器方法初始化后，" +
                "添加一个String型123的容量，数组的有值元素的个数：" +
                stringBuffer.length());

        for (int index = 1; index <= 7; index++)
            stringBuffer.append((char) 90);
        LOGGER.info("---再添加7个元素-----");
        LOGGER.info("再添加7个元素的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加7个元素，数组的有值元素的个数：" + stringBuffer.length());
        LOGGER.info("---char型数组需要扩容-----");

        stringBuffer.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + stringBuffer.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" +
                stringBuffer.length());
    }

    /**
     * {@link StringBuilder}的非静态方法。
     */
    @Test
    public void instanceMethodsOfThis() {

    }

    /**
     * {@link StringBuilder}的扩容机制。
     */
    @Test
    public void expansionType() {
    }
}
