package quiz_조건문;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("급여를 입력하세요");
		int income = num.nextInt();
		System.out.println("입력된 급여 : " + income);
		
		if(income<12000000) {
			double tax = 0.06;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>12000000 && income < 46000000) {
			double tax = 0.15;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>46000000 && income < 88000000) {
			double tax = 0.24;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>88000000 && income < 150000000) {
			double tax = 0.35;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>150000000 && income < 300000000) {
			double tax = 0.38;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>300000000 && income < 500000000) {
			double tax = 0.4;
			System.out.println("근로소득세: " + (int)(income*tax));
		} else if(income>500000000) {
			double tax = 0.42;
			System.out.println("근로소득세: " + (int)(income*tax));
		}
		
	}

}
