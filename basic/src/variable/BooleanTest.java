package variable;

public class BooleanTest {

	public static void main(String[] args) {
		boolean cond1 = 10 > 20;
		
		int num1 = 100;
		int num2 = 200;
		boolean cond2 = num1 < num2;
		
		System.out.println(cond1);
		System.out.println(cond2);
	
		String str1 = new String("박기태");
		String str2 = "박기태";
		boolean cond3 = str1 == str2;
		boolean cond4 = str1.equals(str2);
		System.out.println(cond3);
		System.out.println(cond4);
	}

}
