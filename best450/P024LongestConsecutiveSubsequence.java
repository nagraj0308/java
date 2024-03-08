package best450;

import java.util.Arrays;

public class P024LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        Arrays.sort(arr);
        int msf = 1;
        int c1 = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + 1) == arr[i + 1]) {
                c1++;
                if (msf < c1) msf = c1;
            }
        }

        System.out.println(msf);

    }
}
