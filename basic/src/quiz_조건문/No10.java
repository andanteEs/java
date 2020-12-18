package quiz_조건문;

import java.util.Scanner;

public class No10 {

	public static void main(String[] args) {
//		a. switch문사용
//		b. 점수(정수)입력받기
//		c. 학점100~90=A89~80=B79~70=C69~60=D59~0=F  
//		판단후출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = sc1.nextInt();
		
		switch ((int)(grade/10)) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
