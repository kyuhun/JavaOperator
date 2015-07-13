package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열 입력값 중 최대값 구하기
 * 
 * */
public class InputMax {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		// 배열 선언 및 초기화
		// for -loop 으로 입력 받으세요
		// 비교로직은 if문을 사용하세요
		
		int [] arr = new int [3];
		int max=0;
		System.out.println("3개의 숫자를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(max<=arr[i])
				max = arr[i];
			
		}
		System.out.println("최댓값:"+max);
	}
}
