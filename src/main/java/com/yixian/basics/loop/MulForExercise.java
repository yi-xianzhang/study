package com.yixian.basics.loop;

import org.junit.Test;

import java.util.Scanner;

/**
 * 训练多重循环
 */
public class MulForExercise {

	/**
	 * 键盘输入三个班的成绩，每个班5名同学，求各班的平均数和所有班级的平均分。
	 * [学生成级从键盘输入]
	 */
	public static void test01() {
		Scanner scanner = new Scanner(System.in);
		int countHj = 0;
		double sumHj = 0;
		for (int j = 1; j <= 3; j++) {
			int count = 0;
			double sum = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("请输入第" + j + "个班" + "第" + i +
					"个学生的成绩");
				double score = scanner.nextDouble();
				sum += score;
				count++;
			}
			sumHj += sum;
			countHj += count;
			System.out.println("第" + j + "班的平均分为" + sum / count);
		}
		System.out.println("总班的平均分为" + sumHj / countHj);
	}

	public static void main(String[] args) {
		test01();
	}

	/**
	 * 打印空心金字塔
	 */
	@Test
	public void print() {

		int totalLevel = 7;
		for (int index = 1; index <= totalLevel; index++) {
			// 表示前面的空格
			for (int j = 0; j < totalLevel - index; j++) {
				System.out.print(" ");
			}
			// 打印*
			for (int i = 1; i <= 2 * index - 1; i++) {
				if (i == 1 || i == 2 * index - 1 || index == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * 打印空心金字塔
	 */
	@Test
	public void print2() {
		int totalLevel = 7;
		for (int index = 1; index <= totalLevel; index++) {
			// 表示前面的空格
			for (int j = 0; j < totalLevel - index; j++) {
				System.out.print(" ");
			}
			// 打印
			for (int i = 1; i <= 2 * index - 1; i++) {
				if (i == 1 || i == 2 * index - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int index = totalLevel - 1; index > 0; index--) {
			// 表示前面的空格
			for (int j = 0; j < totalLevel - index; j++) {
				System.out.print(" ");
			}
			// 打印*
			for (int i = 1; i <= 2 * index - 1; i++) {
				if (i == 1 || i == 2 * index - 1 || index == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * 随机生成97，观察循环次数
	 */
	@Test
	public void getNumber97() {
		int number = 97;
		int counts = 0;
		while (true) {
			counts++;
			int numbers = (int) (Math.random() * 100) + 1;
			System.out.println("次数:" + counts + ",随机数:" + numbers);
			if (numbers == number) {
				break;
			}
		}
		System.out.println("总计循环获取随机数" + number + "次数:" + counts);
	}

	@Test
	public void payFor() {
		double money = 100000;
		int count = 0;
		while (true) {

			if (money < 1000) {
				break;
			}

			if (money <= 50000) {
				money -= 1000;
			} else {
				money *= 0.95;
			}
			count++;
		}
		System.out.println(count + "," + money);
	}

	@Test
	public void numberOfDaffodils() {
		for (int i = 100; i < 1000; i++) {
			int bai = i / 100;
			int shi = i / 10 % 10;
			int ge = i % 10;

			if (i == (bai * bai * bai + shi * shi * shi + ge * ge * ge)) {
				System.out.println(i);
			}
		}
	}

	@Test
	public void test() {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}

	@Test
	public void printAzhiZ() {
		int count = 0;
		for (char i = 65; i <= 122; i++) {
			System.out.print(i + "\t");
			if (i == 90) {
				i += 6;
			}
			count++;
			if (count % 26 == 0) {
				System.out.println();
			}
		}
	}

	/**
	 * 求1 - 1/2 + 1/3 -1/4 ... 1 / 100
	 */
	@Test
	public void test8() {
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= 1.0 / i;
			} else {
				sum += 1.0 / i;
			}
		}
		System.out.println(sum);
	}

	@Test
	public void test9() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
	}
}


