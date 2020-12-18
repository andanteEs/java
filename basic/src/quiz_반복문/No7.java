package quiz_반복문;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {
//		a. 한라인에출력할별의개수(양의정수) 입력받기
//		b. 출력할라인의개수(양의정수) 입력받기
//		c. 입력한정보만큼별출력
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("라인당 원하는 별의 개수를 입력하세요");
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("출력할 라인의 개수를 입력하세요");
		int num2 = sc2.nextInt();
		
		for(int i=0; i< num2; i++) {
			for(int j=0; j < num1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	
	}

}
