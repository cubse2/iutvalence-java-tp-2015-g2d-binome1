package fr.iutvalence.adem.pusher;

public class LevelNumberException extends Exception{

	public LevelNumberException(){
		
	}
	
	public String getMessage(){
		return "Level not available!";
	}
}
