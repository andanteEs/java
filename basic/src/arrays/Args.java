package arrays;

public class Args {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("------------------------------------");
		
		for (String str : args) {
			System.out.println(str);
		}
		
	}

}
