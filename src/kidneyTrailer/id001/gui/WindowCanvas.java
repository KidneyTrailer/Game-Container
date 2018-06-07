package kidneyTrailer.id001.gui;

import java.awt.Canvas;

public class WindowCanvas extends Canvas {
	private static final long serialVersionUID = -5455911271341988653L;
	
	String title = null;
	Window window;
	
	public WindowCanvas() {
		initWindow();
	}

	private void initWindow() {
		Window window = new Window(title);
		window.add(this);
		window.pack();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
	}
}
