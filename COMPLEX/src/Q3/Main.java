package Q3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener {
	JTextField n1,n2,res;
	JButton div;
	Main(){
		setLayout(new FlowLayout());
		setTitle("Java Division");
		
		add(new Label("Num1: "));
		n1=new JTextField(20);
		add(n1);
		
		add(new Label("Num2: "));
		n2=new JTextField(20);
		add(n2);
		
		add(new Label("Result: "));
		res=new JTextField(20);
		add(res);
		res.setEditable(false);
		
		div=new JButton("Divide");
		add(div);
		div.addActionListener(this);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		try {
		int num1=Integer.parseInt(n1.getText());
		int num2=Integer.parseInt(n2.getText());
		int result=num1/num2;
		res.setText(String.valueOf(result));
		} 
		catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(this," Enter Only Integers");
		}
		catch(ArithmeticException ex) {
			JOptionPane.showMessageDialog(this," Cannot Divide By Zero");
		}
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
