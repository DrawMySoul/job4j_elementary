package ru.job4j.array;

public class Merge {
	public static int[] merge(int[] left, int[] right) {
		int[] rsl = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int rslIndex = 0;

		while (leftIndex < left.length && rightIndex < rsl.length) {
			if (left[leftIndex] < right[rightIndex]) {
				rsl[rslIndex++] = left[leftIndex++];
			} else {
				rsl[rslIndex++] = right[rightIndex++];
			}
		}

		if (leftIndex < left.length) {
			for (; leftIndex < left.length; leftIndex++) {
				rsl[rslIndex++] = left[leftIndex];
			}
		} else if (rightIndex < right.length) {
			for (; rightIndex < right.length; rightIndex++) {
				rsl[rslIndex++] = right[rightIndex];
			}
		}
		return rsl;
	}
}
