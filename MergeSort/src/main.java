public class main {

    public static void merge(int[] arr, int l, int m, int r){

        //Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy data to temp arrays
        for(int i = 0 ; i < n1; i++){
            L[i] = arr[l +i];
        }
        for(int j = 0; j < n2; j++ ){
            R[j] = arr[m +  1 + j];
        }

        //Merge the temp arrays

        //Initial indexes of first and second subarrays
        int i = 0, j = 0;

        //Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] =L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int mid = l + (r -l) / 2;

            //Sort first and second halves
            sort(arr, l, mid);
            sort(arr, mid+1, r);

            //merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 1};

        System.out.println("Given Array");
        printArray(arr);

        sort(arr, 0, arr.length -1);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
