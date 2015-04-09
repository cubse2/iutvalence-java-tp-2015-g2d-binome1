package fr.iutvalence.adem.pusher.element;

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

    /* TODO JAVADOC. */
    @Override
    public String toString(){
    	return " A ";
    }
}
