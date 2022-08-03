package com.yixian.basics.oop.polymorphic;

import com.yixian.basics.oop.polymorphic.pojo.Base;
import com.yixian.basics.oop.polymorphic.pojo.Master;
import com.yixian.basics.oop.polymorphic.pojo.Sub;
import com.yixian.basics.oop.polymorphic.pojo.animal.Animal;
import com.yixian.basics.oop.polymorphic.pojo.animal.Cat;
import com.yixian.basics.oop.polymorphic.pojo.animal.Dog;
import com.yixian.basics.oop.polymorphic.pojo.animal.Pig;
import com.yixian.basics.oop.polymorphic.pojo.food.Bone;
import com.yixian.basics.oop.polymorphic.pojo.food.Fish;
import com.yixian.basics.oop.polymorphic.pojo.food.Food;
import com.yixian.basics.oop.polymorphic.pojo.food.Rice;
import com.yixian.basics.oop.classes.keywords.instanceof_.InstanceofStarter;
import org.junit.Test;

/**
 * 多态学习引导类
 * 1.释义 ： 方法和对象具有多种形态，面向对象的第三大特征，多态建立在继承和封装的基础
 * 之上。
 * <p>
 * 2.体现：
 * ----------------------------------方法对态-----------------------------------
 * (1).方法多态 : 重写和重载就体现出多态。
 * 重写体现：详细参见{@link PolymorphismStarter#sayTest()}
 * 请仔细查看{@link Base#say()}和{@link Sub#say()},并且仔细观察两个类的关系。
 * <p>
 * 重载体现：详细参见{@link PolymorphismStarter#sayParamTest()}
 * 请仔细查看{@link Base#say()}和{@link Base#say(String, int)},
 * 并且仔细观察两个方法的关系。
 * <p>
 * ----------------------------------对象对态-----------------------------------
 * (2).对象多态 : 向上转型
 * ① 一个对象的编译类型和运行类型可以不一致，
 * ② 编译类型在定义对象时，就确定了，不能改变。
 * ③ 运行类型是可以改变的。
 * ④ 编译类型看定义时 = 左边，运行类型看 = 右边
 * 详细参见{@link PolymorphismStarter#cryTest()}
 * 请仔细查看{@link Animal#cry()}和{@link Dog#cry()}和{@link Cat#cry()},
 * 并且仔细观察上述三个类、和三个方法的关系。
 * <p>
 * 3.作用 ：提高代码复用型，利于维护。
 * <p>
 * 4.细节 ： 前提是两个对象(的类)存在继承关系。
 * <p>
 * 5.向上转型：
 * (1) 本质： 父类[基类、派生类]对象指向子类[派生类]的对象
 * (2) 语法： 父类类型 引用名 = new 子类类型();
 * (3) 特点：
 * 编译看左边，运行看右边
 * 可以调用父类的所有成员（需遵循访问权限）
 * 不能调用子类他有成员（属性和方法）
 * 最终运行结果看子类的具体实现。
 * 详细参见{@link PolymorphismStarter#upCastTest()}
 * 请仔细查看{@link AnimalByUseCast}和{@link CatByUseCast},
 * 并且仔细观察上述两个类关系。
 * <p>
 * 6.向下转型：
 * (1).语法 ：子类类型 引用名 = （子类类型）父类引用；
 * (2).只能强转父类引用，不能强转父类对象；
 * (3).父类引用必须指向的是当前目标类型的对象；
 * (4).可以调用子类类型的所有成员（需遵循访问权限）。
 * 详细参见{@link PolymorphismStarter#downCastTest()}
 * 请仔细查看{@link AnimalByUseCast}和{@link CatByUseCast},
 * 并且仔细观察上述两个类关系。
 *
 * 7.注：属性没有重写之说，只看编译类型，getter方法和setter属于方法.
 * 请参见{@link PolymorphismStarter#propertyTest()}

 * <p>
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 多态快速入门
 * @create : 2022-06-04 23:33
 */
public class PolymorphismStarter {

	static Master master = new Master("小名");

	static Cat cat = new Cat("小猫");
	static Dog dog = new Dog("小狗");
	static Pig pig = new Pig("小猪");

	static Fish fish = new Fish("鱼");
	static Bone bone = new Bone("骨头");
	static Rice rice = new Rice("米饭");

	/**
	 * 调用主人喂食，多态优化前,执行结果
	 * <p>
	 * {@link Master#feedBeforeOptimization(Cat, Fish)}
	 * {@link Master#feedBeforeOptimization(Dog, Bone)}
	 * {@link Master#feedBeforeOptimization(Pig, Rice)}
	 */
	@Test
	public void feedBeforeOptimizationOfMasterTest() {
		master.feedBeforeOptimization(cat, fish);
		master.feedBeforeOptimization(dog, bone);
		master.feedBeforeOptimization(pig, rice);
	}


	/**
	 * 调用主人喂食，多态优化后，运行结果
	 * <p>
	 * {@link Master#feedOptimized(Animal, Food)}
	 */
	@Test
	public void feedAfterOfMasterTest() {
		master.feedOptimized(cat, fish);
		master.feedOptimized(dog, bone);
		master.feedOptimized(pig, rice);
	}

	// ----------------------------方法的多态-----------------------------------

	/**
	 * 多态的方法重写体现。
	 * 请仔细查看{@link Base#say()}和{@link Sub#say()},并且仔细观察两个类的关系。
	 */
	@Test
	public void sayTest() {
		Base base = new Base();
		Sub sub = new Sub();
		base.say();
		base.say("jack", 23);
		sub.say();
	}

	/**
	 * 多态的方法重载体现。
	 * 请仔细查看{@link Base#say(String, int)} ()}和
	 * {@link Sub#say()},
	 */
	@Test
	public void sayParamTest() {
		Base base = new Base();
		base.say();
		base.say("jack", 23);
	}

	// ----------------------------对象的多态-----------------------------------
	@Test
	public void cryTest() {
		Animal animal = new Dog("拉布拉多");
		animal.cry();
		animal = new Cat("布偶");
		animal.cry();
	}

	/**
	 * 向上转型。
	 */
	@Test
	public void upCastTest() {
		AnimalByUseCast animalByUseCast =
			new CatByUseCast("小猫猫", 2);
		Object obj = new CatByUseCast("小猫猫", 2);
		animalByUseCast.eat();
		animalByUseCast.run();
		animalByUseCast.show();
		animalByUseCast.run();
	}

	/**
	 * 向下转型。
	 */
	@Test
	public void downCastTest() {
		AnimalByUseCast animalByUseCast =
			new CatByUseCast("小猫猫", 2);
		Object obj = new CatByUseCast("小猫猫", 2);
		/**
		 * .......执行了n多语句，或者是传递过来的参数
		 * instanceof 关键字的使用参见{@link InstanceofStarter}
		 *
		 */
		if (animalByUseCast instanceof CatByUseCast)
			((CatByUseCast) animalByUseCast).catchMouse();

		/**
		 * 此处会报错{@link java.lang.ClassCastException},验证了(3)
		 */
		if (animalByUseCast instanceof DogByUseCast)
			((DogByUseCast) animalByUseCast).catchMouse();
	}

	@Test
	public void propertyTest() {
		AnimalByUseCast animalByUseCast =
			new CatByUseCast("小猫猫", 2);
		System.out.println(animalByUseCast.count);
	}

}

