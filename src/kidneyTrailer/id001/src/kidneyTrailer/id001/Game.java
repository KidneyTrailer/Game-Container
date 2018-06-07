package kidneyTrailer.id001;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import kidneyTrailer.id001.constants.GameType;
import kidneyTrailer.id001.gui.WinHandler;
import kidneyTrailer.id001.gui.Window;
import kidneyTrailer.id001.gui.WindowCanvas;
import kidneyTrailer.id001.utilities.Loop;

public class Game extends WindowCanvas {
	private static final long serialVersionUID = -990809137905111315L;

	BufferedImage gameBackground = new BufferedImage(Window.width, Window.height, BufferedImage.TYPE_INT_RGB);
	int[] gamePixels = ((DataBufferInt) gameBackground.getRaster().getDataBuffer()).getData();

	Loop loop;
	WinHandler wHandler;

	public Game() {
		super();
		init();
	}

	private void init() {
		loop = new Loop(this);
		wHandler = new WinHandler(this);

		window.addWindowListener(wHandler);
		loop.start();
	}

	public void tick() {
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(GameType.TwoD.getID());
			return;
		}

		Graphics g = bs.getDrawGraphics();
		g.drawImage(gameBackground, 0, 0, getWidth(), getHeight(), this);

		g.dispose();
		bs.show();
	}

	public Loop getLoop() {
		return loop;
	}

	public static void main(String[] args) {
		new Game();
	}
}
