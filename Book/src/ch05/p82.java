package ch05;

public class p82 {
	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
		System.out.println("학점 부여 시작");
		if(score>=95) {
			grade = "a+";
		}else if(score>=90){
			grade = "a";
		}else if(score>=85){
			grade = "b+";
		}else if(score>=80){
			grade = "b";
		}else if(score>=75){
			grade = "c";
		}else if(score>=70){
			grade = "d";
		}else {
			grade="f";
		}
		System.out.println("당신 학점은"+grade+"입니다");
		System.out.println("학점부여 끝");
	}
}
