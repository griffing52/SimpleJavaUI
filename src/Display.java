import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {
	public final int fps = 60;

	public final int width;
	public final int height;

    public int iteration = 0;
	
	Display(int width_, int height_, int fps_) {
		width = width_;
        height = height_;
		// lastUpdate = System.currentTimeMillis();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); // cleans screen
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		// if (iteration % 1000 == 0)
		// 	target.add(Vector.random().mult(5));

		// g2d.setColor(Color.BLACK);
		// g2d.fillRect((int) target.x, (int) target.y, target.length, target.height);
		// g2d.fillOval(x, y, 30, 30);
		iteration++;
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Learning Simulation");
		Display display = new Display();
		frame.add(display);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			display.repaint();
		while (true) {
			Thread.sleep(1000/fps);
			// Thread.sleep(1);
		}
	}
}