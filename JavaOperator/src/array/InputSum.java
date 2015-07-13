package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열 입력예제
 * 
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = new int[3]; // 3개 숫자 저장 공간
		int total =0, avg =0;
		System.out.println("세 개의 정수를 입력하세요");
	for (int i = 0; i < arr.length; i++) {
		arr[i]= scanner.nextInt();
		
	} // 입력 된 값을 합산하세요
	for (int i = 0; i < arr.length; i++) {
		total += arr[i];
		//System.out.print(arr[i]+"\t");
		
	}
	avg = total / arr.length;
	System.out.println(avg+"\t");
	}
}
