package com.yixian.basics.annotation;

import com.yixian.basics.annotation.src_annotation.Deprecated_;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: JavaSeStudy
 * @description: 注解学习
 * @author: zhang_hj
 * @create: 2022-06-26 00:04
 * @version: 1.0.0
 * <p>
 * 1 释义 : 又被称为元数据，用于修饰解释包、方法、属性、构造器、局部变量等数据信息。
 * <p>
 * 2 与注释一样，不影响程序执行，但注解可以被编译或运行，相当于嵌入代码的补充信息。
 * <p>
 * 4 在javaEE和Spring 框架中将大量使用注解替换冗余代码和配置。
 * <p>
 * 5 使用 Annotation 是在其前面增加 @ 符号，并把 Annotation 当成一个修饰符使用，
 * 用于修饰它支持的程序元素。
 * 6 三个基本注解: @Override、@Deprecated、@SuppressWarnings
 * 1) {@link Override} 限定某个方法是重写父类方法，该注解只能作用于方法。
 * 重写方法也可以不写，若写了则编译器会检查是否重写了父类方法，若没有重写，则会编译出错。
 * 参见 {@link com.yixian.basics.annotation.src_annotation.Override_}
 * <p>
 * 2) {@link Deprecated} 用于表示某个程序元素（类、方法）已经过时。
 * 作用于构造器、成员属性、局部变量、方法、包、参数、类型
 * 参见{@link Deprecated_}
 * <p>
 * 3) {@link SuppressWarnings} 抑制编译器警告
 * 作用于构造器、成员属性、局部变量、方法、参数、类型
 *
 * 7. 元注解 ，如{@link Target}
 *
 * 8 自定义注解，使用 @interface 修饰，参见{@link Override}和
 * {@link MyAnnotation}
 */

@SuppressWarnings(value = "all")
public class AnnotationStarter {

    @Test
    public void useDeprecatedAnnotation() {
        Deprecated_ deprecated_ = new Deprecated_();
        deprecated_.say();
        deprecated_.say2();
        System.out.println(deprecated_.x);
    }

    @Test
    public void testSuppressWarnings() {
        List list = new ArrayList<>();
        list.add("11111");
    }

}
