package best450;

import java.util.ArrayList;

public class P014MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        ArrayList<int[]> list = new ArrayList<>();
        int[] a = arr[0];
        int[] temp = arr[0];
        for (int[] i : arr) {
            if (a[1] < i[0]) {
                list.add(a);
                a = i;
                System.out.println(a[0] + ":" + a[1]);
            } else if (a[1] < i[1]) {
                temp = i;
                a[1] = i[1];
                System.out.println(a[0] + ":" + a[1]);
            }

        }

        for (int[] b : list) {
            System.out.println(b[0] + "," + b[1]);
        }

    }
}
