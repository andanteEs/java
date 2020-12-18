package variable;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
//		금액을 입력받으면 만원, 천원, 백원의 갯수를 출력하는 
//		프로그램을 작성하세요
//
//		[실행 화면 예시]
//		입력한 금액 : 56790
//		만원 : 5
//		천원 : 6
//		백원 : 7

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요!");
		int num = sc.nextInt();
		System.out.println("입력한 금액: " + num);
		System.out.println("만원권: " + num/10000 +"장");
		System.out.println("천원권: " + (num%10000)/1000 +"장");
		System.out.println("백원: " + (num%1000)/100 +"개");
		
	}
	
	
}
