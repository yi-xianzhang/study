package com.yixian.basics.oop.classes.innerclass.anonymous.exer;

import org.junit.Test;

/**
 * @program: JavaSeStudy
 * @description: 练习
 * @author: zhang_hj
 * @create: 2022-06-26 00:01
 * @version: 1.0.0
 */
public class ExerciseStarter {

    @Test
    public void execFlyByFlyTemplate() {
        FlyTemplate flyTemplate = new FlyTemplate();
        flyTemplate.execFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("执行飞行");
            }
        });
    }


    @Test
    public void execAlarmclockByCellPhone() {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了。。。。。。。。");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了。。。。。。。。");
            }
        });

        /**
         * 体会使用 lambda 表达式
         */
        cellPhone.alarmclock(() -> {
            System.out.println("lambda表达式。。。。。。。。");
        });

    }
}
