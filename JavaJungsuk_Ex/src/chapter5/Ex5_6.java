package chapter5;

public class Ex5_6 {

	public static void main(String[] args) {

		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int money2 = 0;
		
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
		
			money2 = money / coinUnit[i];
			money = money % coinUnit[i];
			
			System.out.println(coinUnit[i] + "원 : " + money2 );
		}
	}
}
