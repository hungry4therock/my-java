package sub02;

public class ExceptionsTest {
	public static void main(String[] args) {
		//배열 인덱스 번호 에러
		int arr[]=new int[3];
		
		for(int i=0; i<=3;i++) {
			try {
				arr[i]=i+1;
			}catch(Exception e) {
				e.printStackTrace();
			}
			arr[i]=i+1;
		}
		for(int num:arr) {
			System.out.println("num:"+num);
		}
		
		//nullpointer에러
		try {
			Tiger tiger =null;
			
			tiger.move();
			tiger.hunt();	
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
			
		//casting
		try {
			Animal a1 = new Eagle();
			Animal a2 = new Shark();
			
			Eagle eagle=(Eagle)a1;
			Shark shark=(Shark)a1;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
	}

}
