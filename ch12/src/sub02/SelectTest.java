package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectTest {
	
	public static void main(String[] args) {
		
		//db����
		String host="jdbc:mysql://192.168.10.114:3306/828hjchoi";
		String user="828hjchoi";
		String pass="1234";
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ����(SELECT���� executeQuery�� ����)
			String sql = "SELECT * FROM `user1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5�ܰ� - ����� ó��(SELECT�� ���)
			while(rs.next()) {
				
				String uid  = rs.getString(1);
				String name = rs.getString(2);
				String hp   = rs.getString(3);
				int    age  = rs.getInt(4);
				
				System.out.println("===============");
				System.out.println("���̵� : "+uid);
				System.out.println("�̸� : "+name);
				System.out.println("�޴��� : "+hp);
				System.out.println("���� : "+age);
				System.out.println("---------------");
			}
			
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
}


