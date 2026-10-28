package Q13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JComboBox<Integer> c;
    JLabel l;

    Main() {
        setLayout(new FlowLayout());

        Integer[] a = {10, 20, 30, 40, 50};
        c = new JComboBox<>(a);
        l = new JLabel("Welcome To OOPs-Lab");

        add(c);
        add(l);

        c.addActionListener(this);

        setTitle("Font Size");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = (Integer) c.getSelectedItem();
        l.setFont(new Font("Arial", Font.PLAIN, n));
    }

    public static void main(String[] args) {
        new Main();
    }
}