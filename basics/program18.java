package basics;

import java.io.File;
import java.util.Scanner;

class program18a {
    private Scanner x;

    public void openfile() {
        try {
            x = new Scanner(new File("/Users/macbookpro/java/basics/program18a.txt"));
        } catch (Exception e) {
            System.out.println("Could not find the file");
        }
    }

    public void readfile() {
        while (x.hasNext()) {
            String a = x.next();
            String b = x.next();
            String c = x.next();
            System.out.printf("\n %s %s %s", a, b, c);
        }
    }

    public void closefile() {
        x.close();
    }

}


class program18 {
    public static void main(String[] args) {
        program18a o1 = new program18a();
        o1.openfile();
        o1.readfile();
        o1.closefile();

    }
}