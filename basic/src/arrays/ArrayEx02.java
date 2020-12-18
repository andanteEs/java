package arrays;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요> ");
		int num = sc.nextInt();
		
		int[] nums = new int[num];
		int oddNum = 0;
		int evenNum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]%2==0) {
				System.out.print(nums[j] + ",");
				evenNum += nums[j];
			}else {
				System.out.print(nums[j] + ",");
				oddNum += nums[j];
			}
		}
		System.out.println();
		System.out.println("홀수의 합: " + oddNum + "/ 짝수의 합 :" + evenNum);
		
	}

}
