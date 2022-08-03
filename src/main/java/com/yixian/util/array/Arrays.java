package com.yixian.util.array;

public final class Arrays {

	/**
	 * 在有序数组中添加一个元素。
	 *
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int[] insertCopy(int[] arr, int value) {
		if (arr == null || arr.length == 0) {
			int[] result = {value};
			return result;
		}

		int length = arr.length;
		int[] result = new int[length + 1];
		int index = length;
		// 确定插入的位置
		for (int i = 0; i < length; i++) {
			if (value <= arr[i]) {
				index = i;
				break;
			}
		}
		System.arraycopy(arr, 0, result, 0, index);
		result[index] = value;
		System.arraycopy(arr, index, result, index + 1, length - index);
		return result;
	}

	/**
	 * 在有序数组中添加一个元素。
	 *
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int[] insertDeepCopy(int[] arr, int value) {
		if (arr == null || arr.length == 0) {
			int[] result = {value};
			return result;
		}

		int length = arr.length;
		int[] result = new int[length + 1];
		int index = length;
		// 确定插入的位置
		for (int i = 0; i < length; i++) {
			if (value <= arr[i]) {
				index = i;
				break;
			}
		}

		for (int i = 0, j = 0; i < length + 1; i++) {
			if (index == i) {
				result[i] = value;
			} else {
				result[i] = arr[j++];
			}
		}
		return result;
	}
}
