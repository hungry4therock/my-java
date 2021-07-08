package sub03;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public void plus(int x, int y) {
		return x+y;
	}
	public void minus(int x, int y) {
		return x-y;
	}
	public void multi(int x, int y) {
		return x*y;
	}
	public void div (int x, int y) {
		return x/y;
	}
}
