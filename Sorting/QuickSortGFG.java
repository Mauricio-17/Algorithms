package Sorting;

public class QuickSortGFG {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /* This function takes last partition element as pivot, places
       the pivot element at its correct position (and return its correct index) in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high) {
        // pivot
        int pivot = arr[high];
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
        // so the index is the last, the travel will be right to left traversal
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
                System.out.println(i+"-"+j);
            }
        }
        // if any condition at for fulfills, it swapes the values of both ends
        swap(arr, i + 1, high);
        return (i + 1);
    }
    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high) {
        // lowIndex and highIndex
        if (low < high) {
            // pi is partitioning index, arr[p]
            // is now at right place, in other words,
            // pi will store the index of the pivot at right place
            int pi = partition(arr, low, high);
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1); // left side partition
            quickSort(arr, pi + 1, high); // right side partition
        }
    }
    // Function to print an array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver Code
    public static void main(String[] args) {
        int[] arr = {7, 10, 8, 6};
        int n = arr.length;
        System.out.println("Current array: ");
        printArray(arr, n);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
// by: https://www.geeksforgeeks.org/quick-sort/
