package chapter4;

public class Ex4_9 {

	public static void main(String[] args) {

		// [4-9] 연습문제

		String str = "12345";
		int sum3 = 0;

		for (int i = 0; i < str.length(); i++) {

			sum3 += str.charAt(i) - '0'; // str.charAt(i) char타입이기때문에 -'0'연산가능
											// sum += 값으로 누적
		}
		System.out.println("sum3=" + sum3);

	}

}
