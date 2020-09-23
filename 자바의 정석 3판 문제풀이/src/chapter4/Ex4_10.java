package chapter4;

public class Ex4_10 {

	public static void main(String[] args) {

		// [4-10] 연습문제
		int num = 12345;
		int sum = 0;

		for (int i = 0; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 풀긴 풀었는데.. 문제의 의도와 다름 ㅋㅋㅋㅋ
		// 숫자를 으로 반복해서 나눠가면서 으로 나머 10 , 10
		// 지 연산을 하면 일의 자리를 얻어낼 수 있다.

		int num2 = 12345;
		int sum2 = 0;
		int total = 0;

		while (num2 > 0) { // 얼마나 돌지 모르기 때문에 while
			sum2 = num2 % 10; // 처음 5가 출력, 다음 4가 출력
			num2 = num2 / 10; // 몫 저장 1234 안그러면 12345를 계속 나눠 5 제곱 무한루프
			total += sum2;
		}
		System.out.println(total);
	}

}
