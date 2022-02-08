
public class Add2Darray {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{3,4,5},{1,1,1}};
		int arr2[][]= {{2,2,3},{3,1,4},{1,2,1}};
		int sum[][]=new int[3][3];
		System.out.println("Sum of two matrices is :");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}

