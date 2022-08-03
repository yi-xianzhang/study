package com.yixian.basics.oop.polymorphic.dynamic_;

import com.yixian.basics.oop.polymorphic.PolymorphismStarter;
import org.junit.Test;

/**
 * 动态绑定机制学习引导类，在以后的Jdk学习和框架学习中尤为重要。
 * <p>
 * 1. 当调用对象时，该方法会和该对象的内存地址/运行类型绑定。
 * 2. 当对象调用属性时，没有动态绑定机制，哪里声明，那里使用，
 * 也就是说会和编译类型绑定。
 *
 *
 * 3.多态数组
 *
 * 4.多态参数  参见{@link PolymorphismStarter#feedAfterOfMasterTest()}
 * <p>
 * 具体参照{@link DynamicBindingStarter#starterTest()}
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 动态绑定机制
 * @create : 2022-06-07 21:36
 */
public class DynamicBindingStarter {

	/**
	 * 1.入门测试。查看运行结果。
	 * 很简单吧，
	 * 2.在尝试将子类的{@link Sub#sumByGet()}注释，在查看运行结果。
	 * 3.再次尝试将子类的{@link Sub#sumByProperty()} 注释，查看运行结果。
	 * 3.再次尝试将子类的{@link Sub#age} 注释，查看运行结果。
	 */
	@Test
	public void starterTest() {
		Base base = new Sub();  // 向上转型
		System.out.println(base.sumByGet());
		System.out.println(base.sumByProperty());
	}

	@Test
	public void arrayTest() {

		Person[] persons = getPerson();
		for (Person person : persons) {
			System.out.println(person.say()); // 存在动态绑定机制
		}
	}


	public static Person[] getPerson() {
		Person person = new Person("段誉",80);
		Student student = new Student("杨过",45,80);
		Student student2 = new Student("郭靖",45,80);
		Teacher teacher = new Teacher("江南七怪",45,4000);
		Teacher teacher2 = new Teacher("洪七公",45,240000);
		return new Person[] {
			person,
			student,
			student2,
			teacher,
			teacher2
		};
	}

	@Test
	public void test() {
		Person[] persons = getPerson();
		for (Person person : persons) {

			if (person == null) {
				continue;
			}
			if (person instanceof Student) {
				System.out.println(((Student) person).study());
				continue;
			}

			if (person instanceof Teacher) {
				System.out.println(((Teacher) person).teach());
				continue;
			}
			System.out.println(person.say());
		}
	}

}

