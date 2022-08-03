package com.yixian.basics.type.numbers.booleans.synchronize;

import com.yixian.util.StringUtils;
import com.yixian.util.aboutmethod.MethodType;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * 包装器{@link Boolean}的线程安全类{@link AtomicBoolean}。
 * 安全机制为CAS。预估值，
 */
public class AtomicBooleanDemo extends AbstractTestTemplate<AtomicBoolean> {

	public static volatile AtomicBoolean trueAtomicBoolean =
		new AtomicBoolean(true);

	public static volatile AtomicBoolean falseAtomicBoolean =
		new AtomicBoolean(false);

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		System.out.println(trueAtomicBoolean.toString() + ".get() : " +
			trueAtomicBoolean.get());
		System.out.println(trueAtomicBoolean.toString() + ".toString() : " +
			trueAtomicBoolean.toString());
		/**
		 * {@link AtomicBoolean#compareAndSet(boolean, boolean)}第一个参数
		 * 为预估值，第二个参数为更新值，若预估值==当前值，则将当前值设置为更新值，
		 * 返回true，否则，返回false
		 */
		System.out.println(falseAtomicBoolean.toString() +
			".compareAndSet([boolean]true,[boolean]true) : " +
			falseAtomicBoolean.compareAndSet(true, true) +
			", 当前值：" + falseAtomicBoolean);

		System.out.println(falseAtomicBoolean.toString() + ".compareAndSet([boolean]false,[boolean]true) : " +
			falseAtomicBoolean.compareAndSet(false, true) + ", 当前值：" + falseAtomicBoolean);

		falseAtomicBoolean = new AtomicBoolean(false);
		System.out.println(falseAtomicBoolean.toString() + ".compareAndSet([boolean]false,[boolean]false) : " +
			falseAtomicBoolean.compareAndSet(false, false) + ", 当前值：" + falseAtomicBoolean);


		System.out.println(trueAtomicBoolean.toString() + ".compareAndSet([boolean]false,[boolean]false) : " +
			trueAtomicBoolean.compareAndSet(false, false) + ", 当前值：" + trueAtomicBoolean);

		System.out.println(trueAtomicBoolean.toString() + ".compareAndSet([boolean]true,[boolean]false) : " +
			trueAtomicBoolean.compareAndSet(true, false) + ", 当前值：" + trueAtomicBoolean);

		trueAtomicBoolean = new AtomicBoolean(true);

		System.out.println(trueAtomicBoolean.toString() + ".compareAndSet([boolean]true,[boolean]true) : " +
			trueAtomicBoolean.compareAndSet(true, true) + ", 当前值：" + trueAtomicBoolean);

		/**
		 * {@link AtomicBoolean#getAndSet(boolean)}更新值，并返回更新之前的值
		 */
		System.out.println(trueAtomicBoolean.toString() + ".getAndSet([boolean]false) : " +
			trueAtomicBoolean.getAndSet(false) + ", 当前值：" + trueAtomicBoolean);

		/**
		 * {@link AtomicBoolean#set(boolean)}无条件更新为设定值
		 */
		trueAtomicBoolean = new AtomicBoolean(true);
		trueAtomicBoolean.set(false);
		System.out.println(trueAtomicBoolean.toString());

		trueAtomicBoolean.lazySet(false);

		trueAtomicBoolean.weakCompareAndSet(true, false);
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		if (!staticMethodsFlag()) {
			System.out.println(AtomicBoolean.class.getTypeName() + "没有静态方法");
			return;
		}
	}

	public static boolean staticMethodsFlag() {
		Method[] declaredMethods = AtomicBoolean.class.getDeclaredMethods();
		if (declaredMethods == null) {
			System.out.println(AtomicBoolean.class.getTypeName() + "没有静态方法");
			return false;
		}
		for (Method method : declaredMethods) {
			if (method == null || StringUtils.isBlank(method.toString())) {
				continue;
			}
			if (method.toString().contains(MethodType.STATIC_METHOD_TYPE.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void constructorsOfThis() {
		if (!constructorsFlag()) {
			System.out.println(AtomicBoolean.class.getTypeName() + "没有构造方法");
			return;
		}
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		AtomicBoolean trueAtomicBoolean = new AtomicBoolean(true);
		AtomicBoolean falseAtomicBoolean = new AtomicBoolean(false);
	}

	public static boolean constructorsFlag() {
		Constructor<?>[] constructors = AtomicBoolean.class.getConstructors();
		if (constructors == null) {
			System.out.println(AtomicBoolean.class.getTypeName() + "没有构造方法");
			return false;
		}
		for (Constructor constructor : constructors) {
			if (constructor == null || StringUtils.isEmpty(constructor.toString())) {
				continue;
			}
			if (constructor.toString().contains(MethodType.PUBLIC_METHOD_TYPE.getName())) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new AtomicBooleanDemo());
	}

}