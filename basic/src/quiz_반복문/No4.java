package quiz_반복문;

import java.util.Random;
import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
//		a. 변수dan에정수입력받기
//		b. 랜덤으로문장입력받기
//		c. 문장의길이만큼dan의곱셈표를출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요");
		int dan = sc1.nextInt();
		
		Random rnd = new Random();
		
		
		for (int i = 1; i < (int)((Math.random()*9)+1) ; i++) {
			String randomStr = String.valueOf((char) ((int) (rnd.nextInt(26)) + 97));
				
				System.out.println(dan + "*" + i  + "=" + (dan * i));
			
		}	
		
		
	}

}
