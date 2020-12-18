package quiz_조건문;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {
//		a.월(정수)을입력받기
//		b. 사계절중월에맞는계절출력
//		c. 정상범위의정수가아니면“정상적인월을입력” 출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("원하는 달(월)을 입력하세요!");
		int num1 = sc1.nextInt();
		
		if(num1 == 12 || num1 == 1 || num1 == 2 ) {
			System.out.println("겨울입니다.");
		} else if(num1 > 2 && num1 <7) {
			System.out.println("봄입니다");
		} else if(num1>7 && num1<10) {
			System.out.println("여름입니다.");
		}else {
			System.out.println("가을입니다.");
		}
	}

}
