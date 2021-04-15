package ru.job4j.array;

public class ArrayDefinition {
	public static void main(String[] args) {
		short[] ages = new short[10];
		String[] surnames = new String[100500];
		float[] pries = new float[40];

		System.out.println("Размер массива ages равен " + ages.length);
		System.out.println("Размер массива surnames равен " + surnames.length);
		System.out.println("Размер массива pries равен " + pries.length);

		String[] names = new String[4];
		names[0] = "Tom";
		names[1] = "Jack";
		names[2] = "Mike";
		names[3] = "John";

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
