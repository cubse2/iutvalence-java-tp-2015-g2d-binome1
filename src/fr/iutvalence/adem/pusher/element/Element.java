package fr.iutvalence.adem.pusher.element;

/* TODO Translate. */
/**
 * Modélisation d'un élément du plateau.
 *
 * @author TODO
 * @version TODO
 */
public abstract class Element {
    /* TODO JAVADOC. */
    private final boolean surmountable;

    /* TODO JAVADOC. */
    protected Element(boolean smt) {
        this.surmountable = smt;
    }

    /* TODO JAVADOC. */
    public final boolean isSurmountable() {
        return surmountable;
    }

    /* TODO Why provide a default toString in Element? */
    @Override
    public String toString() {
        return "";
    }
}
