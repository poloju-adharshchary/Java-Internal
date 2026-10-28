package Q11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
	Main(){
		JTabbedPane p =new JTabbedPane();
		JPanel p1  = new JPanel();
		JPanel p2  = new JPanel();
		JPanel p3  = new JPanel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		p.addTab("RED",p1);
		p.addTab("GREEN",p2);
		p.addTab("BLUE", p3);
		add(p);
		setTitle("JtabbedPane example");
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main();
	}

}
