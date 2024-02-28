package swing;

import javax.swing.*;
import java.awt.*;

class program02a extends JFrame {
    private JLabel item1;
    private JLabel item2;

    program02a() {
        super("The title bar");
        setLayout(new FlowLayout());
        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("This is gona show up on hover");
        add(item1);
    }
}

class program02 {
    public static void main(String[] args) {
        program02a o1 = new program02a();
        o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o1.setSize(100, 200);
        o1.setVisible(true);
    }
}
	

	
