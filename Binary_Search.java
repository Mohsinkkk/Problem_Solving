package Array;

public class Binary_Search {
	
	public static int  BinearSearch(int [] number , int key) {
		int start = 0;
		int end = number.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(number[mid] == key) {
				return mid;
			}else if(number[mid] < key) { //right
				start = mid+1;
			}else { //left
				end = mid - 1;
			}
		}
		return -1;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {2,4,6,8,10,12,14,16};
		int key = 14;
		
		System.out.println(" Index of Key is  : " + BinearSearch(number,key));

	}

}
