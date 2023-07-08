import java.util.Arrays;

class mergearrays {
    // Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = n - 1; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for merged array (arr1)

        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
            } else {
                j++;
            }
        }

        // Sort arr1 and arr2 separately
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    // Main function to test the merge function
    public static void main(String[] args) {
        long arr1[] = {1, 3, 5, 7};
        long arr2[] = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);
        

        // Printing the merged and sorted array
        for (long num1 : arr1) {
            System.out.print(num1 + " ");
        }
        for (long num2 : arr2) {
            System.out.print(num2 + " ");
        }
    }
}
