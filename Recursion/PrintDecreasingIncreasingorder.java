package Recursion;
import java.util.Scanner;

public class PrintDecreasingIncreasingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PrintDecreasingIncreasing(n);
    }
    public static void PrintDecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDecreasingIncreasing(n-1);
        System.out.println(n);

	}

}
