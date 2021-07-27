import java.util.Arrays;

public class main {
    public static void mergeSortedArrays(int[] first, int[] second){
        int[] newArray = new int[first.length + second.length];
        System.arraycopy(first, 0, newArray, 0, first.length);
        System.arraycopy(second, 0, newArray, first.length, second.length);
        Arrays.sort(newArray);
        System.arraycopy(newArray, 0, first, 0, first.length);
        System.arraycopy(newArray, first.length, second, 0, second.length);
    }

    public static void main(String[] args) {
        int[] first = { 1, 3 ,6,7,8,9,23,33,555,6666,77777,888888,9999999};
        int[] second = { 2, 4, 9,10,11,12,13,14,15,15,15,16,17 };
        mergeSortedArrays(first, second);
        System.out.println("Array1: " + Arrays.toString(first));
        System.out.println("Array2: " + Arrays.toString(second));
    }

}
