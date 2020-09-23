package chapter5;

import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {

		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			
			
			
			
			System.out.printf("Q%d. %s .>", i + 1, new String(question));
			
			String answer = scanner.nextLine();
			
			
			if (words[i].equals(answer.trim()))
				System.out.printf(" .%n%n");
			else
				System.out.printf(" .%n%n");
		}

	}

}
