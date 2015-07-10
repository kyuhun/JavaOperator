package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story :if-else 예제(큰 수 구하기)
 * 
 * */
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		  문제) 학생 3명의  점수를 입력받아서 1등 출력(0점~100점)
		  결과)   
		 1등은  98점입니다. 
		  힌트) a와 b 비교 , b 와 c 를 비교, a와 c를 비교
		 * */
		Scanner scanner = new Scanner(System.in); 
		int num1=0,num2=0,num3=0;
		System.out.println("값을 입력하세요");
		num1 = scanner.nextInt();
		System.out.println("값을 입력하세요");
		num2 = scanner.nextInt();
		System.out.println("값을 입력하세요");
		num3 = scanner.nextInt();
		/*
		  조건식을 따져서 결과를 가정하지 말고,
		  결과를 상정한 다음 거기에 맞는 조건식을 
		  설정하세요. 
		 * */
		if (num1>=num2 && num1>=num3) {
			        	
			System.out.println("1등은"   +num1+"점입니다. ");
			
		}
		else if(num2>=num1 && num2>=num3){
			System.out.println("1등은"   +num2+"점입니다. ");

		}
		else{
			
			System.out.println("1등은"   +num3+"점입니다. ");

		}
			
	}
}
