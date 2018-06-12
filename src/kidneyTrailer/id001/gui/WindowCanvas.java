package kidneyTrailer.id001.gui;

import java.awt.Canvas;

public class WindowCanvas extends Canvas {
	private static final long serialVersionUID = -5455911271341988653L;
	
	String title = null;
	protected Window window;
	
	public WindowCanvas() {
		initWindow();
	}

	private void initWindow() {
		window = new Window(title);
		window.add(this);
		window.pack();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
	}
}
