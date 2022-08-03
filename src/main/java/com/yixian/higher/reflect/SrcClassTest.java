package com.yixian.higher.reflect;

import com.yixian.ILoggerAble;
import com.yixian.higher.reflect.base.Comment;
import com.yixian.higher.reflect.base.Person;
import com.yixian.higher.reflect.base.Student;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @program: JavaSeStudy
 * @description: 学习
 * @author: zhang_hj
 * @create: 2022-07-27 10:17
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class SrcClassTest implements ILoggerAble {

    static {
        ILoggerAble.start("Class类的学习");
    }

    static <T> void getOptID() {

    }

    private static <T> void getOptID(T str1) {

    }

    /**
     * 获取类的{@link Class}对象的几种方式
     */
    @Test
    public void getClassInstance3TypeTest() throws ClassNotFoundException {
        LOGGER.info("对象.getClass()获取 : " + this.getClass());
        LOGGER.info("类.class()获取 : " + Person.class);
        Class t1 = Class.forName("com.yixian.higher.reflect.base.Person");
        LOGGER.info("Class.forName(\"类的全限定类名\")获取 : " + t1);

        Class t2 = Class.forName("com.yixian.higher.reflect.base.Person",
                false, ClassLoader.getSystemClassLoader());
        LOGGER.info("Class.forName(\"类的全限定类名\", true, " +
                " ClassLoader.getSystemClassLoader())获取 : " + t2);
        LOGGER.info(String.valueOf(t1 == t2));
    }

    /**
     * {@link Class}的方法学习。
     */
    @Test
    public void getXxxMethodsOfClassTest() throws IOException,
            NoSuchMethodException, NoSuchFieldException {
        getXxxMethodsOfClass(Person.class);
    }

    /**
     * 某一个{@link Class}对象的getXxx方法测试。
     *
     * @param t   {@Link Class}对象
     * @param <T> 泛型参数
     */
    private static <T> void getXxxMethodsOfClass(Class<T> t) throws IOException,
            NoSuchMethodException, NoSuchFieldException {

        Objects.requireNonNull(t, "参数不能为空");

        LOGGER.info("========================================================");
        LOGGER.info("                       获取类的信息                       ");
        LOGGER.info("========================================================");
        ClassInfosUtils.getClassInfos(t);

        LOGGER.info("========================================================");
        LOGGER.info("                     获取类的方法的信息                     ");
        LOGGER.info("========================================================");
        Methods.getMethodMethodsOfClass(t);

        LOGGER.info("========================================================");
        LOGGER.info("                     获取类的属性的信息                     ");
        LOGGER.info("========================================================");
        Fields.getFiledsMethodsOfClass(t);

        LOGGER.info("========================================================");
        LOGGER.info("                     获取类的注解的信息                     ");
        LOGGER.info("========================================================");
        Annotations.getAnnotationsMethodOfClass(t);
    }

    @Test
    public void isXxxMethodsOfClass() throws IOException {
        Class[] tClasses = new Class[] {
                Runnable.class, Person.class, ArrayList.class,
                int[].class, Comment.class, int.class,
                Integer.class,Person.Node.class,Object.class,
                new Person().getComparableInstances().getClass(),
                new Person().getSerializableInstances().getClass(),
                Student.class,
        };
        for (Class t : tClasses) {
            ClassInfosUtils.isXxxMethodsOfClass(t);
        }

    }

}

