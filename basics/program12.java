package basics;

import java.util.Random;

public class program12 {

    public static void main(String[] args) {
        Random a = new Random();

        for (int counter = 1; counter < 100; counter++) {
            int b = 5 + a.nextInt(10);
            System.out.println(b);
        }
    }
}
