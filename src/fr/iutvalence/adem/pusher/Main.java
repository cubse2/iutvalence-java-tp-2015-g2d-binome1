package fr.iutvalence.adem.pusher;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * the Main class
 * @author anthony lafont | adem gurbuz
 */
public class Main {

	/**
	 * The maximum level available
	 */
	private static int levelMax = 1;
	/**
	 * Start of the game
	 * @param args
	 * @throws IOException 
	 * @throws LevelNumberException 
	 */
    public static void main(String[] args) throws IOException, LevelNumberException {
    	
    	int lvlNumber = 0;
    	char charNewGame = 'y';
    	Scanner choiceOfPlayer = new Scanner(System.in);
    	while(charNewGame == 'y' || charNewGame == 'Y')
    	{
			System.out.println("-----Sokoban-----");
			System.out.println("1: Beginner");
			System.out.println("2: Medium");
			System.out.println("3: Hard");
			System.out.println("4: Expert");
			System.out.println("5: PGM");
			
			do {
				try{
					choiceOfPlayer = new Scanner(System.in);
					System.out.println("Select your level(select number):");
					lvlNumber = choiceOfPlayer.nextInt();
				}
				catch(NoSuchElementException e){
					System.out.println("Number available (1-5)");
				}
			} while (lvlNumber>5 || lvlNumber<=0);
			
			try{
				final Game game = new Game(lvlNumber, levelMax);
				game.play();
				levelMax++;
			}
			catch(LevelNumberException e){
				System.out.println(e.getMessage());
			}
	        
	        
	        do{
	        	choiceOfPlayer = new Scanner(System.in);
		        System.out.println("New game? (y/n)");
		        String newGame = choiceOfPlayer.nextLine();
		        charNewGame = newGame.charAt(0);
	        } while (charNewGame != 'y' && charNewGame != 'Y' && charNewGame != 'n' && charNewGame != 'N');
    	}
    }
}
