package basics;

public class program15 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5}, {1, 2, 3}, {1}};
        display(a);
        System.out.println(avg(1, 2, 3, 4, 5, 6));
    }

    public static void display(int[][] x) {
        for (int[] a : x)
            for (int anInt : a) System.out.println(anInt);
    }

    //variable length argument
    public static int avg(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;
        return total / numbers.length;
    }
}
