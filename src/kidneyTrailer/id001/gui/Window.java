package kidneyTrailer.id001.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame{
	private static final long serialVersionUID = 5756113123510827956L;
	
	public static int width = 360;
	public static int height = width * 9 / 16;
	private static int scale = 3;
	
	public static final int WIDTH = width * scale;
	public static final int HEIGHT = height * scale;

	public Window(String title) {
		super(title);
		
		Dimension size = new Dimension(WIDTH, HEIGHT);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setResizable(false);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
