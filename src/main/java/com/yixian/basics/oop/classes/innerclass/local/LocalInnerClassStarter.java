package com.yixian.basics.oop.classes.innerclass.local;

import org.junit.Test;

/**
 * 局部内部类
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 局部内部类
 * @create : 2022-06-13 22:15
 * <p>
 * 1. 说明 ： 定义在外部类的局部位置，比如方法,并且有类名。
 * 参见{@link Location}
 * 2. 因为定义的位置，它有下记特点
 * (1). 可以直接访问外部类的所有成员。包含私有。参见{@link OuterClass#method()}，
 * 外部类只能在定义该局部内部类的方法中使用。参见{@link OuterClass#method()}。
 * <p>
 * (2). 不能添加访问修饰符，因为其地位就是方法的一个变量，局部变量不能使用修饰符。
 * 但可以使用 final 修饰，局部变量也可以使用 final 修饰。
 * 参见{@link Modifier}
 * <p>
 * (3). 所用域仅仅在定义他的方法或者代码块中，参照局部变量。
 *
 * (4)。可以实现或者继承其他类或者接口,参见{@link IsA#method()}
 *
 * (5). 外部类不能访问局部内部类，局部内部类和局部变量相当。
 *
 * (6). 如果外部类和局部内部类的成员重名时，默认遵循就近原则，若想访问外部类的成员，
 * 则使用 外部类名.this.成员访问。参见{@link OuterClass#method()}
 *
 * (7). 局部内部类中的属性可以使用final和static final 修饰，但不能只用static修饰。
 * 局部内部类的方法的修饰符不能包含static，参见{@link StaticPropertyOrMethod}
 *
 * (8). 局部内部类中访问外部类时，若内部类定义在为静态方法，
 * 则不能访问外部类的非静态成员。参见{@link StaticOuterClass#test()}
 */
public class LocalInnerClassStarter {

	@Test
	public void test1() {
		final double PI = 3.14;
		OuterClass outerClass = new OuterClass("局部内部类");
		outerClass.method();
	}

}

