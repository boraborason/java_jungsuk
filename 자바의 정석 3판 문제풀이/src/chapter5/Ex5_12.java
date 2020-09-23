package chapter5;

import java.util.Scanner;

public class Ex5_12 {

	public static void main(String[] args) {
		
		String [][]arr = 	{{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"}};
		
		int score = 0;
		
		Scanner sc = new Scanner(System.in);  //스캐너 객체 먼저생성
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.println(arr[i][0] + "의 뜻은?");
			String tmp = sc.nextLine();
			
			if(tmp.equals(arr[i][1])){
				System.out.println("정답입니다");
				
			}else{
				System.out.println("땡 정답은 " + arr[i][1]+"입니다");
			}
		}
		
		

	}

}
