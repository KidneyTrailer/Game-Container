package kidneyTrailer.id001.gfx;

public class Screen {

	int width, height;
	public int[] pixels;

	static final int RESTRICTED = 0xFFFF00FF;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void render(int xp, int yp, int w, int h, int flip, int[] p) {
		for (int y = 0; y < h; y++) {
			int ya = y + yp;
			int ys = ya;
			if (flip == 2 || flip == 3) {
				ys = (h - 1) - ya;
			}
			for (int x = 0; x < w; x++) {
				int xa = x + xp;
				int xs = xa;
				if (flip == 1 || flip == 3) {
					xs = (w - 1) - xa;
				}
				int col = p[x + y * w];
				if (xa < 0 || ya < 0 || xa >= width || ya >= height) {
					continue;
				}
				if (col != RESTRICTED) {
					pixels[xs + ys * width] = col;
				}
			}
		}
	}
}
