package com.yixian.basics.enums;

import org.junit.Test;

/**
 * 枚举学习引导
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 枚举学习引导
 * @create : 2022-06-04 22:17
 *
 * 1 枚举默认继承了{@link Enum}。
 * 2 枚举不能实例化。{@link EnumStarter#createEnumInstance()},出现了编译错误。
 * 3 枚举不能继承其它类，因为它隐式继承了{@link Enum}
 * 4 可以实现接口。参见{@link Week}和{@link IA}
 */
@SuppressWarnings("all")
public class EnumStarter {

    /**
     * 枚举类的switch用法。</br>
     */
    @Test
    public void enumTest() {
        Education education = Education.getInstance(1);
        switch (education) {
            case PRIMARY:
            case MIDDLE:
            case HIGH:
                System.out.println(education.getName());
                break;
            default:
        }
    }

    @Test
    public void createEnumInstance() {
//       Education education = new Education("1","3");
        System.out.println(Education.MIDDLE.toString());
    }

    @Test
    public void valuesOfWeek() {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value);
        }
    }

    @Test
    public void sayOfWeek() {
        Week.WEDNESDAY.say();
    }


    @Test
    public void test() {
        Color[] values = Color.values();
        for (Color value : values) {
            switch (value) {
                case RED:
                case BLUE:
                case BLACK:
                case YELLOW:
                case GREEN:
                    value.show();
                    break;
                default:
                    throw new IllegalStateException("无法匹配");
            }
        }
    }
}
