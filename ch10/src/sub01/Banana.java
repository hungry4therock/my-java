package sub01;

public class Banana {
	private String country;
	private int price;
	
	public Banana() {
		this.country = "���ѹα�";
		this.price = 2000;
	}
	
	public Banana(String country,int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		System.out.println("�ٳ��� ������:"+country);
		System.out.println("�ٳ��� ����:"+price);
		return super.toString();
	}
}