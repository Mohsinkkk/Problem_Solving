package Recursion;
import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int xn = Power(x,n);
        System.out.println(xn);
    
    }
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = Power(x,n-1);
        int xn = x * xnm1;
        return xn;

	}

}
