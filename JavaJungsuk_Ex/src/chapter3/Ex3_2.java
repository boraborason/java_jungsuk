package chapter3;

public class Ex3_2 {

	public static void main(String[] args) {

		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		long numOfBucket = Math.round((numOfApples / (float) sizeOfBucket) + 0.5);
		// 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :" + numOfBucket);

	}

}
