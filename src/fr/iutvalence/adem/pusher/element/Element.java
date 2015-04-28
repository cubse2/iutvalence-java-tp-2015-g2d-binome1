package fr.iutvalence.adem.pusher.element;

/* TODO Translate. */
/**
 * Modélisation d'un élément du plateau.
 *
 * @author TODO
 * @version TODO
 */
public abstract class Element
{
	/**
	 * if the element is surmountable or not.
	 */
	private final boolean surmountable;

	/* TODO JAVADOC. */
	protected Element(boolean smt)
	{
		this.surmountable = smt;
	}

	/* TODO JAVADOC. */
	public final boolean isSurmountable()
	{
		return surmountable;
	}

	public boolean isCharacter()
	{
		return false;
	}

	public boolean isEndPoint()
	{
		return false;
	}

	/* TODO Why provide a default toString in Element? */
	@Override
	public String toString()
	{
		return "";
	}
}
