package ru.job4j.converter;

public class Converter {
	public static int rubleToEuro(int value) {
		return value / 70;

	}

	public static int rubleToDollar(int value) {
		return value / 60; /* формула перевода рублей в доллары. */
	}

	public static void main(String[] args) {
		int in = 140;
		int expected = 2;
		int out = Converter.rubleToEuro(in);
		boolean passed = expected == out;
		System.out.println("140 rubles are 2 euro. Test result : " + passed);

		int dollarIn = 180;
		int dollarExpected = 3;
		int dollarOut = Converter.rubleToDollar(dollarIn);
		boolean dollarPassed = dollarExpected == dollarOut;
		System.out.println("180 rubles are 3 dollar. Test result : " + dollarPassed);
	}
}