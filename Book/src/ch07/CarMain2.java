package ch07;

public class CarMain2 {
	public static void main(String[] args) {
		//carŸ���� �迭��ü ����
		Car[]cars = new Car[3];
		
		//car ��ü ����
		Car tico = new Car();
		tico.color="ȭ��Ʈ";
		tico.company="���";
		tico.type="����";
		
		//��� �ε����� tico ��ü ����
		for(int i = 0; i<cars.length; i++) {
			cars[i]=tico;
		}
		System.out.println("2�� �ε��� color:"+cars[2].color);
		cars[0].color="��";
		System.out.println("2�� �ε��� color:"+cars[2].color);
		
		//car Ÿ���� �迭��ü ����
		Car[] cars =new Car[3];
		//��� �ε����� new �����ڷ� ��ü ���� �� ����
		for (int i =0; i<cars.length;i++) {
			cars[i]=new Car();
			cars[i].color="ȭ��Ʈ";
			cars[i].company="���";
			cars[i].type="����";
		}
		
		System.out.println("0�� �ε��� color:"+cars[0].color);
		System.out.println("1�� �ε��� color:"+cars[1].color);
		System.out.println("2�� �ε��� color:"+cars[2].color);
		
		cars[0].color="��";
		
		System.out.println("0�� �ε��� color:"+cars[0].color);
		System.out.println("1�� �ε��� color:"+cars[1].color);
		System.out.println("2�� �ε��� color:"+cars[2].color);
	}

}


