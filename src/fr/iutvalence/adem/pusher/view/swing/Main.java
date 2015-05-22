package fr.iutvalence.adem.pusher.view.swing;

import java.awt.Component;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import fr.iutvalence.adem.pusher.model.LevelNumberException;

/**
 * the Main class
 * 
 * @author anthony lafont | adem gurbuz
 */
public class Main
{

	/**
	 * The maximum level available
	 */
	private static int levelMax = 1;

	/**
	 * Start of the game
	 * 
	 * @param args
	 * @throws IOException
	 * @throws LevelNumberException
	 */
	public static void main(String[] args) throws IOException,
			LevelNumberException
	{

		// Interface intermarche = new Interface();

		
		//SelectLevel levelFrame = new SelectLevel(this, "Select Level!", true, levelMax);
		int i = JOptionPane.showOptionDialog(
				null, "Test message", "Test titre", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null,
				new Component[]{
					new JButton("Option 1"),
					new JButton("Option 2")
				}, null);
		System.out.println(i);
		final Game game = new Game(levelMax, levelMax);
		game.play();
		levelMax++;
	}
	
	protected void startLevel(int level) {
		
	}
}
