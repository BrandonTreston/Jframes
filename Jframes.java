//this program crates a GUI from scratch and draws a rectangle in it using the notes from 11/6/2017
//author @ BrandonTreston

import javax.swing.*;

public class Jframes {
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		final int frameWidth = 300;
		final int frameHeight = 400;
		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("Java Dad taught me to make this!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		}
}
