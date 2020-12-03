package chapter4;

public class Ex4_14 {

	public static void main(String[] args) {

		// [4-14] 연습문제

		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int) (Math.random() * 100 + 1); // 컴터값
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용

		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다

			if(answer > input){
				System.out.println("더 큰수를 입력하시오");
			}else if(answer < input){
				System.out.println("작은수를 입력하시오");
			}else {
				System.out.println("정답입니당");
				System.out.println("시도횟수는 :" +count+ "번 입니당");
				break;
			}
			
		} while (true); // 무한반복문

	}

}
