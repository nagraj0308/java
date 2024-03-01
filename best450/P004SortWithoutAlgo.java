package best450;

public class P004SortWithoutAlgo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 2, 1, 0, 2, 0, 1, 0, 2, 1, 1, 0, 0};
        int[] res = new int[3];
        for (int x : arr) {
            res[x]++;
        }

        int n = 0;
        for (int x : res) {
            for (int i = 0; i < x; i++) {
                System.out.print(n);
            }
            n++;
        }
    }
}
