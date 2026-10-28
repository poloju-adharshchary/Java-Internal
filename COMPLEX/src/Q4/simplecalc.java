package Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simplecalc extends JFrame implements ActionListener {
	int a,c;
	JTextField t;
	String[] bn= {"7","8","9","+","4","5","6","-","1","2","3","*","0","%","=","C"};
	JButton[] b=new JButton[bn.length];
	String op;
	simplecalc() {
		setTitle("Simple Claculator");
		setLayout(new BorderLayout());
		
		t=new JTextField();
		add(t,BorderLayout.NORTH);
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel p = new JPanel(new GridLayout(4,4,5,5));
		for(int i=0;i<bn.length;i++) {
			b[i]=new JButton(bn[i]);
			p.add(b[i]);
			b[i].addActionListener(this);
		}
		add(p,BorderLayout.CENTER);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String v=e.getActionCommand();
		try {
			
		if(v.matches("[0-9]")) {
			t.setText(t.getText()+v);
		}
		else if(v.equals("C")) {
			t.setText("");
		}
		else if(v.equals("=")) {
			c=Integer.parseInt(t.getText());
			int r=0;
			switch(op) {
			case "+": r = a + c; break;
			case "-": r = a - c; break;
            case "*": r = a * c; break;
            case "%": r = a % c; break;
			}
			t.setText(String.valueOf(r));
		} else {
			a=Integer.parseInt(t.getText());
			op=v;
			t.setText("");
		}}
		catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero");
            t.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            t.setText("");
        }
	}
    
	public static void main(String[] args) {
        new simplecalc();
    }
}