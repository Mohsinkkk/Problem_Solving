package Array;

public class Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,5,0,3,8};
		
		System.out.println("Smallest Number is :" + smallestNumber(arr));
		
	}
	public static int smallestNumber(int number []) {
		
		int smallest = Integer.MAX_VALUE;
		for ( int i =0 ; i < number.length; i++) {
			if(smallest > number[i]) {
				smallest = number[i];
				
			}
			
		}
		return smallest;
	}

}
