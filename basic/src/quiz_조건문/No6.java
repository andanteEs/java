package quiz_조건문;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {
//		a. 크기가다른양의정수2개를입력받기
//		b. 2개의정수중더큰숫자를출력
//		c. 큰숫자에서작은숫자를뺀값을출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int inputNum1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 정수를 입력하세요");
		int inputNum2 = sc2.nextInt();
		
		if(inputNum2 > inputNum1) {
			System.out.println("둘중 더 큰 정수는: " + inputNum2);
			System.out.println("큰 수에서 작은 수를 뺀 값은: " + (inputNum2-inputNum1));
		} else if(inputNum2 < inputNum1){
			System.out.println("둘중 더 큰 정수는: " + inputNum1);
			System.out.println("큰 수에서 작은 수를 뺀 값은: " + (inputNum1-inputNum2));
		} else {
			System.out.println("두 수의 값이 같습니다!");
		}
		
	}

}
