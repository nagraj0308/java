package best450;

import java.util.Arrays;

public class P001ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 1, 4, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                System.out.print(arr[i]);
        }
    }
}
