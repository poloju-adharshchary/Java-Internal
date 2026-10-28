package Q11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    
	String s = "";

    Main() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                s = "Mouse Clicked";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                s = "Mouse Pressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                s = "Mouse Released";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                s = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                s = "Mouse Exited";
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                s = "Mouse Moved";
                repaint();
            }

            public void mouseDragged(MouseEvent e) {
                s = "Mouse Dragged";
                repaint();
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
    	super.paint(g);
        g.drawString(s, 150, 150);
    }

    public static void main(String[] args) {
        new Main();
    }
}