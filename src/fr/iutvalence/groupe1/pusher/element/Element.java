package fr.iutvalence.groupe1.pusher.element;

/* TODO Pourquoi abstract s'il n'y a pas de méthodes abstraites (ça ne veut pas dire que cette classe ne doivent pas être abstraite). */
/* TODO Pourquoi est-ce que surmountable est un paramètre du constructeur ? À discuter en séance, c'est une bonne idée mais pas sur cette visibilité. */
/* TODO Vous devriez réfléchir à un package pour les éléments. */
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
}
