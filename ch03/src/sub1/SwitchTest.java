package sub1;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		String animal = "tiger";
		
		switch(animal) {
		
		case "lion":
			System.out.println("animal�� lion�Դϴ�");
			break;
		case "eagle":
			System.out.println("animal�� eagle�Դϴ�");
			break;
		case "tiger":
			System.out.println("animal�� tiger�Դϴ�");
			break;
		default:
			System.out.println("animal�� lion,eagle,tiger�� �ƴմϴ�");
			break;
		}
		
		//��������
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		
		int score = sc.nextInt();
		System.out.println("�Է�����:"+score);
		
		switch(score/10) {
		case 10:
		case 9 :
			System.out.println("a�Դϴ�");
			break;
		case 8 :
			System.out.println("b�Դϴ�");
			break;
		case 7 :
			System.out.println("c�Դϴ�");
			break;
		case 6 :
			System.out.println("d�Դϴ�");
			break;
		default:
			System.out.println("g�Դϴ�");
			break;
		
		}
		
		
		
	}

}
