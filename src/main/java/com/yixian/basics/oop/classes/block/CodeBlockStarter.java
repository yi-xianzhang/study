package com.yixian.basics.oop.classes.block;

import com.yixian.basics.oop.classes.block.order.Sub;
import org.junit.Test;

/**
 * 代码块快速入门学习。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 代码块快速入门
 * @create : 2022-06-12 10:27
 * 1. 释义： 代码初始化块，属于类中的成员，是类的一部分，类似与方法，将逻辑语句在{}之内。
 * 和方法不同的是，无方法名，无返回，无参数，在加载类或者创建对象时隐式调用。
 * <p>
 * 2. [修饰符] {代码}，修饰符可选，要写只能写static
 * <p>
 * 3. 代码块可分为两类，
 * (1).使用static修饰的叫静态代码块，随着类的加载而执行，且只会执行一次,类加载机制详细
 * 不在此块解释,主要针对于类的初始化,下记参见
 * {@link CodeBlockStarter#staticBlockTestByInstance()}
 * {@link CodeBlockStarter#staticBlockTestByProperty()}
 * {@link CodeBlockStarter#staticBlockTestByMethod()}
 * <p>
 * (2). 没有使用static修饰的叫普通代码块，随着对象的创建而执行(隐式执行)。
 * ① 相当于另外一种类型的构造器（对构造器的补充），可以做初始化操作。
 * ② 若多个构造器中都有重复语句，可以抽取到初始化块中，提高代码的复用性。
 * 参见{@link CodeBlockStarter#blockTest()}
 * <p>
 * 4.代码块的调用顺序：
 * (1). 调用静态代码块和静态属性初始化：静态代码块和静态属性初始化的优先级一样，
 * 若存在多个静态代码块和多个静态变量初始化时,则按定义的顺序调用。
 * 参见{@link CodeBlockStarter#execStaticSort}
 * <p>
 * (2). 调用普通代码块和普通属性初始化(注意：普通代码块和普通属性初始化的优先级一样，
 * 若存在多个普通代码块和普通属性初始化，则按照定义顺序调用）。
 * 参见{@link CodeBlockStarter#execSort()}
 * <p>
 * (3). 调用构造方法
 * 参见{@link CodeBlockStarter#execSort()}
 * <p>
 * 4. 构造器隐式调用了super()和普通代码块，静态相关的代码块、属性初始化在类加载时执行完
 * 毕，因此其优于构造器和普通代码块的执行。
 * 参见 {@link CodeBlockStarter#allExecSort()}
 * <p>
 * 5.总结：创建一个子类对象(存在继承关系)时，他们的静态代码块，静态属性初始化，普通代码
 * 块，普通属性初始化，构造方法的调用顺序如下：
 * ①.父类的静态代码块和静态属性初始化（优先级一样，按照代码的顺序执行）
 * ②.子类的静态代码块和静态属性初始化（优先级一样，按照代码的顺序执行）
 * ③.父类的普通代码块和属性初始化（优先级一样，按照代码的顺序执行）
 * ④.父类的构造方法
 * ⑤.子类的普通代码块和属性初始化（优先级一样，按照代码的顺序执行）
 * ⑥.子类的构造方法
 * 参见{@link CodeBlockStarter#allExecSort()}
 *
 * 6. 静态代码只能调用静态成员,普通代码块可以调用任意成员。
 */
public class CodeBlockStarter {

	@Test
	public void blockTest() {
		new BlockDemo("你好,李焕英");
		new BlockDemo("你好,李焕英", 4000);
		new BlockDemo("你好,李焕英", 4000, "贾玲");
	}

	@Test
	public void staticBlockTestByInstance() {
		SubStaticBlock subStaticBlock = new SubStaticBlock();
		subStaticBlock = new SubStaticBlock();
	}


	@Test
	public void staticBlockTestByProperty() {
		int staticProperty = SubStaticBlock.staticProperty;
	}

	@Test
	public void staticBlockTestByMethod() {
		SubStaticBlock.staticMethod();
	}


	@Test
	public void execStaticSort() {
		BaseStaticBlock.getStaticDefault2();
	}

	@Test
	public void execSort() {
		BaseStaticBlock baseStaticBlock = new BaseStaticBlock();
	}


	@Test
	public void allExecSort() {
		Sub sub = new Sub();
	}
}

