package sub02;
//override �޼���
//�θ� Ŭ���� �޼��带 �ڽ� Ŭ�������� �ٽ� �����ϴ� �޼��� (������ �޼���)
//�ڽ� Ŭ�������� �θ�Ŭ������ �޼��带 ���� �����
public class Override {
	public static void main(String[] args) {
		ccc c =new ccc();
		
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		//final �ǽ�
		//
		
		//final  ����:���
		//final�޼���:�������̵� ����
		//finalŬ����:��� ����
		
		final int NUM =1;
		//num += 1;
		
	}

}
