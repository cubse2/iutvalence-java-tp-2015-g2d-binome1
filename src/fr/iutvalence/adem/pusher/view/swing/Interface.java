package fr.iutvalence.adem.pusher.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Interface extends JFrame
{
	  public Interface(){
		    this.setTitle("Sokoban");
		    this.setSize(700, 700);
		    this.setResizable(false);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

		    /**
		     * JButton reset
		     */
		    JButton reset = new JButton("Reset");
		    /**
		     * Label, text for the game.
		     */
		    JLabel sup = new JLabel("Welcome to Sokoban game!", JLabel.CENTER);
		    /**
		     * Panel inf
		     */
		    JPanel inf = new JPanel();
		    inf.setBackground(Color.ORANGE);
		    inf.setPreferredSize(new Dimension(700,658));
		    /**
		     * JSplitPane with reset button and the JLabel.
		     */
		    JSplitPane supSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sup, reset);
		    supSplit.setDividerSize(0);
		    reset.setMinimumSize(new Dimension(100,30));
		    sup.setPreferredSize(new Dimension(600,42));
		    /**
		     * Add the component to the Frame.
		     */
		    this.add(supSplit, BorderLayout.PAGE_START);
		    this.add(inf, BorderLayout.PAGE_END);
		    /**
		     * Set Visible...
		     */
		    this.setVisible(true);
		    
		    /**
		     * Display the first Dialog frame.
		     */
	  }
}
