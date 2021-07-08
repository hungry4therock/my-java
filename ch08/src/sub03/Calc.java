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
			Exception e = new Exception("y는 0이 되어서는 안됩니다");
			throw e1;
		}else if(y<0) {
			Exception e2 = new Exception("y는 음수가 되면 안됩니다")
		}
		
		
		return x /y;
	}
}
