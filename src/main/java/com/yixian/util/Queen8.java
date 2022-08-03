package com.yixian.util;

public class Queen8 {
	//定义一个max 有多少皇后
	int max = 8;
	//定义数组array。保存保存八皇后放置的位置结果
	//比如：arr = { 0 , 4, 7,5,2,6,1,3}
	int[] array = new int[max];
	static int count;
	static int judgeCount;

	public static void main(String[] args) {
		new Queen8().check(0);
		System.out.println("解法:" + count);
		System.out.println("一共判断次数：" + judgeCount);
	}

	//编写一个方法 放置第N个皇后
	private void check(int n) {
		if (n == max) { // n = 8 时 其实8个皇后已经放好了
			print(); //输出结果
			return;
		}
		//依次放入皇后 并判断是否冲突
		for (int i = 0; i < max; i++) {
			//先把当前这个皇后 n 放到改行的第1列
			array[n] = i;
			//判断放置的第N个皇后的i列时 是否冲突
			if (judge(n)) //不冲突
				//接着放N+1个皇后 开始递归
				check(n + 1);
			//如果冲突 继续执行 array[n] = i; 放置在本行的后移一个位置
		}
	}

	//查看当我们放置第N个皇后的时候，就去检测是否冲突
	//n 表示放第n个皇后 n从0开始 范围为 0-7 表示8个皇后
	private boolean judge(int n) {
		judgeCount++;
		for (int i = 0; i < n; i++)
			//同一列                   同一斜线 斜率相除为1 故表达式相等
			if (array[i] == array[n] ||
				Math.abs(n - i) == Math.abs(array[i] - array[n]))
				return false;
		return true;
	}

	//方法：将皇后摆放的位置输出
	private void print() {
		count++;
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
