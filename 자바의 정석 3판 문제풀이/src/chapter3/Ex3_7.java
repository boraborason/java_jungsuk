package chapter3;

public class Ex3_7 {

	public static void main(String[] args) {

		int fahrenheit = 100;
		float celcius = (float) (Math.round((float) 5 / 9 * (fahrenheit - 32) * 100) / 100.0);
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);

	}

}
