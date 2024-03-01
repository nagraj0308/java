package best450;

public class P005MoveNegNumbersOneSide {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -34, 2, -3, 5, -7, 5, 23, 4, -5};
        int lpi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (lpi >= 0) {
                    int temp = arr[lpi];
                    arr[lpi] = arr[i];
                    arr[i] = temp;
                    lpi++;
                }
            } else {
                if (lpi == -1) lpi = i;
            }

        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
