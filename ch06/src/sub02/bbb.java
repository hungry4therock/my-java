package sub02;
//final 클래스는 상속할 수 없는 클래스
public final class bbb extentds aaa{
	
	/*부모 클래스 bbb-mehotd1은 final선언으로 override할 수 없다*/
	@override
	public final void method1() {
		System.out.println("bbb-method1...");
	}
	//overload
	public void method2(int a) {
		System.out.println("bbb-method2...");
	}
	//overload
	public void method3() {
		System.out.println("bbb-method3...");
	}
}
