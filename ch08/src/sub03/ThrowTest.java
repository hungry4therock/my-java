package sub03;

public class ThrowTest {
	public static void main(String[] args) {
		Calc cal = Calc.getInstace();
			
		int r1 =0, r2=0, r3=0;
		try {
			 r1 = cal.div(1, 2);
			 r2 = cal.div(1, 0);
			 r3 = cal.div(1,-1);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
		System.out.println("r3:"+r3);
		
		System.out.println("프로그램 종료");
	}
}
