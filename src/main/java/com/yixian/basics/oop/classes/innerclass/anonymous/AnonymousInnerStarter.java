package com.yixian.basics.oop.classes.innerclass.anonymous;

import org.junit.Test;

/**
 * 匿名内部类。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 匿名内部类。
 * @create : 2022-06-14 00:14
 * 1.说明 : 匿名内部类定义在外部类的局部位置，方法体，初始化块。参见{@link Location}。
 * 本质上还是一个类，没有显示类名（可不关注），还是一个对象。参见{@link Location}。
 * 2.基本语法如下：参见{@link Location}、{@link AnonymousInnerStarter#test()}
 * new 类名或者接口名(参数列表) {
 * 类体
 * };
 * 3.匿名内部类只能使用一次。{@link AnonymousInnerStarter#test()}。
 * <p>
 * 4.匿名内部类无法重写父类的构造方法，因为匿名内部类无法在书写时预知他的类名。
 * <p>
 * 5.细节：
 * (1). 可以访问外部类的所有成员，参见{@link AnonymousInnerStarter#testByClass()}
 * <p>
 * (2). 不能添加访问修饰符,作用域只是相当于一个访问修饰符。
 * <p>
 * (3). 外部类不能访问匿名内部类，作用域只是相当于一个访问修饰符。
 * <p>
 * (3). 外部类和匿名内部类的成员重名时，匿名内部类访问时，遵循就近原则。若想访问外部类成员，
 * 使用外部类名.this.成员访问。参见{@link AnonymousInnerStarter#testByClass()}
 */
public class AnonymousInnerStarter {

    /**
     * 匿名内部类的使用。基于接口
     * 使用匿名内部类。其中thread的编译类型为Runnable，运行类型为
     * 底层生成的；为 AnonymousInnerClassStarter$1
     * <p>
     * class AnonymousInnerClassStarter$1 implements  Runnable {
     *
     * @Override public void run() {
     * System.out.println("------run----------");
     * }
     * }
     */
    @Test
    public void test() {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                System.out.println("--------run------------");
            }
        };
        thread.run();
        thread.run();
        thread.run();
        System.out.println("thread的运行类型" + thread.getClass().getTypeName());
    }

    {
        System.out.println("------测试动态代码初始化块------");
    }

    static {
        System.out.println("------测试静态代码初始化块------");
    }

    /**
     * 匿名内部类基于类的，基本与基于类的相同{@link AnonymousInnerStarter#test()}
     */
    @Test
    public void testByClass() {
        new AnonymousInnerClassByClass().say();
    }
}

