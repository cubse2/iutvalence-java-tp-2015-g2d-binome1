package fr.iutvalence.groupe1.pusher;

/* TODO JAVADOC. */
public class Case {
    /* TODO Pourquoi retenir la position dans la case ? N'est-ce pas fourni par le tableau de la Board ? */
    /* TODO JAVADOC. */
    private final int     x;
    /* TODO JAVADOC. */
    private final int     y;
    /* TODO JAVADOC. */
    private Element element;

    /* TODO JAVADOC. */
    public Case(int cX, int cY, Element element) {
        this.x = cX;
        this.y = cY;
        this.element = element;
    }

    public Element getElement() {
        return element;
    }
}
