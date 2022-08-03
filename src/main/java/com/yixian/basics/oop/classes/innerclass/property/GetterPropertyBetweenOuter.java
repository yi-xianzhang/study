package com.yixian.basics.oop.classes.innerclass.property;

/**
 * @program: JavaSeStudy
 * @description: 动态成员内部类和外部类之间的互相访问
 * @author: zhang_hj
 * @create: 2022-06-26 00:30
 * @version: 1.0.0
 */
public class GetterPropertyBetweenOuter {

    private String name;

    String password;

    protected String email;

    public String loginName;

    private String innerName = "111111";


    public GetterPropertyBetweenOuter(String name,
                                      String password,
                                      String email,
                                      String loginName) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public class InnerClass {

        private String innerName = "老色痞";

        private static final String innerName3 = "老色痞";

//        private static String innerName2 = "老色痞2";
        public void say() {
            System.out.println("访问外部类的私有成员，name = " +  name);
            System.out.println("访问外部类的默认修饰符修饰的成员，password = " +
                    password);
            System.out.println("访问外部类的受保护的成员，email = " + email);
            System.out.println("访问外部类的公共的成员，loginName = " +  loginName);
        }

        public void say2() {
            System.out.println("访问冲突时：-------");
            System.out.println("访问外部类的私有成员，innerName = " +
                    GetterPropertyBetweenOuter.this.innerName);
            System.out.println("外部类名.this.hashCode = " +
                    GetterPropertyBetweenOuter.this);
        }

//        public static void say3() {
//
//        }

//        public static final void say4() {
//
//        }

    }

    public void useInnerClass() {
        new InnerClass().say();
    }

    public void useInnerClassProperty() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerName);
    }


    public InnerClass getInnerClassInstance() {
        return new InnerClass();
    }





}
