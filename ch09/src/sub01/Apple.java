package sub01;

public class Apple extends Object{
	private String country;
	private int price;
	
	public Apple() {
		this.country = "���ѹα�";
		this.price = 2000;
	}
	
	public Apple(String country,int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		System.out.println("��� ������:"+country);
		System.out.println("�ٳ��� ������:"+price);
		return super.toString();
	}
}
