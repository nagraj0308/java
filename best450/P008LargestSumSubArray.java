package best450;

public class P008LargestSumSubArray {

    public static void main(String[] args) {
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] arr = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int[] arr = {-2, -1, -3, -4, 0, -2, -1, -5, -4};


        int k = -1;
        int l = -1;
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (ls < sum) {
                    k = i;
                    l = j;
                    ls = sum;
                }
            }
        }
        System.out.print(k + " " + l + " " + ls);

    }

}
