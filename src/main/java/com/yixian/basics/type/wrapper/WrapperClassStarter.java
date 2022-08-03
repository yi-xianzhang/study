package com.yixian.basics.type.wrapper;

import com.yixian.basics.exception.ExceptionStarter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 包装类学习引导
 * @create : 2022-06-29 19:00
 * <p>
 * 1 布尔型： {@link Boolean}类：boolean的包装器类型。
 * ---> {@link java.io.Serializable}抽象类。
 * ----> {@link Comparable<Boolean>}类，用来比较大小。
 * 参见{@link com.yixian.basics.type.wrapper.booleans}.
 * <p>
 * 2 字符型 ： char <-->  {@link Character}
 * ---->{@link Comparable}
 * ---->{@link java.io.Serializable}
 * 参见{@link Character}
 * <p>
 * 2 数值型 ：下记均是。参见{@link com.yixian.basics.type.wrapper.Number.uml}
 * byte <--> {@link Byte}
 * short <--> {@link Short}
 * int <--> {@link Integer}
 * long <--> {@link Long}
 * float <--> {@link Float}
 * double <--> {@link Double}
 * 以上包装类均实现和继承了下记接口和类
 * ---> {@link Number}
 * >--->{@link java.io.Serializable}
 * >--->{@link Comparable}
 * 参见{@link com.yixian.basics.type.wrapper}包下的所有文件。
 */

@SuppressWarnings("all")
public class WrapperClassStarter {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ExceptionStarter.class);

    /**
     * 包装类与基本类型的转换。装箱：Debugger得出他调用的是{@link Integer#valueOf(int)}
     * 拆箱：Debugger得出他调用的是{@link Integer#intValue()}
     * 其他包装器类型用法可类比。
     * 基本上包装类调用的都是他的valueOf（）方法。
     */
    @Test
    public void wrapper2BasicTypeConvertTest() {
        int iBnum = 123;
        Integer iTWNum = iBnum;
        int iTBnum = iTWNum;
    }
}
