package chapter4;

public class Ex4_15 {

	public static void main(String[] args) {

		// [4-15] 연습문제..다시풀어보기

		int number = 12321;
		int tmp = number;
		int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
		while (tmp != 0) {

			result = result * 10 + tmp % 10;
			// 10을 곱해가면서 더하면 숫자를 역순으로 바꿀 수 있다 .

			tmp = tmp / 10; // 1232 -> 123 -> 12 -1
		}
		if (number == result)
			System.out.println(number + " 는 회문수 입니다.");
		else
			System.out.println(number + " 는 회문수가 아닙니다.");

	}

}
