package sub02;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) {
		String path ="C:\\Users\\bigdate\\Desktop\\city.properties";
		Properties props = new Properties();
		
	try {
		FileInputStream fis = new FileInputStream(path);
		
		props.load(fis);
		}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("101번 도시 : "+props.getProperty("101"));
	System.out.println("102번 도시 : "+props.getProperty("102"));
	}
}
