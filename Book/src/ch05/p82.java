package ch05;

public class p82 {
	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
		System.out.println("���� �ο� ����");
		if(score>=95) {
			grade = "a+";
		}else if(score>=90){
			grade = "a";
		}else if(score>=85){
			grade = "b+";
		}else if(score>=80){
			grade = "b";
		}else if(score>=75){
			grade = "c";
		}else if(score>=70){
			grade = "d";
		}else {
			grade="f";
		}
		System.out.println("��� ������"+grade+"�Դϴ�");
		System.out.println("�����ο� ��");
	}
}
