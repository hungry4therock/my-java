package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		//�迭
		int[] nums= {1,2,3,4,5};
		//�迭 ����
		System.out.println("�迭 nums�� ������ ���� : "+nums.length);
		//�迭 ���� ���
		System.out.println("�迭 numsdml 1��° ����:nums[0]");
		System.out.println("�迭 numsdml 2��° ����:nums[1]");
		System.out.println("�迭 numsdml 3��° ����:nums[2]");
		//�迭�ݺ���
		for(int num:nums) {
			System.out.println("�迭 nums�� ����:"+num);
		}
		String[]people= {"������","������","�庸��","������","�̼���"};
		for(String person:people) {
			System.out.println("people����:"+person);
		}
}
}
		
		

