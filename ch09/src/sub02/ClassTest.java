package sub02;

public class ClassTest {
	public static void main(String[] args) {
		//class 클래스: 객체를 동적 생성할 때 사용하는 클래스
	}
	//w정적개체
	Apple a1 = new Apple("한국",3000);
	a1.toString();
	//동적개체
	try
	Class cls = Class.forName("sub01.Apple);
	
	
}
