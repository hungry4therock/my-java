package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertTest {
	public static void main(String[] args) {
		//db����
		String host="jdbc:mysql://192.168.10.114:3306/828hjchoi";
		String user="828hjchoi";
		String pass="1234";
				
		try {
			//1�ܰ�-jdbc����̺� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			//2�ܰ�-����������
			Connection conn =DriverManager.getConnection(host,user,pass);
			//3�ܰ� sql ���ఴü ����
			Statement stmt =conn.createStatement();
			//4�ܰ�-sql����
			String sql ="insert into `user1` Values('J101','������','010-1211-1010',27);";
			stmt.executeUpdate(sql);
			//5�ܰ�-��� �� ó�� (insert �� ���)
					
			//6�ܰ�-�����ͺ��̽� ����
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("����");
	}

}
