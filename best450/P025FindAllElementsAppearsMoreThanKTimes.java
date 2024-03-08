package best450;

import java.util.HashMap;
import java.util.Map;

public class P025FindAllElementsAppearsMoreThanKTimes {

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 2, 3, 5, 4,
                2, 2, 3, 1, 1, 1};
        int n = 12;
        int k = 4;
        moreThanNdK(a, n, k);

    }

    public static void moreThanNdK(int[] a, int n, int k) {
        int x = n / k;

        // Hash map initialization
        HashMap<Integer, Integer> y = new HashMap<>();

        // count the frequency of each element.
        for (int i = 0; i < n; i++) {
            // is element doesn't exist in hash table
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);

                // if element does exist in the hash table
            else {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }

        // iterate over each element in the hash table
        // and check their frequency, if it is more than
        // n/k, print it.
        for (Map.Entry m : y.entrySet()) {
            Integer temp = (Integer) m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }
}


