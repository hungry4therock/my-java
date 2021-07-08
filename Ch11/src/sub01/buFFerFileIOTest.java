package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class buFFerFileIOTest {
	public static void main(String[] args) {
		
		String path1 ="C:\\Users\\bigdate\\Desktop\\test1.txt";
		String path2 ="C:\\Users\\bigdate\\Desktop\\test2.txt";
		
		//파일과 입력스트림 연결
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value =0;
			while(true) {
				//스트림으로 부터 데이터 읽기
				value =fis.read();
				if(value==-1) {
					//더 이상 읽은 데이터가 없을 때 종료
					break;
				}
				
				char ch = (char)value;
				System.out.print(ch);
				
				for.write(value);
						
			}//while end
			
			//스트림 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료");
	}//main end

}
