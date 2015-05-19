package fr.iutvalence.adem.pusher.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
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
		     * Panel Sup
		     */
		    JPanel sup = new JPanel();
		    sup.setBackground(Color.BLUE);
		    /**
		     * Panel inf
		     */
		    JPanel inf = new JPanel();
		    inf.setBackground(Color.ORANGE);
		    inf.setPreferredSize(new Dimension(700,658));
		    
		    JSplitPane supSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sup, reset);
		    supSplit.setDividerSize(0);
		    reset.setMinimumSize(new Dimension(100,30));
		    sup.setPreferredSize(new Dimension(600,42));
		    
		    this.add(supSplit, BorderLayout.PAGE_START);
		    this.add(inf, BorderLayout.PAGE_END);

		    
		    
		    
		    


		    
		    this.setVisible(true);
	  }
}
