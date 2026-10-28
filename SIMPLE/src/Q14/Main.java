package Q14;

import javax.swing.*;
import javax.swing.tree.*;

public class Main extends JFrame {
    Main() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Courses");
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("ECE");

        root.add(c1);
        root.add(c2);

        c1.add(new DefaultMutableTreeNode("Java"));
        c1.add(new DefaultMutableTreeNode("Python"));

        c2.add(new DefaultMutableTreeNode("Digital Electronics"));
        c2.add(new DefaultMutableTreeNode("Networks"));

        JTree t = new JTree(root);
        //add(t);
        add(new JScrollPane(t));

        setTitle("JTree Example");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}