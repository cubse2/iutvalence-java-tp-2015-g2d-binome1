package fr.iutvalence.adem.pusher.element;

/**
 * Sol du plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Floor extends Element {
    /* TODO JAVADOC. */
    private static final boolean IS_SURMOUNTABLE = true;

    /* TODO JAVADOC. */
    public Floor() {
        super(IS_SURMOUNTABLE);
    }

    /* TODO JAVADOC. */
    @Override
    public String toString(){
    	return "   ";
    }
}
