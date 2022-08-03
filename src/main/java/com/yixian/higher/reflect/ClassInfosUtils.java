package com.yixian.higher.reflect;

import com.yixian.higher.reflect.base.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.util.Objects;

/**
 * @program: JavaSeStudy
 * @description: 获取类信息的工具类
 * @author: zhang_hj
 * @create: 2022-07-28 15:47
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class ClassInfosUtils {

    /**
     * 日志文件
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(ClassInfosUtils.class);
    /**
     * 类信息的获取
     * @param t
     * @param <T>
     */
    public static<T> void getClassInfos(Class<T> t) {
        LOGGER.info("t[" + t.toString() + "].getSimpleName()" +
                "[获取类名(不含包名)] :" + t.getSimpleName());
        LOGGER.info("t[" + t.toString() + "].getName()" +
                "[获取全限定类名] :" + t.getName());
        LOGGER.info("t[" + t.toString() + "].getTypeName()" +
                "[获取全限定类名] :" + t.getTypeName());
        LOGGER.info("t[" + t.toString() + "].getSuperclass()" +
                "[获取父类的全限定类名] :" + t.getSuperclass());
        LOGGER.info("t[" + t.toString() + "].getClassLoader()" +
                "[获取类的类加载器] :" + t.getClassLoader());
        LOGGER.info("t[" + t.toString() + "].getPackage()" +
                "[获取类的包名] :" + t.getPackage());
        LOGGER.info("t[" + t.toString() + "].getResource(\"/\").getPath()" +
                "[获取类classpath路径] :" + t.getResource("/").getPath());
        LOGGER.info("t[" + t.toString() + "].getResource(\"\").getPath()" +
                "[获取类当前路径路径] :" + t.getResource("").getPath());
        LOGGER.info("t[" + t.toString() + "].getClass()" +
                "[获取Class对象的Class对象] :" + t.getClass());
    }

    /**
     * 某一个{@link Class}对象的isXxx方法测试。
     *
     * @param t   {@Link Class}对象
     * @param <T> 泛型参数
     */
    public static <T> void isXxxMethodsOfClass(Class<T> t) throws IOException {
        Objects.requireNonNull(t, "参数不能为空");

        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isEnum()[是否为枚举] : = " + t.isEnum());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isArray()[是否为数组] : = " + t.isArray());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isPrimitive()[是否为基本类型] : = " + t.isPrimitive());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isAnnotation()[是否为注解] : = " + t.isAnnotation());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isInterface()[是否为接口] : = " + t.isInterface());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isAnnotationPresent(Retention.class)[是否为接口] : = " +
                t.isAnnotationPresent(Retention.class));
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isInstance(Gender.FEMALE)[是否为某一对象的类] : = " +
                t.isInstance(Gender.FEMALE));
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isLocalClass()[是否为局部内部类] : = " + t.isLocalClass());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isAnonymousClass()[是否为匿名内部类] : = " +
                t.isAnonymousClass());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isMemberClass()[是否为成员内部类] : = " +
                t.isMemberClass());
        LOGGER.info("类型 t ：" + t.toString() +
                " , t.isAssignableFrom(Thread.class)[是否为参数类的父类，父接口] : = " +
                t.isAssignableFrom(Thread.class));
        LOGGER.info("类型 t ：" + t.toString() + " , t.isSynthetic()[是否为特殊类] : = " +
                t.isSynthetic());

    }
}

