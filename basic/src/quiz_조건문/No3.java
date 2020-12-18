package quiz_조건문;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
//		a. 사고싶은것과그것의가격입력받기
//		b. 월소득과저축률입력받기
//		c. 그것을구입하는데몇개월소요될것인지출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("사고싶은것은 입력하세요");
		String thing = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("그것의 가격을 입력하세요");
		int price = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("월소득을 입력하세요");
		int income = sc3.nextInt();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("월 저축률을 입력하세요");
		double per = sc4.nextDouble();
		
		System.out.println(thing + "을 구입하는데 걸릴 개월수는 :" + (int)(Math.ceil(price / (income * (1-per)))) +"개월 입니다." );
		
	}

}
