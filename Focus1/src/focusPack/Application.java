package focusPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Focus sample");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ActionListener actionListener = new ActionFocus();
				MouseListener mouseListener = new MouseFocus();
				frame.setLayout(new GridLayout(3,3));
				for(int i = 1; i < 10; i++) {
					JButton button = new JButton(Integer.toString(i));
					button.addActionListener(actionListener);
					button.addMouseListener(mouseListener);
					if((i%2)!=0) {
						button.setFocusable(false);
					}
					frame.add(button);
				}
				frame.setSize(300,200);
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runner);

	}

}
