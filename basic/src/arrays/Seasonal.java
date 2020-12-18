package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Seasonal {

	public static void main(String[] args) {
		//24절기 배열 셋팅
		//랜덤으로 숫자를 생성 => 몇번째 절기는 무엇입니까? 에대한걸로 던짐
		//답을 입력함
		//비교해서 맞으면 true 틀리면 false 를 결과 배열에 저장 10회
		//결과배열을 연산해서 정답률 출력 
		
		String[] seasons = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하",
				"소만", "망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분",
				 "한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"};
		
		int good = 0;
		int bad = 0;
		for(int k=0; k<10; k++) {
		int i = (int)(Math.random()*23);
		Scanner sc = new Scanner(System.in);
		System.out.println((i+1) + "번째 절기는 무엇입니까?");
		String season = sc.next();
		
		
			if(seasons[i].equals(season)) {
				System.out.println("정답입니다");
				good ++;
			} else {
				System.out.println("틀렸습니다");
				bad ++;
			}
		}
		
		System.out.println("정답 확률: " + (good/10)*100 + "%");
		System.out.println("오답 확률: " + (bad/10)*100 + "%");
		
		
		
	}

}
