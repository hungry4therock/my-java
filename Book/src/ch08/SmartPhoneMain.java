package ch08;

public class SmartPhoneMain {
		public static void main(String[] args) {
			phone p =new phone();
			p.name ="��ȭ��";
			p.company="����";
			p.color="ȭ��Ʈ";
			
			System.out.println("phone ���");
			System.out.println(p.name);
			System.out.println(p.company);
			System.out.println(p.color);
			p.call();
			p.receive();
			
			smartPhone sp =new smartPhone();
			sp.name ="������";
			sp.company="�Ｚ";
			sp.color="��";
			
			System.out.println(sp.name);
			System.out.println(sp.company);
			System.out.println(sp.color);
			
			sp.call();
			sp.receive();
			sp.installApp();
			
			
			
		}

}
