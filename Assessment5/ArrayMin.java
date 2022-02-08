
public class ArrayMin {
public static void main(String[] args) {
	int arr[]= {22,65,3,63,6,4};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i])
			min=arr[i];
	}
     System.out.println("minimum element in array is "+min);
}
}
