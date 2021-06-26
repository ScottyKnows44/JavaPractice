import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromString("anna"));
        System.out.println(isPalindromString("Kayak"));
        System.out.println(isPalindromString("James"));
        System.out.println(isPalindromString("Table"));
    }

    public static boolean isPalindromString(String text){
        //reverses string
       String reverse = reverse(text.toLowerCase());
        //checks to see if reverse string is the same as text parameter
        if(text.toLowerCase().equals(reverse)){
            return true;
        }
        return false;
    }

    public static String reverse(String input){
        //checks if string is empty or null
        if(input == null || input.isEmpty()){
            return input;
        } 
        //returns string in reverse format
        return input.charAt(input.length() -1 ) + reverse(input.substring(0, input.length() - 1));
    }
}
