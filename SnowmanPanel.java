import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class SnowmanPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics snowman) {

		final int MID = 150;
		final int TOP = 50;

		

		snowman.setColor(Color.blue);
		snowman.fillRect(0, 175, 300, 50); // Ground

		snowman.setColor(Color.yellow);
		snowman.fillOval(-40, -40, 80, 80); // Sun

		snowman.setColor(Color.white);
		snowman.fillOval(MID - 20, TOP, 40, 40); // Head
		snowman.fillOval(MID - 35, TOP + 35, 70, 50); // Upper Body
		snowman.fillOval(MID - 50, TOP + 80, 100, 60); // Lower Body

		snowman.setColor(Color.black);
		snowman.fillOval(MID - 10, TOP + 10, 5, 5); // Left Eye
		snowman.fillOval(MID + 5, TOP + 10, 5, 5); // Right Eye

		snowman.drawArc(MID - 10, TOP + 20, 20, 10, 190, 160); // Smile

		snowman.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40); // Left Arm
		snowman.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60); // Right Arm

		snowman.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5); // Brim of Hat
		snowman.fillRect(MID - 15, TOP - 20, 30, 25); // Top of Hat

	}

}
