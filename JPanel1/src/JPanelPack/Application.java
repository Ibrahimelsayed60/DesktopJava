package JPanelPack;

import java.awt.*;
import javax.swing.*;


public class Application extends JPanel {

	Color color;
	
	public Application() {
		this(Color.black);
	}
	
	public Application(Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(color);
		g.drawOval(0, 0, width, height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Oval Geometry");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new GridLayout(2,2));
				Color colors[] = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
				for(int i = 0; i < 4; i++) {
					Application panel = new Application(colors[i]);
					frame.add(panel);
				}
				frame.setSize(300,200);
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runner);
		
		
	}

}
