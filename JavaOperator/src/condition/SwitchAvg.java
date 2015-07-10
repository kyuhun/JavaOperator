package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : switch 예제(합격 여부 구하기)
 * 
 * */
import java.util.Scanner;

public class SwitchAvg {
	public  void calc() {

		Scanner scanner = new Scanner(System.in);
		
		String name = "" ,na="";
		int kor=0,eng=0,math=0,total=0,avg=0;
		
		
		System.out.println("이름을 입력하세요");
		name=scanner.next();
		System.out.println("국어,영어,수학 순으로 점수 입력");
		kor=scanner.nextInt();
		eng=scanner.nextInt();
		math=scanner.nextInt();
		total = kor + eng + math;
		avg =  (int)total/3;
		// 아래 구문을 switch - case로 변환
		/*
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
		 * */
		switch (avg/10) {
		case 10:case 9:  na="장학생"; break;
		case 8:case 7:  na="합격"; break;
		default: na="불학격";  break;
		}
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("----------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+na);
		
	}
}
