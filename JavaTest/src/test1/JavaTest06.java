package test1;

import java.util.Scanner;

public class JavaTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력:");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는"+score+"입니다");
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("등급은 a");
			break;
		case 8:
			System.out.println("등급은 b");
			break;
		case 7:
			System.out.println("등급은 c");
			break;
		case 6:
			System.out.println("등급은 d");
			break;
		default:
			System.out.println("등급은 f");
			break;	
		}
	}
}
