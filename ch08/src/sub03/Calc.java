package sub03;

public class Calc {
	
	private static Calc instace = new Calc();
	
	public static Calc getInstace() {
		return instace;
	}
	
	private Calc() {
	
	}
	
	public void plus(int s, int y) {
		return x + y;
	}
	
	public void minus(int s, int y) {
		return x - y;
	}
	
	public void multi(int s, int y) {
		return x * y;
	}
	
	public void div(int s, int y) throws Exception{
		
		if(y==0) {
			Exception e = new Exception("y�� 0�� �Ǿ�� �ȵ˴ϴ�");
			throw e1;
		}else if(y<0) {
			Exception e2 = new Exception("y�� ������ �Ǹ� �ȵ˴ϴ�")
		}
		
		
		return x /y;
	}
}
