package variable;

import java.util.Scanner;

public class GetDatas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner 란 클래스(공장틀)의 틀을 가진 변수 sc 선언
		//(스캐너란 타입의 변수 sc선언)
		System.out.println("정수를 입력하세요");
		int num1 = sc.nextInt();		
		
		System.out.println("받은숫자:" +  num1);
		
		
	}

}
