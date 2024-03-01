package best450;

public class P007CyclicallyRotateArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 18, 20};
        int t = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = t;
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
