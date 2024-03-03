package best450;

public class P011FindDuplicateN1 {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 18, 20};
        int[] arr2 = {6, 8, 10, 12, 14, 16, 18, 22};
        int[] u = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length && arr1[i] < arr2[j]) {
                u[i + j] = arr1[i];
                i++;
            } else {
                u[i + j] = arr2[j];
                j++;
            }
            System.out.println(i + " " + j + " " + u[i + j - 1]);
        }

    }
}
