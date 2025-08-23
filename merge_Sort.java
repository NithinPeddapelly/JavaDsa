public class merge_Sort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int starting_i, int ending_i) {

        if(starting_i >= ending_i){
            return;
        }
        // work
        int mid = starting_i + (ending_i - starting_i) / 2; // to avoid integer overflow0
        mergeSort(arr, starting_i, mid); // sort left half
        mergeSort(arr, mid + 1, ending_i); // sort right half
        merge(arr, starting_i, mid, ending_i);
    }

    public static void merge(int arr[], int starting_i, int mid, int ending_i) {

        int temp[] = new int[ending_i - starting_i + 1]; // to avoid integer overflow
        int i = starting_i; // iterate over left part
        int j = mid + 1; // iterate over right part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ending_i) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ending_i) {
            temp[k++] = arr[j++];
        }

        // Copy temp to orignal array

        for (k = 0, i = starting_i; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 8, 3, 1, 4, 6, 7, 9, };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
