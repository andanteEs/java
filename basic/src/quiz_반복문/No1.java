package quiz_반복문;

public class No1 {

	public static void main(String[] args) {
//		a. while문이용
//		b. “I can do it” 5회출력
//		c. 1~13까지의합을반복횟수마다출력
		int i = 0;
		
		int sum = 0;
		while(i<13) {
			int j =0;
			while(j<5) {
				System.out.println("I can do it");
				j++;}
			
		sum += sum +i;
		i++;
		System.out.println(sum);
		
		}
	}
}
