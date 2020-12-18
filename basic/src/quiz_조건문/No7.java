package quiz_조건문;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {
//		a. 양의정수2개를입력받기
//		b. 1:덧셈/ 2:뺄셈/ 3:곱셈/ 4:나눗셈/ 5:나머지-> 메뉴
//		c. 계산과정및결과출력-> 예) 3 + 5 = 8
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 정수를 입력하세요");
		int num2 = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("원하시는 메뉴의 번호를 입력하세요!\n 1:덧셈/ 2:뺄셈/ 3:곱셈/ 4:나눗셈/ 5:나머지");
		int num3 = sc3.nextInt();
		switch (num3) {
		case 1:
			System.out.println("계산과정 및 결과출력: " + num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case 2:
			System.out.println("계산과정 및 결과출력: " + num1 + "-" + num2 + "=" + (num1 - num2));

		case 3:
			System.out.println("계산과정 및 결과출력: " + num1 + "*" + num2 + "=" + (num1 * num2));
		
		case 4:
			System.out.println("계산과정 및 결과출력: " + num1 + "/" + num2 + "=" + (num1/num2));
		
		case 5:
			System.out.println("계산과정 및 결과출력: " + num1 + "%" + num2 + "=" + (num1%num2));
	
		}
		
	}

}
