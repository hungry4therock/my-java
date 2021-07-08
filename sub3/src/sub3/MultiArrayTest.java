package sub3;

public class MultiArrayTest {
	//1차원 배열
	int[] scores = {80,60,78,62,92};
	int sum =0;
	
	for(int i=0; i<scores.length;i++) {
		sum += scores[i];
	}
	System.out.println("배열 score의 합:"+sum);
		//2차원 배열
	int[][]arr2d = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}};
	for(int a=0;a<3;a++) {
		System.out.println("배열 arr2d["+a+"]["+b+"]:"arr2d[a][b]);
	}	
	//3차원 배열
	int[][][]arr3d = 	{{	{1,2,3},
							{4,5,6},
							{7,8,9}},
								{{10,11,12},
								{13,14,15},
								{16,17,18}},
									{{19,20,21},
									{22,23,24},
									{25,26,27}}};
	
	System.out.println("3차원 배열arr4d[0][1][1]:"+arr3d[0][1][1]);
	System.out.println("3차원 배열arr4d[1][1][0]:"+arr3d[1][1][0]);
	System.out.println("3차원 배열arr4d[2][0][2]:"+arr3d[2][0][2]);
	
}
