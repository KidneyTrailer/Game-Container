package kidneyTrailer.id001.utilities;

import kidneyTrailer.id001.Game;

public class Loop implements Runnable {

	boolean running;
	Game game;
	Thread gameLoop;
	
	public Loop(Game game) {
		this.game = game;
		running = false;
	}
	
	public synchronized void start() {
		if (running) return;
		running = true;
		gameLoop = new Thread(this, "Main");
		gameLoop.start();
	}
	
	public synchronized void stop() {
		try {
			if (!running) return;
			running = false;
			gameLoop.join();
		} catch (InterruptedException ex) {}
	}

	@Override
	public void run() {
		int frames = 0, ticks = 0;
		double ns = 1000000000D / 60D, delta = 0;
		long now, lastTime = System.nanoTime(), timer = System.currentTimeMillis();
		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;

			while (delta >= 1) {
				delta--;
				ticks++;
				game.tick();
			}
			
			frames++;
			game.render();
			
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames + ", TPS: " + ticks);
				frames = 0;
				ticks = 0;
			}
		}
	}

}
