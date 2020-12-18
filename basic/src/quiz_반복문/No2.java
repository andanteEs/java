package quiz_반복문;

import java.util.Scanner;

class No2 {

	public static void main(String[] args) {
//		a. 변수dan에정수입력받기
//		b. 그단의9단까지출력
//		c. while문이용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 선택하세요 EX) 2단일 경우 2 입력 ");
		int dan = sc.nextInt();
		int i = 1;
		System.out.println(dan + "단 시작");
		while(i < 10) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i++;
		}
		
	}

}
