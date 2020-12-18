package quiz_반복문;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {
//		a. 3자리양의정수1개를입력받기(limitNum)
//		b. 크기가다른1자리양의정수2개를입력받기(a, b)
//		c. limitNum안의a와b의배수개수출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("3자리의 양의 정수 1개를 입력하세요");
		int num1 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("1자리의 양의 정수 1개를 입력하세요");
		int num2 = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("1자리의 양의 정수 1개를 입력하세요");
		int num3 = sc3.nextInt();
		
		System.out.println(num2 + "의 배수 개수: " + num1/num2 + "개");
		System.out.println(num3 + "의 배수 개수: " + num1/num3 + "개");
		
	}

}
