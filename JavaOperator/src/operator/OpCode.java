package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : me
 * @ Story : 연산 코드에 관한 문법
 *
 * 
 * */
public class OpCode {
	public static void main(String[] args) {
		/*
		 연산자는(opcode)는 다음과 같이 분류한다.
		 1. 단항 연산자 : ++ ,--. +, -
		 2. 이항 연산자 : 
		 	(1) 산술 연산자 : +,*,/,-,%
		 	(2) 비교 연산자 : <,>,!=,==,<=,>=
		 	(3) 삼항 연산자 : (...)? : true : false
		 	(4) 대입(할당) 연산자 : =
		 * */
		// CTRL + SHIFT + O 
		// import
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을  입력하세요");
		// 스캐너로 입력한 값을 할당함
		int a = scanner.nextInt(); 
		System.out.println("연산 할 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println(a+b);
		
	
	}
}
