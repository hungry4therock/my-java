package test2;

public class JavaTest09 {
	static int STACK_SIZE=10;
	static int stack[]=new int[STACK_SIZE];
	static int top=0;
	
	public static void main(String[] args) {
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
	public static void push(int data) {
		if(top==STACK_SIZE) {
			System.out.println("더이상 데이터를 저장할 수 없음");
		}
		stack[top++]=data;
	}
	public static int pop() {
		if(top==0) {
			System.out.println("데이터 없음\n");
			return 0;
		}
		return stack[--top];
	}
}
