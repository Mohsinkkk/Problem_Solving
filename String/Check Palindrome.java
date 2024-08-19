package String;

public class IsPalindrome {
    public boolean isPalindrome(String str) {
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){

            }
            left++;
            right--;
        }
        return true;
        
    }
    public static void main(String[] args) {
        String str = "abba";

        IsPalindrome plm = new IsPalindrome();
        boolean result = plm.isPalindrome(str);
        System.out.println("Palindrom number is :" + result);
    }
    
}
