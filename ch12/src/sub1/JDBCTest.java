package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String[] args) {
		//db정보
		String host="jdbc:mysql://192.168.10.114:3306/828hjchoi";
		String user="828hjchoi";
		String pass="1234";
		
		try {
			//1단계 = jdbc 드라이브 로드
			Class.forName("com.mysql.jdbc.Driver");
			//2단계 = 데이터베이스 접속
			Connection conn= DriverManager.getConnection(host,user,pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		//3단계 = sql 실행객체 생성
		//4단계 = sql 실행
		//5단계 = sql 결과 처리(select일 경우)
		//6단계 = 데이터베이스 접속 종료
		
		System.out.print("프로그램 종료");
	}
}
