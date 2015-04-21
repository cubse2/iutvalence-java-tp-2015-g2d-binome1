package fr.iutvalence.adem.pusher.element;

/* TODO Translate. */
/**
 * Mur sur le plateau.
 *
 * @author TODO
 * @version TODO
 */
public class Wall extends Element {
    /* TODO JAVADOC. */
    private static final boolean IS_UNSURMOUNTABLE = false;

    /* TODO JAVADOC. */
    public Wall() {
        super(IS_UNSURMOUNTABLE);
    }

    /* TODO JAVADOC. */
    @Override
    public String toString() {
        return " # ";
    }
}
