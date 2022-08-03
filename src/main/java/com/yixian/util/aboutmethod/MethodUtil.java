package com.yixian.util.aboutmethod;

import com.yixian.util.aboutclass.ClassUtil;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MethodUtil {

	/**
	 * 获取tClass类的所有方法。
	 *
	 * @param tClass
	 * @return
	 * @throws IllegalAccessException
	 */
	public static final Set<Method> getAllMethods(Class tClass) {

		Set<Class> allSuperClassAndInterface = ClassUtil
			.getAllSuperClassAndInterface(tClass);

		Set<Method> methods = new LinkedHashSet<>();
		for (Class tempClass : allSuperClassAndInterface) {
			Method[] tempMethods = tempClass.getDeclaredMethods();
			methods.addAll(Arrays.asList(tempMethods));
		}
		return methods;
	}

	/**
	 * 获取tClass类的所有非抽象方法。
	 *
	 * @param tClass
	 * @return
	 * @throws IllegalAccessException
	 */
	public static final Set<Method> getAllMethodsOfNoAbstract(Class tClass) {

		Set<Class> allSuperClassAndInterface = ClassUtil
			.getAllSuperClassAndInterface(tClass);
		Set<Method> methods = new LinkedHashSet<>();
		for (Class tempClass : allSuperClassAndInterface) {
			Method[] tempMethods = tempClass.getDeclaredMethods();
			if (tempMethods != null && tempMethods.length > 0) {
				for (Method method : tempMethods) {
					if (method == null || method.toString()
						.contains(MethodType.ABSTRACT_METHOD_TYPE.getName())) {
						continue;
					} else {
						methods.add(method);
					}
				}
			}
		}
		return methods;
	}


	/**
	 * 获取tClass类的所有方法。
	 *
	 * @param tClass      tClass类对象。
	 * @param methodTypes methodType的属性
	 * @return
	 * @throws IllegalAccessException
	 */
	public static final Set<Method> getAllMethodsByParams(Class tClass,
	                                                      Set<MethodType> methodTypes) {

		Set<Class> allSuperClassAndInterface =
			ClassUtil.getAllSuperClassAndInterface(tClass);

		Set<Method> methods = new LinkedHashSet<>();
		for (Class tempClass : allSuperClassAndInterface) {
			Method[] tempMethods = tempClass.getDeclaredMethods();
			if (tempMethods != null && tempMethods.length > 0) {
				for (Method method : tempMethods) {
					boolean flag = true;
					for (MethodType methodType : methodTypes) {
						if (!method.toString().contains(methodType.getName())) {
							flag = false;
							break;
						} else {
							flag = true;
							continue;
						}
					}
					if (flag) {
						methods.add(method);
					}
				}
			}
		}
		return methods;
	}

	/**
	 * 获取tClass类的所有方法。
	 *
	 * @param tClass      tClass类对象。
	 * @param methodTypes methodType的属性
	 * @return
	 * @throws IllegalAccessException
	 */
	public static final Set<Method> getAllMethodsByNoParams(Class tClass,
	                                                        Set<MethodType> methodTypes) {
		Set<Class> allSuperClassAndInterface =
			ClassUtil.getAllSuperClassAndInterface(tClass);
		Set<Method> methods = new LinkedHashSet<>();
		for (Class tempClass : allSuperClassAndInterface) {
			Method[] tempMethods = tempClass.getDeclaredMethods();
			if (tempMethods != null && tempMethods.length > 0) {
				label:
				for (Method method : tempMethods) {
					boolean flag = false;
					for (MethodType methodType : methodTypes) {
						if (method.toString().contains(methodType.getName())) {
							flag = true;
							continue label;
						}
					}

					if (!flag) {
						methods.add(method);
					}
				}
			}
		}
		return methods;
	}

	/**
	 * 获取tClass的父类和父接口成员方法。
	 *
	 * @param tClass
	 * @return
	 * @throws IllegalAccessException
	 */
	public static final Set<Method> getAllInstanceMethods(Class tClass) {
		Set<MethodType> methodTypes = new LinkedHashSet<>();
		methodTypes.add(MethodType.STATIC_METHOD_TYPE);
		return getAllMethodsByNoParams(tClass, methodTypes);
	}

	/**
	 * 获取tClass的父类和父接口静态方法。
	 *
	 * @param tClass 类型
	 * @return 返回值
	 * @throws IllegalAccessException 异常
	 */
	public static final Set<Method> getAllStaticMethods(Class tClass) {
		Set<MethodType> methodTypes = new LinkedHashSet<>();
		methodTypes.add(MethodType.STATIC_METHOD_TYPE);
		return getAllMethodsByParams(tClass, methodTypes);
	}
}
