package Q10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame {
	Main(){
	String[] a= {"Java","C","C++","Python"};
	JList<String> l=new JList(a);
	setLayout(new FlowLayout());
	JLabel lb=new JLabel("Selected Item: ");
	add(l);
	add(lb);
	l.addListSelectionListener(e -> {
		if(!e.getValueIsAdjusting()) {
			lb.setText("Selected Item: "+l.getSelectedValue());
		}
	});
	setTitle("JList Example");
	setSize(300,250);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}
