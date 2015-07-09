package controller;

import ifCondition.ArithmethicCalc;
import ifCondition.CalcAvg;

public class OperatorController {
	public static void main(String[] args) {
		
		// 7월 9일 성적계산기
		CalcAvg avg =new CalcAvg();
		avg.calcAvg();
	 //  7월 9일 사칙연산 계산기
	ArithmethicCalc calc = new ArithmethicCalc();
	calc.calc();
	}
}
