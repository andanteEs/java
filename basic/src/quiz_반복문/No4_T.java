package quiz_반복문;

import java.util.Scanner;

public class No4_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("단수를 입력하세요 : ");
	      int dan = sc.nextInt();

	      System.out.println("글을 입력하세요 : ");
	      String str = sc.next();
	      int strLen = str.length();
	      
	      for (int i = 1; i < strLen; i++) {
	         System.out.println(dan + " x " + i + " = " + (dan * i));
	      }
		
		
	}

}
