package chapter4;

public class Ex4_13 {

	public static void main(String[] args) {

		// [4-13] 연습문제

		String value = "12o34";
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다

		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);

			// if('A'<=ch && ch <= 'z'){
			// System.out.println(ch+"는 숫자가 아닙니다.");
			// }else {
			// System.out.println(ch+"는 숫자 입니다.");
			// }
			if ('A' <= ch && ch <= 'z') {
				isNumber = false; // 전체비교 핵심..
			}
		}
		if (isNumber) {
			System.out.println(value + " 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}

}
