package com.yixian.basics.oop.extend_;

import com.yixian.basics.oop.classes.keywords.super_.SuperKeyWordsStarter;
import com.yixian.basics.oop.classes.starter.exec.Employee;
import org.junit.Test;

/**
 * 面向对象的第二特征之继承
 * 1.释义：他们之间的关系是is-a
 * 2.好处：解决代码复用性，使编程更加接近人类思维，当多个类存在相同的属性和方法时，
 * 从这些中抽象出父类[基类，超类]，在父类中定义这些重复的属性和的方法，所有
 * 子类[派生类]不需要重新定义这些属性和方法。详细参见
 * {@link InheritanceStarter#pupilAndGraduateTest()}
 * <p>
 * 3.关键字： extends
 * <p>
 * 4.基本语法 ： class 子类[派生类] extends 父类[基类，超类] {}
 * <p>
 * 5.细节：
 *     (1).子类继承了父类的所有属性和方法[此处均为成员方法]，可以直接访问父类[超类、
 *     基类]的非私有的方法和属性，详细参见{@link InheritanceStarter#notPrivate()}。
 *
 *     (2).私有方法可以通过非私有的方法[此处均为成员方法]间接访问,
 *     详细参见{@link InheritanceStarter#privateByNotPrivate()}
 *
 *     (3).子类[派生类]继承了所有的超类方法，可通过debugger观察，详细请debugger执行
 *     {@link InheritanceStarter#debuggerExec()}方法。
 *
 *     (4).子类必须调用父类的构造器，完成父类的初始化，
 *     详细参见{@link InheritanceStarter#constructorOfSub()}。
 *
 *     (5).当创建子类[派生类]初始化对象时，不管使用子类[派生类]的那个构造器[有参数、
 *     无参数]，默认都会调用父类[基类、超类]的无参构造器，
 *     详细参见{@link InheritanceStarter#constructorOfSub()}和
 *     {@link InheritanceStarter#constructorParamOfSub()}
 *     注：此处需要讲{@link Sub#Sub()}和{@link Sub#Sub(int)}的下记代码块注释
 *        super(2,4);
 *
 *     (6).若父类[基类、超类]没有无参构造器，则必须在子类[派生类]的构造器中用super
 *     (super关键子详细参见{@link SuperKeyWordsStarter})去指定使用父类[基类、超类]
 *     的那个构造器完成对父类[基类、超类]的初始化工作，否则编译不通过，详细参见
 *     {@link Sub#Sub()}和{@link Sub#Sub(int)}，将代码块
 *        super(2,4);
 *     注释和{@link Base#Base()}构造器注释，会有编译错误发生。
 *
 *     （7）.如果希望指定调用父类[超类，基类]的那个构造器，需要显示调用，语法如下、
 *        super()
 *        详细参见{@link Sub#Sub()}和{@link Sub#Sub(int)}
 *
 *      (8).super()和this()都只能放在构造器的第一行，因此这两个方法不能共存在一个构
 *      构造器中，其中前者参见{@link Sub#Sub()}和{@link Sub#Sub(int)},将代码块
 *        super(2,4);
 *      移动行数则会发生编译错误，后者参见
 *      {@link Employee#Employee(String, String, short, String, double)} ，
 *      将代码块
 *       this(name,gender,age);
 *     移动行数则也会发生编译错误。
 *
 *     (8). Java所有的类都是{@link Object}的子类[派生类]，{@link Object}是所有类的
 *     的父类[基类、超类]。
 *
 *     (9). 父类[基类、超类]构造器的调用不限于直接父类[基类、超类]！将一直上溯到
 *     {@link Object}类[顶级父类，祖先类]，也就是说{@link Object}是类继承层次图的
 *     根节点。可以使用快捷键来查看类的层次继承图。
 *
 *     (10). java中的继承仅为单继承，因此每个类的直接父类[基类、超类]都只有一个。
 *
 *     (11). 不可滥用继承,子类[派生类]和父类[基类、超类]满足is-a关系。
 *
 * 6.本质：子类对象建立查找关系，详细参见{@link ExtendsEssence}
 * <p>
 * 继承关系要结合两个类来看，A是B的父类，B可能又是C类的父类
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 继承快速入门
 * @create : 2022-06-04 23:10
 */
public class InheritanceStarter {

	/**
	 * 测试小学生和大学生，注意{@link Student}和{@link Pupil}、{@link Graduate}的
	 * 关系。
	 */
	@Test
	public void pupilAndGraduateTest() {

		// 大学生, 此处赋值参见多态
		Student graduate = new Graduate();
		graduate.setAge((short) 23);
		graduate.setName("金角大王");
		graduate.setScore(80.5);
		this.exec(graduate);

		// 小学生, 此处赋值参见多态
		Student pupil = new Pupil();
		pupil.setAge((short) 10);
		pupil.setName("金角大王");
		pupil.setScore(100);
		this.exec(pupil);

	}

	/**
	 * 使用多态执行目标方法
	 * @param student {@link Student}
	 */
	private void exec(Student student) {
		student.testing();
		student.showInfo();
	}

	/**
	 * 测试子类可以直接访问父类的那些修饰符修饰的方法,详细参见
	 * {@link Sub#notPrivateMethod()}方法，同时注意{@link Base}和{@link Sub}的关
	 * 系。
	 */
	@Test
	public void notPrivate() {
		Sub sub = new Sub();
		// 其中访问了父类Base的所有非私有化的属性和方法
		sub.notPrivateMethod();
	}

	/**
	 * 测试子类可以通过非私有的方法间接访问父类的那些私有方法和属性,详细参见
	 * {@link Sub#privateByNotPrivateMethod()}方法，同时注意{@link Base}和、
	 * {@link Sub}的关系。
	 */
	@Test
	public void privateByNotPrivate() {
		Sub sub = new Sub();
		// 其中访问了父类Base的所有非私有化的属性和方法
		sub.privateByNotPrivateMethod();
	}

	/**
	 * 子类[派生类]继承了所有的父类[超类、基类]的属性和方法
	 * 将断点打到 Sub sub = new Sub();的下一行，观察局部变量Sub
	 */
	@Test
	public void debuggerExec() {
		Sub sub = new Sub();
		System.out.println();
	}

	/**
	 * 子类必须调用父类的构造器，完成父类的初始化，并且会先执行父类的构造器,请观察
	 * {@link Sub#Sub()}和{@link Base#Base()},同时注意{@link Base}和{@link Sub}的
	 * 关系。
	 */
	@Test
	public void constructorOfSub() {
		Sub sub = new Sub();
	}

	/**
	 * 子类必须调用父类的构造器，完成父类的初始化，并且会先执行父类的构造器,请观察
	 * {@link Sub#Sub()}和{@link Base#Base()},同时注意{@link Base}和{@link Sub}的
	 * 关系。
	 */
	@Test
	public void constructorParamOfSub() {
		Sub sub = new Sub(5);
	}

}

