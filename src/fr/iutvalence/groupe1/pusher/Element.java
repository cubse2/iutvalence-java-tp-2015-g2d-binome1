package fr.iutvalence.groupe1.pusher;

/*
 * Classe commune a tous les éléments du plateau
 */
public abstract class Element
{
	private boolean surmountable;
	
	public Element(boolean smt)
	{
		this.surmountable = smt;
	}
	
	public boolean isSurmountable()
	{
		return surmountable;
	}
}
