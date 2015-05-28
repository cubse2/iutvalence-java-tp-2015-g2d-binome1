package fr.iutvalence.adem.pusher.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.adem.pusher.model.Board;
import fr.iutvalence.adem.pusher.model.Position;
import fr.iutvalence.adem.pusher.model.element.Element;

public class Interface extends JFrame implements KeyListener
{
	private JPanel boardFrame;
	private KeyEvent key;
	
	public Interface(int level){
		  
		  this.setTitle("Sokoban");
		  this.setSize(640, 713);
		  this.setResizable(false);
		  this.setLocationRelativeTo(null);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

		  /**
		   * JButton reset
		   */
		  //JButton reset = new JButton("Reset");
		  /**
		   * Label, text for the game.
		   */
		  JLabel sup = new JLabel("Level "+level, JLabel.CENTER);
		  /**
		   * Panel inf
		   */
		  JPanel inf = new JPanel();
		  inf.addKeyListener(this);
		  inf.setFocusable(true);
		  inf.requestFocus();
		  this.boardFrame = inf;
		  /**
		   * JSplitPane with reset button and the JLabel.
		   */
		  //JSplitPane supSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sup, reset);
		  //supSplit.setDividerSize(0);
		  //reset.setMinimumSize(new Dimension(100,30));
		  sup.setPreferredSize(new Dimension(540,42));
		  /**
		   * Add the component to the Frame.
		   */
		  //this.add(supSplit, BorderLayout.PAGE_START);
		  this.add(inf, BorderLayout.PAGE_END);
		  /**
		   * Set Visible...
		   */
		  this.setVisible(true);
		   
		  /**
		   * Display the first Dialog frame.
		   */
	}
	  

	public void actualise(Board board)
	{
		int size = board.getBoard().length;
		ImageIcon img;
		this.boardFrame.setLayout(new GridLayout(size, size, 0, 0));
		JLabel box;
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if(board.getElement(new Position(i,j)).isCharacter()){
					img = new ImageIcon("sprite/character.png");
				} else if(board.getElement(new Position(i,j)).isCrate()){
					img = new ImageIcon("sprite/crate.png");
				} else if(board.getElement(new Position(i,j)).isEndPoint()){
					img = new ImageIcon("sprite/endPoint.png");
				} else if(board.getElement(new Position(i,j)).isSurmountable()){
					img = new ImageIcon("sprite/ground.png");
				} else{
					img = new ImageIcon("sprite/wall.png");
				}
				box = new JLabel(img);
				box.setPreferredSize(new Dimension(64,64));
				this.boardFrame.add(box);
			}
		}
		this.setVisible(true);
	}


	@Override
    public void keyPressed(KeyEvent e) {
        this.key = e;
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}


	public KeyEvent getKey()
	{
		return key;
	}
	
	

}
