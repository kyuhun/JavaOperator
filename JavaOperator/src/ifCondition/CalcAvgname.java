package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : if-else 예제
 *  프로그램을 하나 개발해야 합니다.
 *  오더는 
 *  학생 		국어		영어		수학		총점		평균		합격여부
 *  -----------------------------------------------------
 * (홍길동)  90	 	90		90		270		90		합격
 * 평균>=90 장학생  90>평균>=70 합격  
 * 평균<=70 불합격
 * */
public class CalcAvgname {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = "" ,na="";
		int kor=0,eng=0,math=0,total=0;
		double avg=0.0d;
		
		System.out.println("이름을 입력하세요");
		name=scanner.next();
		System.out.println("국어,영어,수학 순으로 점수 입력");
		kor=scanner.nextInt();
		eng=scanner.nextInt();
		math=scanner.nextInt();
		total = kor + eng + math;
		avg =  (int)total/3;
		if(avg>=90)
		{
			na="장학생";
		}
		else if(avg<90 && avg>=70)
		{
			na="합격";
			
			
		}
		else
		{
			na="불학격";
		}
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("----------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+na);
		
		
	}
}
