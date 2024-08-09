package String;

public class TwoStringEquivalent {
    public boolean stringEquivalent(String []word1,String [] word2) {
        StringBuilder String1  = new StringBuilder();
        StringBuilder String2  = new StringBuilder();
        for(int i =0; i<word1.length;i++){
            String1.append(word1[i]);
        }
        for(int i =0;i<word2.length;i++){
            String2.append(word2[i]);
        }
        if(String1.toString().equals(String2.toString())){
            return true;
        } else{
            return false;
        }  

        
    }
    public static void main(String[] args) {
        String[]  word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        TwoStringEquivalent  two = new TwoStringEquivalent();
        boolean result = two.stringEquivalent(word1, word2);
        System.out.println(result);
    }
    
}
