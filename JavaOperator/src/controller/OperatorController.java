package controller;

import Loop.EvenOddSum;
import condition.ArithmethicCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		
		// 7월 9일 성적계산기
		CalcAvg avg =new CalcAvg();
		//avg.calcAvg();
	 //  7월 9일 사칙연산 계산기
		ArithmethicCalc calc = new ArithmethicCalc();
		//calc.calc();
		// 2015.07.10 스위치 성적계산기
		SwitchAvg avg2 = new SwitchAvg();
		// avg2.calc();
		ManOrWoman manOrWoman = new ManOrWoman();
		//manOrWoman.ssn(); // ssn() 원 클래스의 메소드 이름이다.
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc();
		
	}
}
