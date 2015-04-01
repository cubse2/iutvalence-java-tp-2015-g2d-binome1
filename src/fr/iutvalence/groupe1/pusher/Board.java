package fr.iutvalence.groupe1.pusher;

public class Board
{
	/*Constante taille plateau. */
	public final static int NUMBER_LINE_DEFAULT = 10;
	public final static int NUMBER_COLUMN_DEFAULT = 10;
	
	/*Tableau de case à 2 dimensions représentant le plateau. */
	private Case[][] board;
	
	/*
	 * Constructeur de la classe
	 * Génère un plateau de taille par défaut
	 */
	public Board()
	{
		this.board= new Case[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
		for(int i=0;i<NUMBER_LINE_DEFAULT;i++)
		{
			for(int j=0;j<NUMBER_COLUMN_DEFAULT;j++)
			{
				if(i>1 && i<=7 && j>1 && j<=7)
				{
					this.board[i][j] = new Case(i, j, new Floor());
				}
				else
				{
					this.board[i][j] = new Case(i, j, new Wall());
				}
				
			}
		}
	}
	
	/*
	 * Affiche le plateau sous forme de chaîne de caractères
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = " ";
		for(int i=0;i<NUMBER_LINE_DEFAULT;i++)
		{
			for(int j=0;j<NUMBER_LINE_DEFAULT;j++)
			{
				if(this.board[i][j].getElement().isSurmountable())
				{
					result = result + "   ";
				}
				else
				{
					result = result + " X ";
				}
			}
			result = result + " \n ";
		}
		return result;
	}
}
