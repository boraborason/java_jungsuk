package chapter4;

public class Ex4_8 {

	public static void main(String[] args) {

		// [4-8] 연습문제

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if ((2 * x) + (4 * y) == 10) {
					System.out.println("x" + "=" + x + "," + "y" + "=" + y);
				}
			}
		}

	}

}
