package com.yixian.basics.exception;

import com.yixian.ILoggerAble;
import org.junit.jupiter.api.Test;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 异常处理
 * @create : 2022-06-28 21:27
 * 1 java 提供了try和catch块来处理异常，try 块用于包含可能出错的代码，catch块用于处理try
 * 块中发生的异常。程序中根据需要可以有多个try... catch 块
 * <p>
 * 2. throws  参见{@link ExceptionStarter#compileException()}
 * <p>
 * 1） 基本语法 参见{@link ExceptionStarter#testCatchException()}
 */
@SuppressWarnings("all")
class ExceptionHandle implements ILoggerAble {

    static {
        ILoggerAble.start("异常学习");
    }

    // --------------------------try ------------------------------------------

    /**
     * try...catch的使用。
     */

    public void testTry(String str) {
        try {
            int a = Integer.parseInt(str);
            LOGGER.info("字符串str[" + str + "]转换成int型数字 a[" + a + "]");
        } catch (NumberFormatException e) {
            LOGGER.info("字符串str[" + str + "]无法转换成int型数字");
        } finally {
            LOGGER.info("程序结束");
        }
    }

    @Test
    public void test() {
        testTry("zhanguyixian");
        testTry("1234");
        testTry("1234.456");
    }


    private int tryCatchFinally() {
        int i = 5;
        try {
            LOGGER.info("try 块执行");
            return 5;
        } catch (Exception e) {
            LOGGER.info("catch 块执行");
            return 5;
        } finally {
            LOGGER.info("finally 块执行");
//            return 7;
        }
    }

    @Test
    public void tryCatchFinallyTest() {
        int x = tryCatchFinally();
        LOGGER.info("返回结果为" + x);
    }

    @Test
    public void testMoreNotRelationException() {
        try {
            String str = "234";
//            str = null;
            LOGGER.info(str.toLowerCase());
            int sum = 9;
            int count = 0;
            int ave = sum / count;
        } catch (NullPointerException e) {
            LOGGER.info("空指针异常");
        } catch (ArithmeticException e) {
            LOGGER.info("算数运算异常");
        } catch (Exception e) {
            LOGGER.info("未知异常");
        }
    }


    public static void testMyException() throws MyException {
    }

    @Test
    public void myExectionTest() throws Exception {
        testMyException();
        testMyRunTimeException();
    }

    public static void testMyRunTimeException() throws MyRunTimeException {
    }
}
