package chapter5;

public class Ex5_10 {

	public static void main(String[] args) {
		
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
										// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		
		// 문자열src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) { //5번 반복
			char ch = src.charAt(i);  //넣었음
			
			if('a' <= ch && ch <= 'z'){    //부등호 주의 
				result = result + abcCode [ch-'a']; // a 에서'a'를 빼면 0 이므로
													//abcCode [0]이니까 '`'를 반환
			}else if('0' <= ch && ch <= '9') {    //char타입 숫자는 0~9 까지
				result = result + numCode [ch-'0'];
			}										
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
