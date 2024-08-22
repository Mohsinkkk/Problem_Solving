package String;

public class check_if_Stirng_Palindrome {
    public static boolean palindromNumber(String  str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }    
        }
        return true;

    }
        public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindromNumber(str));

    } 
}

