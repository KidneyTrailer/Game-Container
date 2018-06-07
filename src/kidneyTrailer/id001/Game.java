package kidneyTrailer.id001;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import kidneyTrailer.id001.constants.GameType;
import kidneyTrailer.id001.gui.Window;
import kidneyTrailer.id001.gui.WindowCanvas;

public class Game extends WindowCanvas {
	private static final long serialVersionUID = -990809137905111315L;
	
	BufferedImage gameBackground = new BufferedImage(Window.width, Window.height, BufferedImage.TYPE_INT_RGB);
	int[] gamePixels = ((DataBufferInt) gameBackground.getRaster().getDataBuffer()).getData();
	
	public Game() {
		super();
	}

	public void tick() {}
	
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
}
