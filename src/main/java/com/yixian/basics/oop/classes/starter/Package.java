package com.yixian.basics.oop.classes.starter;

import org.junit.Test;

import java.util.Arrays;

/**
 * Java学习之包 </br>
 * 1.基本语法 ： package + 包名 </br>
 * 2.本质： 创建不同的文件夹来管理类文件。</br>
 * 3.包名命名规范：
 *    只能包含数字、字母、下划线、小圆点，但不能以数字开头，并且不能是关键字和保留字。；
 *     一般地：是小写字母 + 小圆点，一般为：com.公司名.项目名.业务模块名
 * 4.package作用 : 声明当前类所在的包，需要放在类的最上方，至多仅有一句packeage
 *                 import 放在package的下面，可以有多句，无顺序
 *                 具体参照本类
 * @program : JavaSeStudy
 * @description : 包的使用与学习
 * @author : zhang_yx
 * @create : 2022-06-04 17:48
 * @version : 1.0.0
 *
 */
public class Package {

	@Test
	public void arrSort() {
		int[] arr = new int[]{12,23,34};
		Arrays.sort(arr);
		// 输出结构
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}

