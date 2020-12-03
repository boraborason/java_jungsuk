package chapter4;

public class Ex4_4 {

	public static void main(String[] args) {

		// [4-4] 연습문제
		int sum2 = 0;
		int s = 1; // 부호를 바꿔줄 변수
		int total2 = 0; // 위 문제와 마찬가지로 누적이므로 변수 하나 더 필요
		for (int i = 1; true; i++, s = -s) { // s는 = 1,-1,1,-1을 반복

			sum2 = i * s; // Ex) 처음에 i=1 * s=1 i*s = 1
							// i=2 일때 s=-1를 곱하여 ->-2
							// 변수 하나를 더 주지 않으면 단순히 sum2값이 바뀌므로 누적 ㄱㄱ

			total2 = total2 + sum2;

			if (total2 >= 100) {
				break;
			}
		}
		System.out.println(sum2);
		System.out.println(total2);

	}

}
