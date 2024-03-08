package best450;

public class P023MaxProductSubArray {

    public static void main(String[] args) {
        int[] a = {6, -3, -10, 0, 2};
        System.out.println(maxSubArraySum(a));
    }

    // Function Call
    static long maxSubArraySum(int[] a) {
        long max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;

        for (int j : a) {
            max_ending_here = max_ending_here + j;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
