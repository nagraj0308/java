package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

@SuppressWarnings("unchecked")
class program08a extends JFrame {
    private JList list;
    private static String[] colornames = {"black", "blue", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    @SuppressWarnings("unchecked")
    program08a() {
        super("Title");
        setLayout(new FlowLayout());
        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent ie) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);

                    }
                });
    }
}

class program08 {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        program08a o1 = new program08a();
        o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o1.setSize(350, 100);
        o1.setVisible(true);
    }
}

		
	