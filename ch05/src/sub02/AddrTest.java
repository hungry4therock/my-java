package sub02;

public class AddrTest {
	public static void main(String[] args) {
		int[]arr= {10,20,30};
	}
	
	Adder a= new Adder(100);
	
	a.add(100);
	System.out.println("��ü a�� ��� ���� x:"+a.getx());
	
	a.add(a);
	System.out.println("��ü a�� ��� ���� x:"+a.getx());
	
	a.add(addr);
	System.out.println("�迭 arr�� 1��° ����:"+arr[0]);
	
	a=a.addnew(a);
	System.out.println("��ü a�� ��� ���� x:"+a.getx());
}
