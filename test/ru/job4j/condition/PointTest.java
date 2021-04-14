package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

	@Test
	public void when00to20then2() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 2;
		int y2 = 0;
		int expected = 2;
		double out = Point.distance(x1, y1, x2, y2);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when41to39then806() {
		int x1 = 4;
		int y1 = 1;
		int x2 = 3;
		int y2 = 9;
		double expected = 8.06;
		double out = Point.distance(x1, y1, x2, y2);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when27to38then141() {
		int x1 = 2;
		int y1 = 7;
		int x2 = 3;
		int y2 = 8;
		double expected = 1.41;
		double out = Point.distance(x1, y1, x2, y2);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when85to23then632() {
		int x1 = 8;
		int y1 = 5;
		int x2 = 2;
		int y2 = 3;
		double expected = 6.32;
		double out = Point.distance(x1, y1, x2, y2);
		Assert.assertEquals(expected, out, 0.01);
	}
}