package Q12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    Main() {
        JTextArea t=new JTextArea();
        add(new JScrollPane(t));
        
        JPopupMenu p=new JPopupMenu();
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_DOWN_MASK));
        
        p.add(cut);
        p.add(copy);
        p.add(paste);
        cut.addActionListener(e ->t.cut());
        copy.addActionListener(e ->t.copy());
        paste.addActionListener(e ->t.paste());
        t.setComponentPopupMenu(p);
        setTitle("Popup menu example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Main();
    }
}