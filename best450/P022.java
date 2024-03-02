package best450;

public class P022 {

    public static void main(String[] args) {
        int[] arr = {23, 5, 16, 29, 2, 40, 6, 8, 10, 18, 20};
        int K = 12;
        int max = arr[0];
        int min = arr[0];
        int mni = 0;
        int mxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                mxi = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                mni = i;
            }
        }
        System.out.println(mni + " " + mxi + " " + arr[mni] + " " + arr[mxi]);
        if ((2 * K) < (max - min)) {
            System.out.println((max - min) - 2 * K);
        } else {
            System.out.println((max - min));
        }

    }
}
