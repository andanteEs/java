package quiz_반복문;

import java.util.Scanner;

public class No10 {

	public static void main(String[] args) {
//		a. 정수1개를입력받기
//		b. 그정수의약수를출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		System.out.println(num + "의 약수는:");
		for(int i=1; i<=num; i++)
		if(num%i == 0) {
			System.out.print(i + ",");
		} else {
			
		}
	}

}
