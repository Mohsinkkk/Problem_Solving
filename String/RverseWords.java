package String;

public class RverseWords {
    public static void reverseWords(String str) {
        String [] words = str.split(" ");
        for(int i = words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();        
    }
    public static void main(String[] args) {
        String str = "Mohsin Khan";
        reverseWords(str);
        
    }
    
}
