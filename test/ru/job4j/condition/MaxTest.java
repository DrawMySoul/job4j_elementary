package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

	@Test
	public void whenMax1To2Then2() {
		int left = 1;
		int right = 2;
		int result = Max.max(left, right);
		int expected = 2;
		Assert.assertEquals(result, expected);
	}

	@Test
	public void firstMax() {
		int left = 8;
		int right = 5;
		int expected = 8;
		int result = Max.max(left, right);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void secondMax() {
		int left = 4;
		int right = 9;
		int expected = 9;
		int result = Max.max(left, right);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void bothNumbersAreTheSame() {
		int left = 6;
		int right = 6;
		int expected = 6;
		int result = Max.max(left, right);
		Assert.assertEquals(expected, result);
	}
}