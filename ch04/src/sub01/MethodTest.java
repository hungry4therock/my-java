package sub01;

public class MethodTest {
	
	//main method: 자바 프로그램 시작점
	public static void main(String[] args) {
		//메서드 호출
		int y1=f(1);
		int y2=f(2);
		int y3=f(3);
		
		System.out.println("y1:"+y1);
		System.out.println("y2:"+y2);
		System.out.println("y3:"+y3);
		
		//sum 메서드 호출
		System.out.println("1부터 10까지의 합:"+sum(1,10));
		System.out.println("1부터 100까지의 합:"+sum(1,100));
		System.out.println("1부터 1000까지의 합:"+sum(1,1000));
			
	}// main method end
	
	//메서드 정리:코드 로직을 모듈화시킨 것
	public static int f(int x) {
		int y= 2*x+3;
		return y;
	}
	
	public static int sum(int start, int end) {
		int sum = 0;
		for(int k=start; k<=end; k++) {
			sum += k;
			
		}
		
		return sum;
	}
		
	
	

		
}
