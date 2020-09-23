package chapter5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length+1);
		int tmp = 0;
		
		tmp = j;
		j = ballArr[i];
		ballArr[i] = tmp;
		System.out.println(ballArr[i]);
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다. 
		int[] ball31 = Arrays.copyOf(ballArr, 3);
		System.out.println(Arrays.toString(ball31));
		for(int i=0;i<ball31.length;i++) {
		System.out.print(ball31[i]);
		}
	}
}
