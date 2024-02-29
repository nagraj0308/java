package best450;

public class P002MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {6, 24, 2, 3, 5, 20, 543, 34};
        int min = arr[0];
        int max = arr[0];

        for (int x : arr) {
            if (min < x) min = x;
            if (max > x) max = x;
        }

        System.out.println(min + " " + max);
    }
}
