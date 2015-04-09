package fr.iutvalence.adem.pusher.element;

/**
 * Mur sur le plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Wall extends Element {
    /* TODO JAVADOC. */
    private static final boolean IS_SURMOUNTABLE = false;

    /* TODO JAVADOC. */
    public Wall() {
        super(IS_SURMOUNTABLE);
    }
    
    public String toString(){
    	return " # ";
    }
}
