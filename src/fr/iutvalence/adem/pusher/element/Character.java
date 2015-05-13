package fr.iutvalence.adem.pusher.element;

/**
 * Character on the board.
 * @author anthony lafont | adem gurbuz
 */
public class Character extends Element{
    
	/**
     * The character is not surmountable
     */
    private static final boolean IS_SURMOUNTABLE = false;

    /**
     * The constructor
     */
    public Character() {
        super(IS_SURMOUNTABLE);
    }
    
    /**
     * return if the element is a character
     */
    public boolean isCharacter()
	{
		return true;
	}

    /**
     * String representation of the character
     */
    @Override
    public String toString(){
    	return " A ";
    }
}
