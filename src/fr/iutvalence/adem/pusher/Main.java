package fr.iutvalence.adem.pusher;

import java.io.IOException;

/**
 * the Main class
 * @author anthony lafont | adem gurbuz
 */
public class Main {

	/**
	 * Start of the game
	 * @param args
	 * @throws IOException 
	 */
    public static void main(String[] args) throws IOException {
        final Game game = new Game();
        game.start();
    }
}
