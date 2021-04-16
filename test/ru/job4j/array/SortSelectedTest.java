package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
	@Test
	public void whenSort() {
		int[] data = new int[]{3, 4, 1, 2, 5};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{1, 2, 3, 4, 5};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenSort3Value() {
		int[] data = new int[]{6, 4, 2};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{2, 4, 6};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenSort3Value2() {
		int[] data = new int[]{10, 7, 3};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{3, 7, 10};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenSort5Value() {
		int[] data = new int[]{3, 9, 1, 2, 3};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{1, 2, 3, 3, 9};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void whenSort5Value2() {
		int[] data = new int[]{9, 2, 4, 2, 10};
		int[] result = SortSelected.sort(data);
		int[] expected = new int[]{2, 2, 4, 9, 10};
		Assert.assertArrayEquals(expected, result);
	}

}