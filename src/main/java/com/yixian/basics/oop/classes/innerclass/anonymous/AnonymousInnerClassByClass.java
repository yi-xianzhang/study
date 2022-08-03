package com.yixian.basics.oop.classes.innerclass.anonymous;

/**
 * @program: JavaSeStudy
 * @description: 匿名内部类基于类的
 * @author: zhang_hj
 * @create: 2022-06-25 23:19
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class AnonymousInnerClassByClass {

    private static final double PI = 3.14d;


    private final String NAME = "小猫";


//    private static String password = "11111";

    private String email = "11111";

    public void say() {


       Base sub =  new Base("sub") {

//           private static String password = "11111";

           private String email = "11111";

            @Override
            public void method() {
                System.out.println("测试--------------");
                System.out.println("访问匿名内部类的成员 email = " + email);
                System.out.println("访问外部类的成员 email = " +
                        AnonymousInnerClassByClass.this.email);

                System.out.println("看看外部类名.this是哪一个类的对象 : " +
                        AnonymousInnerClassByClass
                                .this.getClass().getTypeName());

            }
       };
       sub.method();
       System.out.println(sub.getClass().getTypeName());
       System.out.println("访问外部类的静态成员 PI = " + PI);
       System.out.println("访问外部类的动态态成员 name = " + NAME);


    }
}
