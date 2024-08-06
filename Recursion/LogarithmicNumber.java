package Recursion;
import java.util.Scanner;

public class LogarithmicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int xn = Power(x , n);
        System.out.println(xn);
    }
    public static int Power(int x , int n){
        if(n == 0){
            return 1;
        }

        int xpnb2 = Power(x , n/2);
        int xn = xpnb2 * xpnb2;

        if(n % 2 == 1){
            xn = xn + x;
        }
        return xn;

	}

}
