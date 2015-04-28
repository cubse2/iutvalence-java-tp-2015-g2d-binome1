package fr.iutvalence.adem.pusher.element;

/* TODO Translate. */
/**
 * Personnage sur le plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Character extends Element{
    /* TODO Constructeur. */
    private static final boolean IS_SURMOUNTABLE = false;

    /* TODO JAVADOC. */
    public Character() {
        super(IS_SURMOUNTABLE);
    }
    
    public boolean isCharacter()
	{
		return true;
	}

    /* TODO JAVADOC. */
    @Override
    public String toString(){
    	return " A ";
    }
}
