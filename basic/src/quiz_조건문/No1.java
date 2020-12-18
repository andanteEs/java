package quiz_조건문;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int input = sc.nextInt();
		System.out.println("입력된 수: " + input);
		if(input < 50) {
			System.out.println("50 이하의 정수 입니다");
		} else if(input > 50) {
			System.out.println("50 이상의 정수 입니다");
		} else {
			//변수 조정
			System.out.println("예외의 수입니다(음수 혹은 문자");
		}
		
		
	}

}
