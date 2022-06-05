package focusPack;

import java.awt.*;
import java.awt.event.*;


public class ActionFocus implements ActionListener{
	public void actionPerformed(ActionEvent actionEvent) {
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.focusNextComponent();
	}
}
