package ch04;

public class p61 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//and 연산
		System.out.println(a > b && a ==10); //true
		System.out.println(a > b && a ==b); //false
		
		//or 연산
		System.out.println(a > b || a ==b); //true
		System.out.println(a < b || a ==b); //false
		
		//xor 연산
		System.out.println(a > b ^ a ==10); //true
		System.out.println(a > b ^ a ==b); //false
		
		//not 연산
		System.out.println(a > b); //true
		System.out.println(a < b); //false
	}

}
