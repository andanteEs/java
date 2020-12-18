package arrays;

import java.util.Scanner;

public class Seasonal_T {

	public static void main(String[] args) {
		//24절기 배열 셋팅
		//랜덤으로 숫자를 생성 => 몇번째 절기는 무엇입니까? 에대한걸로 던짐
		//답을 입력함
		//비교해서 맞으면 true 틀리면 false 를 결과 배열에 저장 10회
		//결과배열을 연산해서 정답률 출력 
		
		String[] seasonal = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하",
				"소만", "망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분",
				 "한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"};
		
		Scanner sc = new Scanner(System.in);
		boolean[] scores = new boolean[10];
		
		for (int i = 0; i < scores.length; i++) {
			int rIdx = (int)(Math.random()*24);
			System.out.println((rIdx + 1) + "번째 절기는?");
			String answer = sc.nextLine();
			
			if(seasonal[rIdx].equals(answer)) {
				System.out.println("정답입니다.");
				scores[i] = true;
			} else {
				System.out.println("오답입니다");
				scores[i] = false;
			}
		}
		int success = 0;
		for (int j = 0; j < scores.length; j++) {
			if(scores[j] == true) {
				success++;
			}
		}
		System.out.println("정답률: " + ((success*100)/10) + "%");
		
		
		
		
	}

}
