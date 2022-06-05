package abstractAction;

import java.awt.event.*;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class PrintHelloAction extends AbstractAction {

	PrintHelloAction(){
		super("Print");
		putValue(Action.SHORT_DESCRIPTION, "Hello World");
	}
	
	public void actionPerformed(ActionEvent actionEvent) {
		System.out.println("Hello, world");
	}
	
}
