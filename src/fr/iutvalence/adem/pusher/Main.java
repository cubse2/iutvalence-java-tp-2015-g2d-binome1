package fr.iutvalence.adem.pusher;

import java.io.IOException;
import java.util.Scanner;

/**
 * the Main class
 * @author anthony lafont | adem gurbuz
 */
public class Main {

	private static Scanner selectLvL;

	/**
	 * Start of the game
	 * @param args
	 * @throws IOException 
	 */
    public static void main(String[] args) throws IOException {
    	
    	
		System.out.println("-----Sokoban-----");
		System.out.println("1: Beginner");
		System.out.println("2: Medium");
		System.out.println("3: Hard");
		System.out.println("4: Expert");
		System.out.println("5: PGM");
		System.out.println("Select your level(select number):");
		
		selectLvL = new Scanner(System.in);
		int lvlNumber = selectLvL.nextInt();
		
        final Game game = new Game(lvlNumber);
        game.start();
    }
}
