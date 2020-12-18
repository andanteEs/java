package variable;

import java.util.Scanner;

public class GetDatas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 입력하세요");
		String num = sc.next();		
		switch (num) {
		case "화":
			System.out.println("그날");
			break;
		}
		System.out.println("요일:" +  num+"요일");
		
		
		String x = "화요일";
		switch (x) {
		case "화요일":
			System.out.println("그날");
			break;

		default:
			break;
		}
	}

}
