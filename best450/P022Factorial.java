package best450;

public class P022Factorial {

    public static void main(String[] args) {
        factorial(100);
    }

    static void factorial(int n) {
        int[] res = new int[500];

        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    static int multiply(int x, int[] res, int resn) {
        int carry = 0;
        for (int i = 0; i < resn; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        while (carry != 0) {
            res[resn] = carry % 10;
            carry = carry / 10;
            resn++;
        }
        return resn;
    }
}
