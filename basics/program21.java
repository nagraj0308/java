package basics;

import java.awt.*;

class program21a extends Frame {
    Thread t;
    TextField t1, t2;

    program21a() {
        t = new Thread((Runnable) this, "NC");
        t1 = new TextField(5);
        t2 = new TextField(5);
        setSize(200, 200);
        setVisible(true);
        add(t1);
        add(t2);
        setLayout(new FlowLayout());
    }


}

public class program21 {
    public static void main(String[] args) {
        program21a o1 = new program21a();
    }
}
