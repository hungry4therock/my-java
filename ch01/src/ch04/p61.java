package ch04;

public class p61 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//and ����
		System.out.println(a > b && a ==10); //true
		System.out.println(a > b && a ==b); //false
		
		//or ����
		System.out.println(a > b || a ==b); //true
		System.out.println(a < b || a ==b); //false
		
		//xor ����
		System.out.println(a > b ^ a ==10); //true
		System.out.println(a > b ^ a ==b); //false
		
		//not ����
		System.out.println(a > b); //true
		System.out.println(a < b); //false
	}

}
