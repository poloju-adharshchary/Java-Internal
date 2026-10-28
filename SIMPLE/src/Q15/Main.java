package Q15;

import javax.swing.*;

public class Main extends JFrame {
    Main() {
        String[] col = {"Roll No", "Name", "Marks"};

        String[][] data = {
            {"101", "Amit", "85"},
            {"102", "Rahul", "90"},
            {"103", "Priya", "88"},
            {"104", "Ravi", "78"}
        };

        JTable t = new JTable(data, col);
        add(new JScrollPane(t));
    
        setTitle("JTable Example");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}