package best450;

public class P018FindAllPairsOnIntegerArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(
                getInvCount(arr, arr.length, 6));
    }

    static int getInvCount(int[] arr, int n, int k) {
        int max = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (k == (arr[j] + arr[i])) max++;
        return max;
    }


}
