package arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		String[] strs;
		//String strs2[]; 이 방식은 잘 안쓰임
		// cars = ["Volvo", "BMW", "Ford", "Mazda"]
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//선언 및 초기화 방식: 분리 불가능
		System.out.println(cars.length);
		
		String[] movies = new String[5]; //5는 length
		
		String[] movies2;
		movies2 = new String[4];// 배열의 길이 지정: 선언 및 초기화 분리가능
		
		for (int i = 0; i < movies2.length; i++) {
			movies2[i] = cars[i] + ":cinema";
		}
		for (int j = 0; j < movies2.length; j++) {
			System.out.println(movies2[j]);
		}
			System.out.println(movies2.toString());
		
			for (int i = 0; i < cars.length; i++) {
				System.out.println(cars[i]);
			}
			//print(cars[0])
			System.out.println(cars[0]);
			
			
	}

}
