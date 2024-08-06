

//Find the Largest and Smallest Number in Given Array.
package Array;

public class Largest_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number []= {2,3,4,10,3,2};
		System.out.println("Largest Number is :" + getlargestNumber(number));

	}
	public static int getlargestNumber(int number[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i =0 ; i < number.length; i ++) {
			if(largest < number[i]) {
				largest = number[i];
			}
			if(smallest > number[i]) {
				smallest = number [i];
			}
				
		}
		System.out.println("Smallest Number is : " + smallest);
		return largest;
	}

}
