import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        System.out.println("Original array");
        printArray(arr, n);


        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            //Recursively sort elements before
            //partition and after partition
            quickSort(arr, low, pi -1);
            quickSort(arr, pi + 1, high);
        }
    }

    /*This function takes last element as pivot, places the pivot element at its correct position
    in sorted array, and places all smaller (smaller than pivot) to left of pivot and all greater to the right
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1); // index of smaller element
        for(int j = low; j <= high - 1; j++){
            //If current element is smaller than or equal to pivot
            if(arr[j] < pivot){
                i++;
                //swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        //swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i + 1, high);
        return(i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
