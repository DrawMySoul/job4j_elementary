package ru.job4j.array;

public class ArrayLoop {
	public static void main(String[] args) {
		int[] array = new int[5];

		for (int index = 0; index < array.length; index++) {
			array[index] = index * 2 + 3;
		}

		for (int value : array) {
			System.out.println(value);
		}
	}
}
