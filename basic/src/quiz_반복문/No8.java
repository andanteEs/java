package quiz_반복문;

public class No8 {

	public static void main(String[] args) {
		System.out.println("구구단 시작");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "X" + i + "=" + j*i + " " );
			}
			System.out.println();
		}
	}

}
