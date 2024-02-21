package basics;


class program06a extends Thread {
    program06a() {
        start();
    }

    public void run() {
        try {
            int a = 1;
            while (a < 10) {
                System.out.println("A");
                Thread.sleep(1000);
                a++;
            }
        } catch (Exception k) {
            System.out.println(k.toString());
        }

    }


}

class program06b extends Thread {
    program06b() {
        start();
    }

    public void run() {
        try {
            int a = 1;
            while (a < 10) {
                System.out.println("B");
                Thread.sleep(1000);
                a++;
            }
        } catch (Exception k) {
            System.out.println(k.toString());
        }
    }
}


class program06 {
    public static void main(String[] args) {
        program06a o1 = new program06a();
        program06b o2 = new program06b();
    }


}
