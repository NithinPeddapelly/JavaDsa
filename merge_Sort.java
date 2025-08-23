public class merge_Sort {

    public static void pringArr(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int starting_i, int ending_i) {
        // work
        int mid = starting_i + (ending_i - starting_i) / 2; // to avoid integer overflow0

        mergeSort(arr, starting_i, mid); // sort left half
        mergeSort(arr, mid + 1, ending_i); // sort right half
        merge(arr, starting_i, mid, ending_i);
    }

    public static void merge(int arr[], int starting_i, int mid, int ending_i) {

        int temp[] = new int[starting_i - ending_i + 1]; // to avoid integer overflow
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
        

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 8, 3, 1, 4, 6, 7, 9, };
    }
}
