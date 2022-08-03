package com.yixian.basics.exception;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常继承体系图。</br>
 * {@link Throwable} 时异常和错误的父类。
 * --> {@link Exception}
 * ---> {@link RuntimeException}   运行时异常
 * ---> {@link java.io.IOException} 编译时异常
 * ---> {@link ReflectiveOperationException} 编译时异常
 * --> {@link Error}
 *
 * @author : zhang_hj
 * @version : 1.0.0
 * <p>
 * 1 异常和异常处理入门，参见{@link ExceptionStarter#test()}和
 * {@link ExceptionStarter#testCatchException()}
 * <p>
 * 2 基本概念： Java世界中，将程序执行中发生的不正常情况称为异常
 * <p>
 * 3 分类；
 * 3.1 Error(错误)：java虚拟机无法解决的严重问题，如JVM系统内部错误、资源耗尽，栈溢出，
 * 会导致java世界崩溃。
 * 例{@link StackOverflowError} 和 {@link OutOfMemoryError}
 * <p>
 * 3.2 Exception：其他编程问题或者偶然外因导致的一般性问题，可以使用正对性的代码处理。
 * 例{@link NullPointerException}和{@link java.io.FileNotFoundException}基本都是
 * {@link RuntimeException}
 * Exception分成两大类：运行时异常和编译时异常。
 * <p>
 * 3.2.1 运行时异常：程序运行时。例{@link NullPointerException}
 * <p>
 * 3.2.1 编译时异常：程序编译时编译器检查出的异常.
 * {@link java.io.FileNotFoundException}
 * <p>
 * 4.异常处理方式：参见{@link ExceptionHandle}
 * <p>
 * 4.4 throws：抛出
 * @program : JavaSeStudy
 * @description : 异常学习引导类
 * @create : 2022-06-26 12:21
 */
@SuppressWarnings("all")
public class ExceptionStarter {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ExceptionStarter.class);

    /**
     * 异常引出。</br>
     * 在现实生活中，0不能作为除数，让我们来看一下，在Java世界中0做除数会发生?
     * java.lang.ArithmeticException: / by zero
     * ---> {@link ArithmeticException} 看一下这个异常的定义，学习Java世界的异常
     */
    @Test
    public void test() {
        int sum = 23;
        int count = 0;
        int avg = 23 / 0;
        LOGGER.info("sum[" + sum + "] / count[" + count + "] = " + avg);
    }

    /**
     * 解决上述异常
     */
    @Test
    public void testCatchException() {
        int sum = 23;
        int count = 0;
        try {
            int avg = sum / count;
            LOGGER.info("sum[" + sum + "] / count[" + count + "] = " + avg);
        } catch (ArithmeticException e) {
            LOGGER.info("除数count[" + count + "] 不能为0 ");
        }
    }


    /**
     * 编译时异常/ 受查性异常
     *
     * @throws FileNotFoundException
     */
    public void compileException() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c://kjsahd.jpg");
    }


}
