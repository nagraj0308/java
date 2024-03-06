package best450;

public class P019CommonElementsInSortedArray {

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        int i = 0, j = 0, k = 0;
        while (true) {
            if (A[i] < B[j]) {
                i++;
            }
            if (A[i] > B[j]) {
                j++;
            }

            if (A[i] == B[j]) {
                if (C[k] < B[j]) {
                    k++;
                    if (A[i] == B[j] && B[j] == C[k]) {
                        System.out.println(A[i]);
                        i++;
                        j++;
                        k++;
                    }
                }

            }

            if (i >= A.length || j >= B.length || k >= C.length) break;


        }

    }
}
