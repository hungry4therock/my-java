package sub03;

public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "hello korea";
		
		// length-���� ����
		System.out.println("Str���ڿ� ����:"+str.length());
		// charAt-���ڿ����� Ư����������
		System.out.println("str1��° ����:"+str.charAt(0));
		System.out.println("str6��° ����:"+str.charAt(6));
		// substring-���ڿ� �ڸ���
		System.out.println("str���� 0~5���� ���ڿ�:"+str.substring(0,5));
		System.out.println("str���� 6~10���� ���ڿ�:"+str.substring(6,11));
		// IndexOf,lastIndexOf-���ڿ����� Ư�� ���� �ε��� ����
		System.out.println("str���� �տ��� ���� ���� e �ε���:"+str.indexOf("e"));
		System.out.println("str���� �ڿ��� ���� ���� e �ε���:"+str.lastIndexOf("e"));
		// replace-���ڿ� ��ü
		System.out.println("str���ڿ����� 'korea'�� 'busan'���� ��ü:"+str.replace("korea", "busan"));
		System.out.println("str���ڿ����� 'hello'�� 'welcome'���� ��ü:"+str.replace("hello", "welcome"));
		//valueOf-�⺻Ÿ�Ը� ���ڿ��� ��ȯ
		int var1 =1;
		double var2 =2.13;
		boolean var3 =true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
	}

}
