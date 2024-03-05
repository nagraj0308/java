package best450;

public class P017BuySellStock {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(
                getInvCount(arr, arr.length));
    }

    static int getInvCount(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (max < (arr[j] - arr[i])) max = arr[j] - arr[i];
        return max;
    }
}
