package quiz_조건문;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
//		a. 변수inputNum에정수입력받기
//		b. inputNum이4과6의공배수인지 4의배수인지 6의배수인지
//		어느배수도아닌지판단하여출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int inputNum = sc.nextInt();
		if(inputNum % 4 == 0 && inputNum % 6 == 0 ) {
			System.out.println(inputNum + "은(는) 4와 6의 공배수 입니다.");
		} else if (inputNum % 4 == 0) {
			System.out.println(inputNum + "은(는) 4의 배수 입니다.");
		} else if (inputNum % 6 == 0) {
			System.out.println(inputNum + "은(는) 6의 배수 입니다.");
		} else {
			System.out.println(inputNum + "은(는) 4와 6 중 어느 배수도 아닙니다.");
		}
	}

}
