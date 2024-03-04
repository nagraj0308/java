package best450;

public class P012MergeTwoSortedArray {
    static int[] arr1 = {2, 4, 6, 8, 10, 18, 20};
    static int[] arr2 = {6, 8, 10, 12, 14, 16, 18, 22};

    public static void main(String[] args) {

        merge(arr1.length, arr2.length);
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        for (int x : arr2) {
            System.out.print(x + " ");
        }

    }

    static void merge(int m, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int j, last = arr1[m - 1];
            for (j = m - 2; j >= 0 && arr1[j] > arr2[i];j--)
                arr1[j + 1] = arr1[j];

            // If there was a greater element
            if (last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
}
