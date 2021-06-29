import java.util.function.BinaryOperator;

public class main {
    public static void main(String[] args) {
        int[] array = { 0,1,2,3,4,5,6,7,8,9,10};
        int result = binarySearch(array, 0 , array.length-1, 6);
        System.out.println(result);
    }

    static int binarySearch(int[] array, int low, int high, int numberWanted){
        if(high >= low){
            int mid = low + (high - low) / 2;

            if(array[mid] == numberWanted){
                return mid;
            }

            if(array[mid] > numberWanted){
                return binarySearch(array, low, mid -1, numberWanted );
            }

            return binarySearch(array, mid+1, high, numberWanted);
        }
        return -1;
    }
}
