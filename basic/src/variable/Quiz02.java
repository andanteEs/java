package variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		하나의 정수를 입력받아 1%, 13%, 27%, 10.5%가 할인된 값을 
//		출력하는 프로그램을 작성하세요.  
//		단, 정수할인율을 적용하면 정수 결과값을,
//		실수 할인율을 적용하면 실수 결과값으로 출력되어야 함.
//
//		[실행 화면 예시] 
//		입력된 수: 100 
//		 
//		1%: 99 
//		13%: 87 
//		27%: 73 
//		10.5%: 89.5
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		int num1 = sc.nextInt();
		System.out.println("입력된 값: " + num1);
		System.out.println("1%: " + num1 * 99/100); // ("1% : " + (int)(num1 * (1-0.01)))
		System.out.println("13%: " + num1 * (100-13)/100);
		System.out.println("27%: " + num1 * (100-27)/100);
		System.out.println("10.5%: " + num1 * (double)(100-10.5)/100);
	}
	
	
	
	
}
