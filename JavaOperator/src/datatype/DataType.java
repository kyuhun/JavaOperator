package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : 데이터 타입에 대한 문법
 * 
 * */
public class DataType { //낙타표기법(카멜표기법)
/*
 1.데이터 타입이란?
 . 메모리를 생성하기 위한 도구 
 . 메모리의 크기와 메모리의 형태를 지정하기 위한 도구
 2. 메모리를 얻고 사용하는 방법
 . 데이터 타입을 설정
 . 데이터 타입에 맞는 변수 선언
 . 변수에 값 할당
 * */
	public static void main(String[] args) {
		//데이터 타입 + 변수 형태
		/*
		  데이터 타입은 초창기부터 생각하면 총 8가지가 있는데.
		  정수 : int
		  실수 : double
		  문자 : char
		  문자열 : String
		  논리 : boolean
		  5가지만 기억하세요 
		 * */
		
		byte bt; // 정수형 8비트 
		short sh; // 정수형 16비트
		int a; // int는 정수형 숫자
		long lo;  //정수형 64비트 
        float f; // float는 실수형 숫자
        double d; // double는 실수형 숫자(무한대의 개념)
        char c; // char는 알파벳
        boolean b; //boolean 참이나 거짓이냐를 나타낼때
        
        int a2;
        a2=5; // int형변수 a2에 숫자 5를 할당한다.
        int a3 = 5;
        System.out.println(a3);
        
		
	}


}