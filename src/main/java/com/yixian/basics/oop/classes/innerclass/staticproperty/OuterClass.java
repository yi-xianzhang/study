package com.yixian.basics.oop.classes.innerclass.staticproperty;

/**
 * @program: JavaSeStudy
 * @description: 外部类。
 * @author: zhang_hj
 * @create: 2022-06-26 01:34
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class OuterClass {

    private static String name = "胖虎";

    static String  password = "2222";

    protected static String email = "panghu@qq.com";

    public static String loginName = "panghu";

    public String loginName2 = "panghu";

    private static String innerName = "111111";


    public static class InnerClass {

        private static String innerName = "千年老色痞";

        private String innerLoginName = "千年老色痞";


        public void say() {
            System.out.println("访问外部类的私有成员，name = " +  name);
            System.out.println("访问外部类的默认修饰符修饰的成员，password = " +
                    password);
            System.out.println("访问外部类的受保护的成员，email = " + email);
            System.out.println("访问外部类的公共的成员，loginName = " +  loginName);
//            System.out.println("访问外部类非静态成员，loginName2 = " + loginName2);
        }

        public static void say3() {

        }

        public void say4() {
            System.out.println("成员重名时：innerName = " + innerName);
            System.out.println("成员重名时：OuterClass.innerName = " +
                    OuterClass.innerName);
        }

    }

    public void getInnerClassInstance() {
        new InnerClass().say();
    }

    public void getterInnerClassStaticProperty() {
        System.out.println("静态内部类的外部类访问静态内部类的静态成员，innerName = " +
                InnerClass.innerName);
    }

    public void getterInnerClassProperty() {
        InnerClass innerClass = new InnerClass();
        System.out.println("静态内部类的外部类访问静态内部类的非静态成员，" +
                "innerLoginName = " + innerClass.innerLoginName);
    }
}
