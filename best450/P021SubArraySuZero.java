package best450;

public class P021SubArraySuZero {

    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(arr));
    }

    // Function Call
    static boolean maxSubArraySum(int[] arr) {

        boolean res = false;

        int k = -1;
        int l = -1;
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ( sum==0) {
                   res=true;
                }
            }
        }
        return res;
    }
}
