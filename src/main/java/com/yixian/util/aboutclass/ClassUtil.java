package com.yixian.util.aboutclass;

import java.util.*;

public final class ClassUtil {

	/**
	 * 获取某一个Class类的所有父类Class对象。
	 *
	 * @param tClass 类的Class对象
	 * @return 所有父类Class对象
	 * @throws IllegalAccessException
	 */
	public static Set<Class> getSuperClass(Class tClass)
		throws IllegalAccessException {

		return getSuperClassOrInterface(tClass, ClassType.CLASS_TYPE);
	}

	/**
	 * 获取某一个Class类的所有父接口Class对象。
	 *
	 * @param tClass 类的Class对象
	 * @return 所有父类Class对象
	 * @throws IllegalAccessException
	 */
	public static final Set<Class> getSuperInterfaces(Class tClass)
		throws IllegalAccessException {

		return getSuperClassOrInterface(tClass, ClassType.INTERFACE_TYPE);
	}

	/**
	 * 获取某一个Class类的所有父接口/父类的Class对象。
	 *
	 * @param tClass    类的Class对象
	 * @param classType 通过{@link ClassType}类型的变量指定获取的是父接口还是父类。
	 * @return 所有父类/父接口Class对象
	 * @throws IllegalAccessException
	 */
	public static final Set<Class> getSuperClassOrInterface(Class tClass,
	                                                        ClassType classType)
		throws IllegalAccessException {

		if (classType == null) {
			throw new NullPointerException(ClassType.class.getName() +
				"类型参数不能为空！");
		}

		if (tClass == null) {
			throw new NullPointerException(tClass.getName() + "类型参数不能为空！");
		}


		Set<Class> genericInterfacesClasses = new LinkedHashSet<>();
		if (classType == ClassType.CLASS_TYPE) {
			Class tempClass = tClass;
			while (true) {
				if (tempClass.equals(Object.class)) {
					genericInterfacesClasses.add(tempClass);
					tempClass = tempClass.getSuperclass();
					break;
				} else {
					genericInterfacesClasses.add(tempClass);
					tempClass = tempClass.getSuperclass();
				}
			}
			return genericInterfacesClasses;
		} else if (classType == ClassType.INTERFACE_TYPE) {
			// 获取tclass的所有父接口
			getSuperInterface(tClass, genericInterfacesClasses);
			// 获取tclass的所有父类
			Set<Class> genericClasses = new LinkedHashSet<>();
			Class tempClass = tClass;
			while (true) {
				if (tempClass.equals(Object.class)) {
					genericClasses.add(tempClass);
					tempClass = tempClass.getSuperclass();
					break;
				} else {
					genericClasses.add(tempClass);
					tempClass = tempClass.getSuperclass();
				}
			}
			// 获取获取tClass的所有父类的父接口
			for (Class team2Class : genericClasses) {
				getSuperInterface(team2Class, genericInterfacesClasses);
			}
			return genericInterfacesClasses;
		} else {
			throw new IllegalAccessException(ClassType.class.getName() + "类型参数不匹配！");
		}
	}


	private static void getSuperInterface(Class tClass,
	                                      Set<Class> genericInterfacesClasses) {

		// 递归获取父类实现的接口
		Class[] interfaces = tClass.getInterfaces();
		if (interfaces != null && interfaces.length > 0) {
			for (Class tempClass : interfaces) {
				genericInterfacesClasses.add(tempClass);
				getSuperInterface(tempClass, genericInterfacesClasses);
			}
		}
	}

	/**
	 * 获取某一个Class类的所有父接口/父类的Class对象。
	 *
	 * @param tClass 类的Class对象
	 * @return 所有父类/父接口Class对象
	 * @throws IllegalAccessException
	 */
	public static final Set<Class> getAllSuperClassAndInterface(Class tClass) {
		if (tClass == null) {
			throw new NullPointerException(tClass.getName() + "类型参数不能为空！");
		}
		Set<Class> genericInterfacesClasses = new LinkedHashSet<>();

		// 获取tClass的所有父接口
		getSuperInterface(tClass, genericInterfacesClasses);
		// 获取tClass的所有父类
		Set<Class> genericClasses = new LinkedHashSet<>();
		Class tempClass = tClass;
		while (true) {
			genericClasses.add(tempClass);
			genericInterfacesClasses.add(tempClass);
			if (tempClass == null) {
				continue;
			}
			if (tempClass.equals(Object.class)) {
				tempClass = tempClass.getSuperclass();
				break;
			} else {
				tempClass = tempClass.getSuperclass();
			}
		}
		// 获取获取tClass的所有父类的父接口
		for (Class team2Class : genericClasses) {
			getSuperInterface(team2Class, genericInterfacesClasses);
		}
		return genericInterfacesClasses;
	}

}
