package quiz_조건문;

import java.util.Scanner;


public class No9 {

	public static void main(String[] args) {
//		a. 랜덤으로월(정수)을출력받기
//		b. 해당월을영어로입력받기
//		c. 대소문자구별없이처리하여정답출력
		
		Scanner sc = new Scanner(System.in);
		int month = (int)(Math.random()*12)+1;
		
		System.out.println(month + "월을 영어로 입력하세요!");
		String answer = sc.nextLine();
		
		switch (answer.toLowerCase()) {
		case "january": case "february": case "march": case "april":
			System.out.println("정답입니다.");
			break;

		default:
			System.out.println("틀렸습니다.");
			break;
		}
	
	}

}
