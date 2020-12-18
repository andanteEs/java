package variable;

public class Output {

	public static void main(String[] args) {
		String str = "이것이자바인가???";
		int num = 12345;
		
		System.out.println(str);
		System.out.println(num);
		System.out.println("네 자바가 맞습니다!" + num);
		System.out.println(str + num);
		System.out.println(num + "이건요?");
		
		int minutesPerHour = 70; // c, c++, c#, java ?정확도가 높고 사전오류체크가 가능
		int minutes_per_hour = 60; //js, php, python ?카멜표기법은 가독성이 부족
	}

}
