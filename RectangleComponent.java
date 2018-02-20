
import java.awt.*;
import javax.swing.*;

public class RectangleComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(10,20,40,60);
		 /*
		  * something primitive comes in as type Graphics, and is translated
		  * by the cast into Graphics2D, to make it more complex.
		 */
		box.translate(15, 25);
		g2.draw(box);	
	}

}

