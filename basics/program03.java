package basics;

public class program03 {
    public static void main(String[] args) {
        int a = 10;
        class program03a {
            void factor(int x) {
                int i = x;
                while (i > 0) {
                    if (x % i == 0)
                        System.out.print(i);
                    i--;
                }
            }
        }
        program03a o1 = new program03a();
        o1.factor(a);
    }
}
