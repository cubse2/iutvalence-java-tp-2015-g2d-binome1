package fr.iutvalence.groupe1.pusher.element;

/**
 * Sol du plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Floor extends Element {
    /* TODO JAVADOC. */
    private static final boolean IS_SURMOUNTABLE = true;

    public Floor() {
        super(IS_SURMOUNTABLE);
    }
    
    public String toString(){
    	return "   ";
    }
}
