
public class ArrayAvg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0,avg;
		for (int i=0;i<6;i++) {
			sum=sum+arr[i];
		}
	
		avg=sum/arr.length;
		System.out.println("Average is "+avg);
	}
}

