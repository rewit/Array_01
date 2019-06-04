package com.biz.intarray;

public class IntArray_03 {

	public static void main(String[] args) {

		//변수 묶음 선언  (30개의 intKor 묶음 선언)
		
		int[] intKor = new int[30];
		/*
		 * 정수값을 기억 할 수 있는 기억공간을 30개 예약하고
		 * 그 기억공간에 대표이름 intKor를 붙여라
		 * 
		 * ==> int형(type) 배열 30개를 만들고
		 * 대표이름으로 intKor을 붙여라
		 * 
		 * ==> 30개의 연속된 기억공간을 예약하고,
		 * 처음시작 공간에 "0을 시작"하여 
		 * 각 공간에 십진수 고유의 주소값을 붙여 나간다
		 */
		
		//30개의 호수가 있는 intKor에 각각 값들을 대입하는 방법
		//시작번호는 무조건 0번부터 시작
		intKor[0] = 90;
		intKor[1] = 80;
		intKor[2] = 70;
		intKor[3] = 88;
		intKor[4] = 66;
		intKor[5] = 89;
		intKor[6] = 85;
		intKor[7] = 90;
		
		//배열은 일반 변수와 달리 그 배열을 활용할 때
		//for 반복문을 사용할 수 있는 특징
		
		int intSum = 0;
		//아래 for 명령문의 i 값은 0 ~ 8-1만큼 변화된다
		for(int i = 0; i < 8; i++) {
			intSum += intKor[i];
		}
		//아래 코드를 for명령문을 이용하여 위의 코드로 작성
		intSum = 0;
		intSum +=intKor[0];
		intSum +=intKor[1];
		intSum +=intKor[2];
		intSum +=intKor[3];
		intSum +=intKor[4];
		intSum +=intKor[5];
		intSum +=intKor[6];
		intSum +=intKor[7];
		
		
		
		
		
		
		
		
			
			
		
	}

}
