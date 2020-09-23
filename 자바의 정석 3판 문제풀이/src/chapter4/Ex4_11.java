package chapter4;

public class Ex4_11 {

	public static void main(String[] args) {

		// [4-11] 연습문제

		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값

		System.out.print(num1 + "," + num2);// 일회용

		for (int i = 0; i < 8; i++) { // 두번은 위에서 이미 출력 0~7이니까 10번 까지 8번만 출력하면
										// 된다.
			num3 = num1 + num2;
			System.out.print("," + num3);

			num1 = num2;
			num2 = num3; // 한칸씩 밀기

		}

	}

}
