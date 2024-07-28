package Array;

public class Second_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,2,30,5,6,88,43};
		int n = arr.length;
		
		int Largest = Integer.MIN_VALUE;
		for(int i =0; i<n ; i++) {
			if(arr[i] > Largest) {
				Largest = arr[i];
				
			}
			 
		}
		System.out.println("Largest number is :" + Largest);
		
		int SecondLargest = Integer.MIN_VALUE;
		for(int i =0; i < n ; i++) {
			if(arr[i] > SecondLargest && arr[i] < Largest) {
				SecondLargest = arr[i];
			}
		}
		System.out.println("Second Largest Element is :" + SecondLargest);
		 

	}

	

}
