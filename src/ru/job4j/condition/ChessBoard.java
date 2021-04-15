package ru.job4j.condition;

public class ChessBoard {
	public static int way(int x1, int y1, int x2, int y2) {
		int result = 0;
		int x = Math.abs(x1 - x2);
		int y = Math.abs(y1 - y2);

		if (x == y && ((x1 >= 0 && x1 < 8) && (y1 >= 0 && y1 < 8) && (x2 >= 0 && x2 < 7) && (y2 >= 0 && y2 < 8))) {
			result = x;
		}
		return result;
	}
}
