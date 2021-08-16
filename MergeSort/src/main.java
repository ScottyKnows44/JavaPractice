public class main {

    public static void merge(int[] arr, int l, int m, int r){
        //Find sizes of two subarrays to be merge
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i<n1;i++){
            L[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[m + 1 + j];
        }

        //Initial index of merged subarray array
        int i=0, j = 0;

        int  k = l;
        while(i <n1 && j <n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
       if(l<r){
           //Find the middle
           int m = l + (r-l)/2;
           //sort bottom half of array
           sort(arr,l,m);
           //sort top half of array
           sort(arr, m+1, r);

           merge(arr, l, m, r);
       }
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        main ob = new main();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
