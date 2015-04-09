package fr.iutvalence.groupe1.pusher.element;

/**
 * Personnage sur le plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Character extends Element{
    /* TODO Constructeur. */
    private static final boolean IS_SURMOUNTABLE = false;

    public Character() {
        super(IS_SURMOUNTABLE);
    }
    
    public String toString(){
    	return " A ";
    }
    
}
