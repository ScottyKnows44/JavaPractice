import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(smallestInt(array));
    }

    private static int smallestInt(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int length = array.length;
        for (int a: array) {
            set.add(a);
        }

        for(int i = 1; i <= length +1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 1;
    }
}
