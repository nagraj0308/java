package best450;

public class P031SmallestSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int k = 51;
        System.out.println(
                +maxSubArraySum(arr, k) + 1);
    }

    // Function Call
    static int maxSubArraySum(int[] a, int k) {

        int res = a.length + 1;


        for (int i = 0; i < a.length; i++) {
            int max_ending_here
                    = 0;
            for (int j = i; j < a.length; j++) {
                max_ending_here = max_ending_here + a[j];
                if (k <= max_ending_here) {
                    res = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
