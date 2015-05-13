package fr.iutvalence.adem.pusher;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * the Main class
 * @author anthony lafont | adem gurbuz
 */
public class Main {

	private static Scanner selectLvL;
	private static Scanner continu;
	private static char  charNewGame='y';
	private static int levelMax = 1;
	/**
	 * Start of the game
	 * @param args
	 * @throws IOException 
	 * @throws LevelNumberException 
	 * @throws WrongMoveException 
	 */
    public static void main(String[] args) throws IOException, LevelNumberException {
    	
    	int lvlNumber = 0;
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
					System.out.println("Select your level(select number):");
					selectLvL = new Scanner(System.in);	
					lvlNumber = selectLvL.nextInt();
				}
				catch(NoSuchElementException e){
					System.out.println("Number available (1-5)");
				}
			} while (lvlNumber>5 || lvlNumber<=0);
			
			try{
				final Game game = new Game(lvlNumber, levelMax);
				game.start();
				levelMax++;
			}
			catch(LevelNumberException e){
				System.out.println(e.getMessage());
			}
	        
	        continu = new Scanner(System.in);
	        System.out.println("New game? (y/n)");
	        String newGame = continu.nextLine();
	        charNewGame = newGame.charAt(0);
	        while (charNewGame != 'y' && charNewGame != 'Y' && charNewGame != 'n' && charNewGame != 'N')
	        {
        		System.out.println("New game? (y/n)");
	        	newGame = continu.nextLine();
		        charNewGame = newGame.charAt(0);
	        }
    	}
    }
}
