package best450;

public class P016CountInversions {

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(
                getInvCount(arr, arr.length));

    }

    static int getInvCount(int[] arr, int n) {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }
}
