package variable;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		정수를 입력받아 주택 담보 대출 연이자가 2%, 3%, 4%, 5%, 6%
//		일 때 월 입금 해야하는 이자를 출력하는 프로그램을 작성하세요. 
//		
		
//
//		[실행 화면 예시] 
//		입력된 수: 100000000 
//		2% : 166666 
//		3% : 250000 
//		4% : 333333 
//		5% : 416666 
//		6% : 500000 

		Scanner num = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num1 = num.nextInt();
		System.out.println("입력된 수 : " + num1);
		for (int i = 2; i < 7; i++) {
			System.out.println(i + "%: " + num1 * i/100/12);
		}
		
	
		
	}

}
