package sub01;

public class ObjectTest {
	public static void main(String[] args) {
		//object클래스:
		//-자바의 최상위 클래스
		//-자바의 모든 클래스는 object클래스를 상속받는다
		//-다형성에 활용
		
		Apple apple =new Apple("한국",3000);
		Banana banana =new Banana("대만",5000);
		
		apple.toString();
		banana.toString();	
	}
	
	
}