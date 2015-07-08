package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 order
		 스캐너로 두 값을 입력받아서 
		 사칙연산 결과가 나오도록 하시오.
		 20+7=27
		 
		 * */
		Scanner scanner = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("값을 입력하세요");
		i=scanner.nextInt(); // next 커서 다음 글자(숫자)를 변수 할당하라.
		System.out.println("값을 입력하세요");
		j=scanner.nextInt();
		System.out.println(i+"\t+\t"+j+"\t="+(i+j));
		System.out.println(i+"\t-\t"+j+"\t="+(i-j));
		System.out.println(i+"\tX\t"+j+"\t="+(i*j));
		System.out.println(i+"\t/\t"+j+"\t="+(i/j));
		System.out.println(i+"\t%\t"+j+"\t="+(i%j));
		
		
	}
}
