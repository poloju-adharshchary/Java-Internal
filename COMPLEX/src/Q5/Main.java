package Q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JRadioButton r, y, g;
    JLabel l;
    ButtonGroup bg;

    Main() {
        setTitle("Traffic Light");
        setLayout(new FlowLayout());

        l = new JLabel("");
        l.setFont(new Font("Arial", Font.BOLD, 20));
        add(l);
        //l.setHorizontalAlignment(JLabel.CENTER);

        r = new JRadioButton("Red");
        y = new JRadioButton("Yellow");
        g = new JRadioButton("Green");

        bg = new ButtonGroup();
        bg.add(r);
        bg.add(y);
        bg.add(g);
      

        add(r);
        add(y);
        add(g);

        r.addActionListener(this);
        y.addActionListener(this);
        g.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (r.isSelected()) {
            l.setText("Stop");
            l.setForeground(Color.RED);
        } else if (y.isSelected()) {
            l.setText("Ready");
            l.setForeground(Color.YELLOW);
        } else if (g.isSelected()) {
            l.setText("Go");
            l.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
