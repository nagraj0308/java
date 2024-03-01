package best450;

import java.util.Arrays;
import java.util.Scanner;

public class P003KthMinMax {
    public static void main(String[] args) {
        int[] arr = {43, 28, 3, 25, 34, 103, 35};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k > arr.length || k < 1) {
            System.out.println("Not possible");
        } else {
            Arrays.sort(arr);
            System.out.println(arr[k - 1] + ", " + arr[arr.length - k]);
        }

    }
}
