package chapter4;

public class Ex4_3 {

	public static void main(String[] args) {

		// [4-3] 연습문제
		int sum = 0;
		int total = 0;

		for (int i = 1; i <= 10; i++) {

			sum = sum + i;
			// sum에만 저장해서는 전 값이 쌓이지 않는다.
			// sum에만 저장할 경우 sum의 최종 값은 1~10까지 더한 값 55이다.
			// for문이 돌면서 sum값은 1,3,5,9...

			total = total + sum;
			// 1 + (1+2) + (1+2+3)
		}
		System.out.println("totalSum=" + total);

	}

}
