package sub03;

public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		/* ���������� �ϳ��� �ν��Ͻ��� �����Ǿ� �����ȴ�.
		 * ���������� ���� �Ҵ翵���� �����Ǿ� �ֱ� ������ ��ü�� ���� ���� �ٷ� ������ �� �ִ�.
		 */
		
		Increment.num2 += 3;
		Increment.add();
		
		//�̱��� ��ü ���� 185
		Calc c =Calc.getInstance();
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(3, 2);
		int r4 = c.div(4, 2);
		
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
		System.out.println("r3:"+r3);
		System.out.println("r4:"+r4);
			
	}
}
