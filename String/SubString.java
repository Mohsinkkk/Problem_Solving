package String;

public class Substring {
    public static String SubString(String str , int si, int ei) {
        String strbr = "";
        for(int i=si; i<ei; i++){
            strbr = strbr + str.charAt(i);
        }
        return strbr;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        // System.out.println(str.substring(0,5));
        System.out.println(SubString(str, 0, 5));
    }
    
}
