package com.biz.intarray;

public class IntArray_06 {

	public static void main(String[] args) {

		int[] intKor = new int[30];    //둘 다 사용가능 (프로그램 언어에 따라 둘 중 하나만 가능할 수 있음)
		int intEng[] = new int[30];
		//배열 선언하고, 초기화까지 동시에 수행
		//각 배열의 내용은 int형일경우 모두 0으로 clear
		
		int[]intMath;
		//배열을 선언만 한 것
		intMath = new int[30]; //배열을 초기화해 주어야만 사용 가능
		System.out.println(intMath[0]);
		/*
		 * 1. 배열을 선언만 하기
		 * 2. 선언 후 따로 초기화 하기
		 * 3. 배열은 선언 후 초기화 하지 않으면 읽기 안된다
		 * 
		 * 일반적인 변수는 선언한 후 읽기는 안되지만 쓰기는 된다.
		 * 배열은 선언 후 초기화하지 않으면 읽기, 쓰기 모두 할 수 없다.
		 * 
		 * "배열을 생성하면 초기화를 항상 같이 해야한다"
		 */
		
	}

}
