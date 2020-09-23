package chapter3;

public class Ex3_9 {

	public static void main(String[] args) {

		char chch = 'z';
		boolean bb = (('A' <= chch && chch <= 'z') || ('0' <= chch && chch <= '9'));
		// A = 65 z = 122
		System.out.println(bb);

	}

}
