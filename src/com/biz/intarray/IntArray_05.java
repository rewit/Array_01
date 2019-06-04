package com.biz.intarray;

import java.util.Random;

public class IntArray_05 {

	public static void main(String[] args) {

		int[] intKor = new int[30];
		
		Random rnd = new Random();
		//임의의 숫자를 생성하기 위한 클래스
		
		//배열과 함께 사용하는 for명령문은 
		//시작값 = 0 , 종료값 = 배열의 크기 -1 까지 사용한다
		for(int i = 0; i < 30; i++) {
			
			intKor[i] = rnd.nextInt(50) + 51;
			//0부터 49번까지 짐의의 숫자를 1개 생성하고
			//거기에 51을 더하여 51 ~ 100까지의 숫자를 만들어 
			//intKor의 i 번째 위치에 대입 (할당, 저장)
		}

		for(int i = 0; i < 30; i++) {
			System.out.print(intKor[i]);
			if((i+1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
		
	}

}
