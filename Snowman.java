import java.awt.Color;
import javax.swing.*;


public class Snowman {
	public static void main(String[] args) {
		SnowmanFrame frame = new SnowmanFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SnowmanFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SnowmanFrame() {
		setTitle("Snowman At The GUC!");
		setSize(350, 350);
		setBackground(Color.cyan);

		SnowmanPanel panel = new SnowmanPanel();
		getContentPane().add(panel);
	}

	
}


