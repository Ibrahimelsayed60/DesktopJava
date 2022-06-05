package abstractAction;

import java.awt.*;
//import java.awt.Desktop.Action;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;


public class ActionTester {

	public static void main(String args[]) {
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Abstract Action Practice");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				final Action printAction = new PrintHelloAction();
				JMenuBar menuBar = new JMenuBar();
				JMenu menu = new JMenu("code 1");
				menuBar.add(menu);
				menu.add(new JMenuItem(printAction));
				JToolBar toolBar = new JToolBar();
				toolBar.add(new JButton(printAction));
				JButton enableButton = new JButton("Enable");
				ActionListener enableActionListener = new ActionListener() {
					public void actionPerformed(ActionEvent actionEvent) {
						printAction.setEnabled(true);
					}
				};
				enableButton.addActionListener(enableActionListener);
				JButton disableButton = new JButton("Disable");
				ActionListener disableActionListener = new ActionListener() {
					public void actionPerformed(ActionEvent actionEvnet) {
						printAction.setEnabled(false);
					}
				};
				disableButton.addActionListener(disableActionListener);
				JButton relableButton = new JButton("Change Label");
				ActionListener relabelActionListener = new ActionListener() {
					public void actionPerformed(ActionEvent actionEvnet) {
						printAction.putValue(Action.NAME,"Changed Label");
					}
				};
				relableButton.addActionListener(relabelActionListener);
				JPanel buttonPanel = new JPanel();
				buttonPanel.add(enableButton);
				buttonPanel.add(disableButton);
				buttonPanel.add(relableButton);
				frame.setJMenuBar(menuBar);
				frame.add(toolBar,BorderLayout.SOUTH);
				frame.add(buttonPanel,BorderLayout.NORTH);
				frame.setSize(300,150);
				frame.setVisible(true);
			}
			
		};
		EventQueue.invokeLater(runner);
	}
	
	
}
