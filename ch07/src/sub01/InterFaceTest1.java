package sub01;

public class InterFaceTest1 {
	public static void main(String[] args) {
		//�������̽� - Ŭ���� ������ ǥ�� ���̵带 ����
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
