package Array;

public class Second_Smallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,2,30,5,6,88,43};
		int n = arr.length;
		
		
		int smallest = Integer.MAX_VALUE;
		for(int i =0; i < n; i++) {
			if(arr[i] < smallest ) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Number is :" + smallest);
		
		int Second_smallest = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] < Second_smallest && arr[i] > smallest) {
				Second_smallest = arr[i];
				
			}
				
		}
		System.out.println("Second Smallest Number is : " + Second_smallest);

	}

}
