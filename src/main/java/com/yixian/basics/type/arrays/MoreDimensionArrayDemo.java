package com.yixian.basics.type.arrays;

import com.yixian.util.array.Arrays;
import org.junit.Test;


public class MoreDimensionArrayDemo {

	@Test
	public void twoDimensionArray() {
		// TODO 二维数组动态赋值
		int[][] twoDimension = new int[19][];
		for (int i = 0; i < twoDimension.length; i++) {
			twoDimension[i] = new int[i + 1];
			;
			for (int j = 0; j < twoDimension[i].length; j++) {
				twoDimension[i][j] = i + 1;
			}
		}
		for (int i = 0; i < twoDimension.length; i++) {
			for (int j = 0; j < twoDimension[i].length; j++) {
				System.out.print(twoDimension[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Test
	public void sumOfTwoDimensionArray() {
		// TODO 二维数组静态赋值
		int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}

	@Test
	public void triangleOfYangHui() {
		int[][] triangleOfYangHui = new int[10][];
		for (int i = 0; i < triangleOfYangHui.length; i++) {
			triangleOfYangHui[i] = new int[i + 1];
			for (int j = 0; j < triangleOfYangHui[i].length; j++) {
				//
				if (j == 0 || j == triangleOfYangHui[i].length - 1) {
					triangleOfYangHui[i][j] = 1;
				} else {
					triangleOfYangHui[i][j] = triangleOfYangHui[i - 1][j] +
						triangleOfYangHui[i - 1][j - 1];
				}
			}
		}


		for (int i = 0; i < triangleOfYangHui.length; i++) {
			for (int j = 0; j < triangleOfYangHui[i].length; j++) {
				System.out.print(triangleOfYangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}

	@Test
	public void test() {
		int arr[] = {10, 12, 45, 90};
		int insertNumber = 67;
		int[] ints = Arrays.insertCopy(arr, insertNumber);
		System.out.println("深拷贝：" + java.util.Arrays.toString(
			Arrays.insertDeepCopy(arr, insertNumber)));
		System.out.println("深拷贝：" + java.util.Arrays.toString(ints));

	}




}
