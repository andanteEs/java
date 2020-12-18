package quiz_조건문;

import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
//		a. 크기가다른양의정수3개를입력받기
//		b. 그3개의정수를크기순으로“>” 부호를이용하여출력
//		예) 14 > 7 > 3
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		int inputNum1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 정수를 입력해주세요");
		int inputNum2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("세번째 정수를 입력해주세요");
		int inputNum3 = sc3.nextInt();
		
		if(inputNum1 > inputNum2 && inputNum1 > inputNum3) {
			if(inputNum2 > inputNum3) {
			System.out.println(inputNum1 + ">" + inputNum2 + ">" + inputNum3);
			} else if(inputNum2 < inputNum3) {
			System.out.println(inputNum1 + ">" + inputNum3 + ">" + inputNum2);
			}
		} else if(inputNum2 > inputNum1 && inputNum2 > inputNum3) {
			if(inputNum1 > inputNum3) {
			System.out.println(inputNum2 + ">" + inputNum1 + ">" + inputNum3);	
			} else if (inputNum1 < inputNum3) {
			System.out.println(inputNum2 + ">" + inputNum3 + ">" + inputNum1);	
			}
		} else if(inputNum3 > inputNum1 && inputNum3 > inputNum2) {
			if(inputNum1 > inputNum2) {
			System.out.println(inputNum3 + ">" + inputNum1 + ">" + inputNum2);
			} else if(inputNum1 < inputNum2) {
			System.out.println(inputNum3 + ">" + inputNum2 + ">" + inputNum1);
			}
		}
	}
}

