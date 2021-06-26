import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortTester {

    static int[] pancakeSort(int[] arr){
        return null;
    }

    static int[] flip(int[] arr, int k){
        for(int i = 0;i<k; i++, k--){
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    static void printArr(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arrFlipped = flip(arr, 5);
        printArr(arrFlipped);
    }
}
