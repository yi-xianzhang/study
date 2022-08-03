package com.yixian.basics.oop.interfaces;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Method> result = new HashSet<Method>();
		for (Method m : TestInterface.class.getMethods()) {
			result.add(m);
		}

		Iterator<Method> iterator = result.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("TestInterface.class.getSuperclass() :" +
			TestInterface.class.getSuperclass());

		System.out.println(TestInterface.class.getInterfaces().length);
		for (Class clazz : TestInterface.class.getInterfaces()) {
			System.out.println("TestInterface.class.getSuperclass() :" +
				clazz.getName());
		}


	}
}
