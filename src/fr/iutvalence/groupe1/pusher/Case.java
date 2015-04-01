package fr.iutvalence.groupe1.pusher;

public class Case
{
	
	private final int x;
	private final int y;
	private Element element;
	

	/*
	 * 
	 */
	public Case(int cX, int cY, Element element)
	{
		this.x = cX;
		this.y = cY;
		this.element = element;
	}
	
	public Element getElement()
	{
		return element;
	}
}
