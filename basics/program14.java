package basics;

public class program14 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        change(a);
        for (int k : a) System.out.println(k);
    }

    public static void change(int[] b) {
        for (int k = 0; k < b.length; k++)
            b[k] += 5;
    }

}
