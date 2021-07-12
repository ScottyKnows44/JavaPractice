import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println(isMatch("Evsdent", "tnsefvE"));
    }

    public static boolean isMatch(String x, String w){
        if(x.length() == w.length()){
            char[] array1 = x.toCharArray();
            char[] array2 = w.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            return Arrays.equals(array1, array2);
        }
        return false;
    }
}
