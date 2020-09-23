package chapter4;

public class Ex4_5 {

	public static void main(String[] args) {

		// [4-5] 연습문제
		// for문을 while문으로 바꾸기
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		int i = 0;
		int j = 0;

		while (i <= 10) {
			while (j <= i) {
				j++;
				i++;
			}
			System.out.println("*");
		}

	}

}
