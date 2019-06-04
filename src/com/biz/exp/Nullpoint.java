package com.biz.exp;

public class Nullpoint {

	public static void main(String[] args) {

		String strQ = "";  //"" = 문자형 clear
		//문자열이지만, 값이 없는 문자열
		
		String strNull = null; // clear이 아닌 예약만 하는 것
		//아무것도 아닌 값 
		//0도 아니고, ""도 아니고, " " 도 아닌것 (아무것도 안만들어진 값) (Null은 숫자형 불가능 문자형이나 클래스만 가능)
		
		String strNotNull ; 
		
		//System.out.println(strNotNull);
		System.out.println(strNull);
		System.out.println(strNull.toString());
		
		
		
	}

}
