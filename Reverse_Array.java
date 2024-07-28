package Array;

public class Reverse_Array {

	public static void reverseArray(int[]numbers){
		int firstIndex= 0;
		int lastIndex = numbers.length-1;
		
		while(firstIndex < lastIndex) {
			int temp = numbers[firstIndex];
			numbers[firstIndex] = numbers[lastIndex];
			numbers[lastIndex] = temp;
			
			firstIndex++;
			lastIndex--;
	}
	
}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {2,4,6,8,10,12,14,16};
		
		reverseArray(numbers);
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
	    System.out.println();
					
	}

}


