package sub03;

public class StringTest {
	public static void main(String[] args) {
		//���ڿ� = ����+�迭
		String str ="hello";
		char[]arr = {'h','e','l','l','o',};
		
		//���ڿ� ��ü
		String str1 =new String("hello");
		String str2 =new String("hello");
		String str3 ="hello";//literal ���ڿ�
		String str4 ="hello";
		
		//���ڿ� ��
		if(str1 == str2) {
			System.out.println("str1�� str2�� �������� ���� ����");
		}else {
			System.out.println("str1�� str2�� �������� ���� �ٸ���");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� �������� ���� ����");
		}else {
			System.out.println("str3�� str4�� �������� ���� �ٸ���");
		}
		
		if(str1.equals(str4)) {
			System.out.println("str1�� str2�� ���ڿ� ���� ���� ����");
		}else {
			System.out.println("str1�� str2�� ���ڿ� ���� ���� �ٸ���");
		}
		
		
		
	}
}
