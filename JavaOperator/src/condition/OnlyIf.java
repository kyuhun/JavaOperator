package condition;

/*
 * @ Date : 2015.07.08
 * @ Author : me
 * @ Story : if만 있는 구문
 * 
 * */
public class OnlyIf {

	public static void main(String[] args) {
		/*
		 * 구문(statement) 자바 연산식에서 3가지 종류의 구문으로 나뉜다. 1. 조건문 if,if-else,switch 2.
		 * 반복문 while,do-while,for 3. 기타구문 continue,break,return
		 */

		int x = 1, y = 2;
		if (x == y) { // 숫자값의 비교연산자 ==
			System.out.println("숫자 x와 y의 값은 같다 ");

		}

		if (x != y) { // !는 부정(not)
			System.out.println("숫자 x와 y의 값은 다르다 ");

		}
		if (x > y) {

			System.out.println("숫자 x는 y 보다 크다 ");
		}
		if (x < y) {

			System.out.println("숫자 x는 y보다 작다 ");
		}
		if (x <= y) {

			System.out.println("숫자 x는 y보다 같거나 작다 ");
		} 
		
		/*
		 한 구문은 반드시 하나의 결과만을 리턴하게0끔 코딩되어야 한다.
		 따라서 only if문을 코딩 할 때는 단 한가지 case만 출력할 것
		 이라는 확신이 있을때 다룬다. 
		 * */
	}
}
