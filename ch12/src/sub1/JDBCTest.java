package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String[] args) {
		//db����
		String host="jdbc:mysql://192.168.10.114:3306/828hjchoi";
		String user="828hjchoi";
		String pass="1234";
		
		try {
			//1�ܰ� = jdbc ����̺� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			//2�ܰ� = �����ͺ��̽� ����
			Connection conn= DriverManager.getConnection(host,user,pass);
			
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		//3�ܰ� = sql ���ఴü ����
		//4�ܰ� = sql ����
		//5�ܰ� = sql ��� ó��(select�� ���)
		//6�ܰ� = �����ͺ��̽� ���� ����
		
		System.out.print("���α׷� ����");
	}
}
