package fr.iutvalence.adem.pusher;

/**
 * The exception when the player select high level. 
 * @author anthony lafont | adem gurbuz
 *
 */
public class LevelNumberException extends Exception{

	/**
	 * The constructor of the exception.
	 * @param message
	 */
	public LevelNumberException(String message){
		super(message);
	}
}
