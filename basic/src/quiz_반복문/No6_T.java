package quiz_반복문;

import java.util.Scanner;

public class No6_T {

	public static void main(String[] args) {
//		a. 3자리양의정수1개를입력받기(limitNum)
//		b. 크기가다른1자리양의정수2개를입력받기(a, b)
//		c. limitNum안의a와b의배수개수출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한계값 입력 : ");
		int limitNum = sc.nextInt();
		
		System.out.println("첫번째 수");
		int firstNum = sc.nextInt();
		System.out.println("두번째 수");
		int secondNum = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < limitNum; i++) {
			if( i % firstNum == 0 || i % secondNum == 0 ) {
				System.out.println(i + ", ");
				count++;
			}
		}
		System.out.println("배수의 갯수는 " + count + "입니다" );
	}

}
