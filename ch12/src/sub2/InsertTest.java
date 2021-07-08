package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertTest {
	public static void main(String[] args) {
		//db정보
		String host="jdbc:mysql://192.168.10.114:3306/828hjchoi";
		String user="828hjchoi";
		String pass="1234";
				
		try {
			//1단계-jdbc드라이브 로드
			Class.forName("com.mysql.jdbc.Driver");
			//2단계-데이터접속
			Connection conn =DriverManager.getConnection(host,user,pass);
			//3단계 sql 실행객체 생성
			Statement stmt =conn.createStatement();
			//4단계-sql실행
			String sql ="insert into `user1` Values('J101','김유신','010-1211-1010',27);";
			stmt.executeUpdate(sql);
			//5단계-결과 셋 처리 (insert 인 경우)
					
			//6단계-데이터베이스 종료
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
