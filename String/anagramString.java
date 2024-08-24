package String;

public class anagramString {
    public boolean  isAnagram(String str1, String  str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        int anagrm[] = new int[26];
        for(int i =0; i<str1.length(); i++){
            anagrm[str1.charAt(i)-'a']++;
            anagrm[str2.charAt(i)-'a']--;
        }

        for(int i =0; i<26; i++){
            if(anagrm[i] != 0){
                return false;            
            }

        }
        return true;

        
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        anagramString checker = new anagramString();
        boolean result = checker.isAnagram(str1, str2);

        System.out.println("Are the strings \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
        
        
        
    }
    
}
