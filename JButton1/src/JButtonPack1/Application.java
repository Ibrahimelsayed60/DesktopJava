package JButtonPack1;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("DefaultButton");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new GridLayout(2,2,10,10));
				JButton button1 = new JButton("Text Button");
				frame.add(button1);
				String htmButton = "<html><sup>HTML</sup> <sub><em>Button</em></sub><br>"
						+ "<font color=\"#FF0080\"><u>Multi-line</u></font>";
				
				JButton button2 = new JButton(htmButton);
				frame.add(button2);
				JRootPane rootPane = frame.getRootPane();
				frame.setSize(300,200);
				frame.setVisible(true);
				
			}
		};
		EventQueue.invokeLater(runner);
	}
	
}
