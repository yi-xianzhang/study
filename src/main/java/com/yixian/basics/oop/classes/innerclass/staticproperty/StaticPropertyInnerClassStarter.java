package com.yixian.basics.oop.classes.innerclass.staticproperty;


import org.junit.Test;

/**
 * 静态成员内部类学习。
 *
 * @program: JavaSeStudy
 * @description: 静态成员内部类
 * @author: zhang_hj
 * @create: 2022-06-22 20:58
 * @version: 1.0.0
 * <p>
 * 1 位置：定义在外部类的成员位置。参见{@link Location}
 * <p>
 * 2 访问修饰符：可以添加任意的访问修饰符,可以将其看成类的静态成员。参见{@link Location}
 * <p>
 * 3.访问规则：和外部类的静态成员一样，
 * 3.1 可以访问其外部类的所有静态成员，与修饰符无关.
 * 参见{@link StaticPropertyInnerClassStarter#getterOuterClassProperty()}
 * <p>
 * 3.2 静态内部类--访问--外部类，直接访问所有静态成员。
 * 参见{@link StaticPropertyInnerClassStarter#getterOuterClassProperty()}
 * <p>
 * 3.3 外部类--访问--静态内部类，访问方式，
 * 3.3.1 静态成员，直接静态内部类.静态成员
 * 参见{@link StaticPropertyInnerClassStarter#getterInnerClassStaticProperty()}
 * <p>
 * 3.4 外部其他类--访问--静态内部类，访问方式，先创建对象，在访问，注意静态内部类的访问修饰符
 * 语法形如 new 外部类名.内部类名();
 * 参见{@link StaticPropertyInnerClassStarter#getterOuterClassProperty()}
 * <p>
 * 3.5 成员重名问题，遵循就近原则。若想访问外部类的成员，使用类名.外部类成员名
 * 参见{@link StaticPropertyInnerClassStarter#propertyName()}
 * <p>
 * 3.3.3 静态成员，创建对象，在访问
 * 参见{@link StaticPropertyInnerClassStarter#getterInnerClassProperty()}
 * 4.静态内部类对象的获取：
 * <p>
 * 5.作用域：与其他静态成员一样，为整个类体。
 * 参见{@link }
 */
public class StaticPropertyInnerClassStarter {

    @Test
    public void getterOuterClassProperty() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.say();
    }

    @Test
    public void getterInnerClassStaticProperty() {
        OuterClass outerClass = new OuterClass();
        outerClass.getterInnerClassStaticProperty();
    }

    @Test
    public void getterInnerClassProperty() {
        OuterClass outerClass = new OuterClass();
        outerClass.getterInnerClassProperty();
    }

    @Test
    public void getterOuterClassStaticProperty() {
        OuterClass.InnerClass.say3();
    }

    @Test
    public void propertyName() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.say4();
    }
}
