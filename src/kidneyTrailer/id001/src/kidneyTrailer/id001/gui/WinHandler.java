package kidneyTrailer.id001.gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import kidneyTrailer.id001.Game;

public class WinHandler implements WindowListener {

	Game game;

	public WinHandler(Game game) {
		this.game = game;
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		game.getLoop().stop();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}
}
