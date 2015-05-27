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

		JButton levelButton;
		String[] listButton = new String[5];
		
		for(int levelNumber=1; levelNumber<=5; levelNumber++ ){
				listButton[levelNumber-1] = "Level "+levelNumber;
		}
		
		int choice;
		
		do{
			choice = JOptionPane.showOptionDialog(
					null, "Select your level", "Selection level", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					listButton,
					listButton[0]);
			if(choice+1 > levelMax){
				JOptionPane.showMessageDialog(null, "Select lower level", "Error level", JOptionPane.ERROR_MESSAGE);
			}
		} while(choice+1 > levelMax);
		
		if (choice == -1){
			System.exit(0);
		}
		
		do{
			final Game game = new Game(choice+1, levelMax);
			game.play();
			levelMax++;
			choice = JOptionPane.showConfirmDialog (null, "Would You Like to continue?","Continue game", JOptionPane.YES_NO_OPTION);
		} while(choice != 1);
		
		//levelMax++;
	}
}
