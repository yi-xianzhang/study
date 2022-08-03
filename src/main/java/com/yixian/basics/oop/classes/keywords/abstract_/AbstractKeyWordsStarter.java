package com.yixian.basics.oop.classes.keywords.abstract_;

import com.yixian.basics.oop.classes.keywords.abstract_.exercise.CommonEmployee;
import com.yixian.basics.oop.classes.keywords.abstract_.exercise.Manager;
import org.junit.Test;

/**
 * abstract关键字
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : abstract关键字
 * @create : 2022-06-05 12:45
 * <p>
 * 1.作用 ： 可以修饰类，方法,修饰类时叫抽象类，修饰方法时抽象方法。
 * 注(接口中的非default和static方法默认自带abstract 和 public关键字，因此可不写)
 * <p>
 * (1).修饰类时，类为抽象类，下面探讨抽象类、父类方法不确定。
 * ①. 一般地，抽象类会被继承，抽象方法为会由子类实现。
 * 参见{@link Animal}和{@link Dog}。
 * <p>
 * ②.  抽象类中可以没有抽象方法。参见{@link AbstractClass}
 * <p>
 * ③.  抽象类不可以被实例化。
 * 参见{@link AbstractKeyWordsStarter#instanceByAbstractClass}
 * <p>
 * ④. 类中存在抽象方法时，类必须声明为抽象类，参见{@link Animal}。
 * <p>
 * ⑤. 抽象类还是类，可以有任意的成员。参见{@link AbstractClass}。
 * <p>
 * ⑥.一个类一旦继承了抽象类，则它必须实现抽象类的抽象方法，除非它自己也声明为抽象类。
 * 参见{@link Dog}、{@link Pig}。
 * <p>
 * (2).修饰方法时，方法为抽象方法,不可以有方法体，参见{@link Animal}。
 * ①. 抽象方法不能有方法体，参见{@link Animal#drink()}。
 * ②. 抽象方法不能使用 private、final、static 修饰,与重写冲突。参见{@link Pig}
 */
public class AbstractKeyWordsStarter {

	@Test
	public void instanceByAbstractClass() {
//		new AbstractClass();
	}

	@Test
	public void exercise() {
		Manager manager =
			new Manager("龙傲天","0001",80000,2000);
		manager.work();

		CommonEmployee commonEmployee =
			new CommonEmployee("小白","1000",2000);
		commonEmployee.work();
	}
}

