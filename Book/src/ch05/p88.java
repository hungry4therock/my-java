package ch05;

import java.util.Scanner;

public class p88 {
	public static void main(String[] args) {
		System.out.println("�����Է�:");
		Scanner scan = new Scanner(System.in);
		
		int score =scan.nextInt();
		String grade="";
		switch(score/10) {
		case 9:
			grade="a";
		case 8:
			grade="b";
		case 7:
			grade="c";
		case 6:
			grade="d";
		default:
			grade="f";
		}
		System.out.println("����:"+grade);
	}
}
