package sub02;
//override 메서드
//부모 클래스 메서드를 자식 클래스에서 다시 정의하는 메서드 (재정의 메서드)
//자식 클래스에서 부모클래스이 메서드를 덮어 씌운다
public class Override {
	public static void main(String[] args) {
		ccc c =new ccc();
		
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		//final 실습
		//
		
		//final  변수:상수
		//final메서드:오버라이드 금지
		//final클래스:상속 금지
		
		final int NUM =1;
		//num += 1;
		
	}

}
