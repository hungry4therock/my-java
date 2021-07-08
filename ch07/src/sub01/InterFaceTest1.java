package sub01;

public class InterFaceTest1 {
	public static void main(String[] args) {
		//인터페이스 - 클래스 설계의 표준 가이드를 역할
		RemoteLG lg =new RemoteLG();
		RemoteLG samsung =new RemoteSamgsung();
		
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		Samsung.powerOn();
		Samsung.chUp();
		Samsung.powerOff();
		
	}
}
