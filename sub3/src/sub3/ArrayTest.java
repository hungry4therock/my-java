package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		//배열
		int[] nums= {1,2,3,4,5};
		//배열 길이
		System.out.println("배열 nums의 원소의 갯수 : "+nums.length);
		//배열 원소 출력
		System.out.println("배열 numsdml 1번째 원소:nums[0]");
		System.out.println("배열 numsdml 2번째 원소:nums[1]");
		System.out.println("배열 numsdml 3번째 원소:nums[2]");
		//배열반복문
		for(int num:nums) {
			System.out.println("배열 nums의 원소:"+num);
		}
		String[]people= {"김유신","김춘추","장보고","강감찬","이순신"};
		for(String person:people) {
			System.out.println("people원소:"+person);
		}
}
}
		
		

