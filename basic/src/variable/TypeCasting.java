package variable;

public class TypeCasting {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int rnum = (int) Math.floor(Math.random()*100)+1;
			System.out.print(rnum + " , ");
		}
		char ch1 = 'B';
		int num1 = ch1;
		System.out.println(num1);
		
		byte b1 = 94;
		char ch2 = (char) b1;
		System.out.println(ch2);
		
		float f1 = 1.24f;
		byte b2 = (byte) f1;
		System.out.println(b2);
		
	}

}
