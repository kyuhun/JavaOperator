package array;

import java.util.Scanner;

public class IntArrayDemo {
	public static void main(String[] args) {
		// 선언부
		// 변수의 선언
		// 지역변수는 무조건 초기화 해야한다.
		// 그런데 변수 하나 하나 초기화 하려다 보니
		// 세~네개는 해볼만 하는데 더 이상은 짜증나서 못하겠다.
		
		int[] arr;
		arr= new int [100000];
		
		int [] arr2 = new int[100000];
		Scanner scanner = new Scanner(System.in);
		
		/*
		  자바는 객체 지향 언어이다.
		  이 말은 프로그램 모양을 객체화 시켜서 사용한다는 뜻과 동일한다.
		  그럼 객체화 시킨다는 말은 무엇이냐 하면 
		  좁은 의미에서 보자면 main() 해체하고 단 하나의 main()만으로 
		  프로그램에서 존재시키고 나머지는 클래스화 하여 필요한 때에만 
		  그 기능을 호출해서 사용한다는 의미이다. 
		  호출방법은 공식으로 굳어졌는데.
		  클래스이름 객체이름 = new 클래스이름();
		  .. ()안에 있는 변수는 파라미터라고 하는데.
		  .. 필요에 따라 있을 수도 있고 없을 수도 있다.
		  단, 클래스이름, 객체이름, new, 클래스 이름 ()는 반드시 필요하다. 
		  그리고 이때 객체이름을 참조변수라고 한다.
		 * */
	}
}
