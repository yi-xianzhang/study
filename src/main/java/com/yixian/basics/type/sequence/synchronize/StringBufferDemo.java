package com.yixian.basics.type.sequence.synchronize;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * {@link StringBuffer}表示可变的字符序列，可以对字符增删，同时是一个容器。
 * ---> {@link java.io.Serializable}表示可以保存到文件、网络传输等。
 * ---> {@link CharSequence}  表示字符序列
 * ———> {@link AbstractStringBuilder}
 * |---> {@link CharSequence}   表示字符序列
 * |---> {@link Appendable}     表示可以追加
 * <p>
 * 1 在直接父类{@link AbstractStringBuilder}中定义默认容量为16的char[]属性value，
 * 存放字符串内容。
 * <p>
 * 2 使用final修饰，不能被继承。
 * 3 扩容机制：扩容为原来的2倍 + 2,其真正扩容的存在于
 * 其直接父类{@link AbstractStringBuilder#newCapacity(int)}
 * {@code int newCapacity = (value.length << 1) + 2;}
 * 4 方法存在 synchronized 关键字修饰，线程安全。
 */
@SuppressWarnings("all")
public class StringBufferDemo {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(StringBufferDemo.class);

    /**
     * {@link StringBuffer}的不同构造器初始化容量大小。<br/>
     */
    @Test
    public void constructorsOfThis() {
        LOGGER.info("----------------无型参数构造器初始化----------------");
        // 初始化了一个长度为16的char[],每次扩容成原来的2倍 + 2
        StringBuffer sb = new StringBuffer();
        LOGGER.info("StringBuffer默认构造器方法初始化后，容器的容量：" + sb.capacity());
        LOGGER.info("StringBuffer默认构造器方法初始化后，数组的有值元素的个数：" +
                sb.length());
        sb.append((char) 90);
        LOGGER.info("StringBuffer默认构造器方法初始化后，添加一个int型90的容量：" +
                sb.capacity());
        LOGGER.info("StringBuffer默认构造器方法初始化后，添加一个int型90的容量，" +
                "数组的有值元素的个数：" + sb.length());
        LOGGER.info("---再添加15个元素-----");
        for (int index = 1; index <= 15; index++)
            sb.append((char) 90);
        LOGGER.info("再添加15个元素的容量：" + sb.capacity());
        LOGGER.info("再添加15个元素，数组的有值元素的个数：" + sb.length());
        LOGGER.info("---char型数组需要扩容-----");
        sb.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + sb.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" +
                sb.length());
        LOGGER.info("---------------String型参数(123)构造器初始化---------------");
        // 初始化了一个长度为(String型参数长度+16)的char[],每次扩容成原来的2倍 + 2
        sb = new StringBuffer("123");
        LOGGER.info("StringBuffer默认构造器方法初始化后，添加一个String型123的容量：" +
                sb.capacity());
        LOGGER.info("StringBuffer默认构造器方法初始化后，添加一个String型123的容量，" +
                "数组的有值元素的个数：" + sb.length());
        for (int index = 1; index <= 16; index++)
            sb.append((char) 90);
        LOGGER.info("---再添加16个元素-----");
        LOGGER.info("再添加16个元素的容量：" + sb.capacity());
        LOGGER.info("再添加16个元素，数组的有值元素的个数：" + sb.length());
        LOGGER.info("---char型数组需要扩容-----");
        sb.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + sb.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" +
                sb.length());
        LOGGER.info("CharSequence型参数(789)构造器初始化扩容与String型参数构造器一致");
        // 初始化了一个长度为(CharSequence型参数长度+16)的char[],每次扩容成原来的2倍 + 2
        CharSequence charSequence = "789".subSequence(0, 3);
        sb = new StringBuffer(charSequence);
        LOGGER.info("---------------Int型参数(10)构造器初始化扩容---------------");
        // 初始化了一个长度为(指定参数长度)的char[],每次扩容成原来的2倍 + 2
        sb = new StringBuffer(10);
        LOGGER.info("StringBuffer的int型参数(10)构造器方法初始化后，容器的容量：" +
                sb.capacity());
        LOGGER.info("StringBuffer的int型参数(10)构造器方法初始化后，数组的有值元素的个数："
                + sb.length());
        sb.append("123");
        LOGGER.info("StringBuffer的int型参数(10)构造器方法初始化后，" +
                "添加一个String型123的容量：" + sb.capacity());
        LOGGER.info("StringBuffer的int型参数(10)构造器方法初始化后，" +
                "添加一个String型123的容量，数组的有值元素的个数：" + sb.length());
        for (int index = 1; index <= 7; index++) {
            sb.append((char) 90);
        }
        LOGGER.info("------------------再添加7个元素--------------------");
        LOGGER.info("再添加7个元素的容量：" + sb.capacity());
        LOGGER.info("再添加7个元素，数组的有值元素的个数：" + sb.length());
        LOGGER.info("------------------char型数组需要扩容--------------------");
        sb.append((char) 90);
        LOGGER.info("再添加一个int型90的容量：" + sb.capacity());
        LOGGER.info("再添加一个int型90的容量，数组的有值元素的个数：" + sb.length());

    }

    /**
     * {@link StringBuffer}的扩容机制。
     */
    @Test
    public void expansionType() {

    }

    /**
     * {@link String}和{@link StringBuffer}的相互转换。
     * 1 {@link String} ===> {@link StringBuffer}
     * 使用{@link StringBuffer}的构造器
     * 2 {@link StringBuffer} ===> {@link String}
     * 使用{@link StringBuffer#toString()}
     * 使用{@link String}构造器
     */
    @Test
    public void useString2StrignBuffer() {
        LOGGER.info("new String(new StringBuffer(\"11111\")) = " +
                new String(new StringBuffer("11111")));
        LOGGER.info("new String(new StringBuffer(\"11111\")) = " +
                new StringBuffer("11111").toString());
    }


    /**
     * {@link StringBuffer}非静态方法学习。
     */
    @Test
    public void nonStaticMethodOfStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
    }

    /**
     * {@link StringBuffer}非静态方法学习。
     */
    @Test
    public void staticMethodOfStringBuffer() {
        Method[] methods = StringBuffer.class.getMethods();
        boolean staticFlag = false;
        for (Method method:methods) {
            if (method.getName().contains("static")) {
                staticFlag = true;
                break;
            }
        }
        if (!staticFlag) {
            LOGGER.info(StringBuffer.class.getName() + "； 无静态方法");
        } else {
            LOGGER.info(StringBuffer.class.getName() + "； 存在静态方法");
        }
    }
}


