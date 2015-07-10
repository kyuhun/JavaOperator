package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 * 
 * */
public class ArithmethicCalc {
	/*
	 * 오더 사칙연산 계산기 덧셈,뻴셈,곱셈,나눗셈(몫: (), 나머지: ()) 
	 * 사칙연산 기호도 입력받습니다. +,*,-,/ 출력결과
	 * ===심플 계산기 == 
	 * 5 X 5 = 25 5 + 5 = 10 6 ÷ 5 = 1 (1) 5 - 6 = -1
	 */

	public void calc() {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String sel = "";
		System.out.println("두개의 숫자를 입력하시오");
		num1 = scanner.nextInt();
		System.out.println("두개의 숫자를 입력하시오");
		num2 = scanner.nextInt();
		System.out.println("+ - X ÷");
		sel = scanner.next();

		if (sel.equals("+")) {
			System.out.println("===심플 계산기 ==");
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (sel.equals("-")) {
			System.out.println("===심플 계산기 ==");
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (sel.equals("X")) {
			System.out.println("===심플 계산기 ==");
			System.out.println(num1 + "X" + num2 + "=" + (num1 * num2));
		} else if (sel.equals("÷")) {

			System.out.println("===심플 계산기 ===");
			System.out.println(num1 + "÷" + num2 + "=" + (num1 / num2) + "\t"
					+ "(" + (num1 % num2) + ")");
		}

		else {
			System.out.println(" 입력된 값이 올바르지 않습니다.");
		}

	}
}
