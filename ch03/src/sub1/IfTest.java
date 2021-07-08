package sub1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		//if
		int num1=1;
		int num2=2;
		
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다.");
		}
		if(num2>1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		if(num1>0 && num2>1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다");
		}
		//if ~ else
		int var1 =1;
		int var2 =2;
		
		if(var1 > var2) {
			//조건이 참일때
			System.out.println("var1이 var2보다 작다.");
		}else {
			//조건이 거짓
			System.out.println("var1이 var2보다 작다.");
		}

		//if ~ else if ~else
		int n1 = 1, n2=2, n3=3, n4=4;
		if(n1>n2){
			System.out.println("n1이 n2보다 크다");
		}else if(n2>n3){
			System.out.println("n2이 n3보다 크다");
		}else if(n2>n3){
			System.out.println("n3이 n4보다 크다");
		}else {
			System.out.println("n4가 가장 크다");
	}
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력:");
		int score=sc.nextInt();
		
		System.out.println("입력점수:"+score);
		
		//90~100
		if(score >= 90 && score <= 100) {
		System.out.println("a");
		
		//80~89
		}else if(score >= 80 && score <= 90){
		System.out.println("b");
		
		//70~79
		}else if(score >= 70 && score <= 80){
		System.out.println("c");
				
		//60~69
		}else if(score >= 60 && score <= 70){		
		System.out.println("d");
		
		//00~~59
		}else{
		System.out.println("f");
		}
}
}
	
	
