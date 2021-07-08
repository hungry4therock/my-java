package ch07;



public class p141{

	public static void main(String[] args) {

		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m개체와 m2개체는 같다");
		}else {
			System.out.println("m2개체와 m개체는 같지 않다");
		}
	}
}
	