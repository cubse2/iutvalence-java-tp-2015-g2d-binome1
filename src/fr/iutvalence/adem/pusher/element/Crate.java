package fr.iutvalence.adem.pusher.element;


/**
 * Modélisation d'une caisse sur le plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Crate extends Element {
    /* TODO Constructeur. */
    private static final boolean IS_SURMOUNTABLE = false;

    public Crate() {
        super(IS_SURMOUNTABLE);
    }
    
    public String toString(){
    	return " ¤ ";
    }
}
