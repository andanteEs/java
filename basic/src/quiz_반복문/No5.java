package quiz_반복문;

import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
//		a. 변수x, y (모두한자리정수) 입력받기
//		b. x의y 승(제곱)값출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 정수(한자리정수)를 입력하세요");
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 정수(한자리정수)를 입력하세요");
		int num2 = sc2.nextInt();
		
		System.out.println((int)(Math.pow(num1, num2)));
		
	}

}
