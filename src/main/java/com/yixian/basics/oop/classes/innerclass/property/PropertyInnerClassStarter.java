package com.yixian.basics.oop.classes.innerclass.property;

import com.yixian.ILoggerAble;
import org.junit.Test;

/**
 * 成员内部类的学习。
 *
 * @program: JavaSeStudy
 * @description: 成员内部类
 * @author: zhang_hj
 * @create: 2022-06-22 20:57
 * @version: 1.0.0
 * 1 位置：定义在外部类的成员位置。参见{@link Location}
 * <p>
 * 2 访问修饰符：可以添加任意的访问修饰符,可以将其看成类的动态成员。参见{@link Location}
 * <p>
 * 3 和外部类的属性方法访问规则:可以访问外部类的所有成员，包括私有的。参见{@link Location}
 * 3.1 成员内部类在其外部类的使用，可以在外部类中定义一个方法，通过该方法间接的使用成员内部类。
 * 参见{@link PropertyInnerClassStarter#nonUsePropertyInnerClass()}
 * <p>
 * 3.2 成员内部类在其他类的使用，可以直接使用，语法为 ： 外部类名.new 成员内部类名();
 * 注：因为其作用和外部类的成员类似，因此，要注意访问修饰符。
 * 参见{@link PropertyInnerClassStarter#usePropertyInnerClass()}
 * {@link PropertyInnerClassStarter#usePropertyInnerClass1()}
 * <p>
 * 3.3 成员内部类访问外部类成员时；直接访问，
 * 参见{@link GetterPropertyBetweenOuter.InnerClass#say()}
 * 注： 可能存在成员名相同，遵循就近原则，若想访问外部类成员时，可以使用外部类名.this.成员名
 * 参见{@link GetterPropertyBetweenOuter.InnerClass#say2()}
 * <p>
 * 3.4 外部类访问成员内部类成员时；直接创建成员内部类的对象，然后直接使用成员(包括私有成员)
 * 参见 {@link GetterPropertyBetweenOuter#useInnerClassProperty()} 和
 * {@link PropertyInnerClassStarter#useInnerClassProperty()}
 * <p>
 * <p>
 * 参见{@link PropertyInnerClassStarter#nonUsePropertyInnerClass()}
 * <p>
 * 4 作用域： 和外部类的成员一样，为整个类体。参见{@link GetterPropertyBetweenOuter}。
 * <p>
 * 5 JDK 1.8 中动态成员内部类不允许存在只使用 static 修饰的属性，但是属性可以使用
 * static final 修饰，不允许使用 static 修饰方法
 * 具体参见{@link GetterPropertyBetweenOuter.InnerClass}
 */
@SuppressWarnings("all")
public class PropertyInnerClassStarter implements ILoggerAble {

    static {
        ILoggerAble.start("非静态成员内部类");
    }

    final GetterPropertyBetweenOuter getter =
            new GetterPropertyBetweenOuter("张三",
                    "1111", "zhangsan@qq.com",
                    "zhangdsan ");

    /**
     * 访问外部类的成员
     */
    @Test
    public void nonUsePropertyInnerClass() {
        getter.useInnerClass();
    }


    /**
     * 访问外部类的成员，
     */
    @Test
    public void usePropertyInnerClass() {
        GetterPropertyBetweenOuter.InnerClass innerClass =
                getter.new InnerClass();
        innerClass.say();
    }

    /**
     * 访问外部类的成员，
     */
    @Test
    public void usePropertyInnerClass1() {
        GetterPropertyBetweenOuter.InnerClass innerClass =
                getter.getInnerClassInstance();
    }

    /**
     * 外部类访问内部类的成员时
     */
    @Test
    public void useInnerClassProperty() {
        getter.useInnerClassProperty();
    }

    @Test
    public void getterOver() {
        GetterPropertyBetweenOuter.InnerClass innerClass =
                getter.getInnerClassInstance();
        innerClass.say2();
        System.out.println(getter);
    }
}
