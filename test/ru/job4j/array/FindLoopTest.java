package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

	@Test
	public void whenArrayHas5Then0() {
		int[] data = new int[]{5, 4, 3, 2};
		int el = 5;
		int result = FindLoop.indexOf(data, el);
		int expected = 0;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenNotFind5() {
		int[] data = new int[]{10, 6, 4, 9};
		int el = 5;
		int result = FindLoop.indexOf(data, el);
		int expected = -1;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenFind3() {
		int[] data = new int[]{5, 2, 10, 2, 4};
		int el = 2;
		int start = 2;
		int finish = 4;
		int result = FindLoop.indexOf(data, el, start, finish);
		int expected = 3;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenFind6() {
		int[] data = new int[]{5, 4, 1, 3, 2, 1, 8, 6, 9, 10};
		int el = 8;
		int start = 1;
		int finish = 6;
		int result = FindLoop.indexOf(data, el, start, finish);
		int expected = 6;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void whenNotFind7() {
		int[] data = new int[]{5, 4, 1, 3, 2, 1, 8, 6, 9, 10};
		int el = 7;
		int start = 1;
		int finish = 6;
		int result = FindLoop.indexOf(data, el, start, finish);
		int expected = -1;
		Assert.assertEquals(expected, result);
	}
}