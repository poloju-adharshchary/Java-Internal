package Q6;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main extends JFrame {
    Main() throws IOException {
                BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA LAB\\INTERNAL\\Table.txt"));
                ArrayList<String[]> data = new ArrayList<>();
                String s;
                int col = 0;

                while ((s = br.readLine()) != null) {
                    String[] a = s.split(",", -1);
                    data.add(a);
                    if (a.length > col)
                        col = a.length;
                }
                br.close();

                setLayout(new GridLayout(data.size(), col, 3, 3));
                setBackground(Color.black);

                for (String[] a : data) {
                    for (int i = 0; i < col; i++) {
                        String v = "";
                        if (i < a.length)
                            v = a[i].trim();

                        Label l = new Label(v, Label.CENTER);
                        l.setBackground(Color.WHITE);
                        add(l);
                    }
                }

                setTitle("Table Display");
                setSize(400, 300);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
            }

            public static void main(String[] args) throws IOException {
                new Main();
            }
        }