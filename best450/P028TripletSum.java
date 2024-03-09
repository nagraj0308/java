package best450;

public class P028TripletSum {

    public static void main(String[] args) {
        int x = 13;
        int[] arr = {1, 4, 45, 6, 10, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + x);
                    }
                }
            }
        }
    }
}
