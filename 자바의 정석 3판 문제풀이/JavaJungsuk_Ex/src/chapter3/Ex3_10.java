package chapter3;

public class Ex3_10 {

	public static void main(String[] args) {

		char chchch = 'A';
		char lowerCase = (('A' <= chchch && chchch <= 'Z')) ? (char) (chchch + 32) : chchch;
		// ('A' <= chchch <= 'Z') 이건 왜 안됨?
		// 순차적으로 비교하기 때문에 처음 결과 true true와 chchch <= 'Z'비교불가

		System.out.println("ch:" + chchch);
		System.out.println("ch to lowerCase:" + lowerCase);

	}

}
