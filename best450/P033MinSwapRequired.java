package best450;

public class P033MinSwapRequired {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        System.out.println(minSwap(arr, arr.length, 5));

    }

    public static int minSwap(int[] arr, int n, int k) {
        int snowBallSize = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                snowBallSize++;
            }
        }

        int swap = 0, ans_swaps = Integer.MAX_VALUE;

        for (int i = 0; i < snowBallSize; i++) {
            if (arr[i] > k)
                swap++;
        }

        ans_swaps = Math.min(ans_swaps, swap);

        for (int i = snowBallSize; i < n; i++) {
            if (arr[i - snowBallSize] <= k && arr[i] > k)
                swap++;
            else if (arr[i - snowBallSize] > k
                    && arr[i] <= k)
                swap--;
            ans_swaps = Math.min(ans_swaps, swap);
        }
        return ans_swaps;
    }


}
