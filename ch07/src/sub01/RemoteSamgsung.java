package sub01;

public class RemoteSamgsung implements RemoteControl {
	public void powerOn() {
		System.out.println("samgsung poweron");
	}
	public void powerOff() {
		System.out.println("samgsung poweroff");
	}
	public void chUp() {
		System.out.println("samgsung chup");
	}
	public void chDown() {
		System.out.println("samgsung chdown");
	}
}
